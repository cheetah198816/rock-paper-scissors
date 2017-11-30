import enums.PlayMode;
import mode.Mode;
import modefactory.ModeFactory;
import modefactory.impl.ModeFactoryImpl;
import players.Players;
import weaponfctry.impl.WeaponFactoryImpl;

import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

/**
 * Created by chetan on 30.11.2017.
 */
public class GameImpl implements Game {

    private ModeFactory modeFactory;

    public GameImpl(ModeFactory modeFactory) {
        this.modeFactory = modeFactory;
    }

    @Override
    public void startGame() {
        String decision;
        do {
            System.out.println("Please select the mode");
            Arrays.stream(PlayMode.values()).forEach(e -> System.out.println(e.getMode() + " " + e.getDescription()));
            Scanner modeScanner = new Scanner(System.in);
            int mode = modeScanner.nextInt();
            Optional<PlayMode> playMode = PlayMode.of(mode);
            if (playMode.isPresent()) {
                Mode modeObject = modeFactory.getMode(playMode.get());
                Players[] players = modeObject.getPlayers();
                Players playerOne = setPlayers(players[0]);
                Players playerTwo = setPlayers(players[1]);
                playerOne.checkWin(playerTwo);
            }
            System.out.println("Do you want to play another game?(y/n)");
            Scanner scanner = new Scanner(System.in);
            decision = scanner.nextLine();
        } while (decision.equals("y"));
    }

    public static void main(String [] args) {
        Game game = new GameImpl(new ModeFactoryImpl(new WeaponFactoryImpl()));
        game.startGame();
    }

    public Players setPlayers(Players player) {
        player.getUserDetails();
        System.out.println("Player : " + player.getName());
        return player;
    }
}
