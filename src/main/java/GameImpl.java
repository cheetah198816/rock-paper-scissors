import enums.PlayMode;
import enums.Weapon;
import mode.Mode;
import modefactory.ModeFactory;
import modefactory.impl.ModeFactoryImpl;
import players.Players;
import weapon.Weapons;
import weaponfctry.WeaponFactory;
import weaponfctry.impl.WeaponFactoryImpl;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;

/**
 * Created by chetan on 30.11.2017.
 */
public class GameImpl implements Game {

    private ModeFactory modeFactory;

    private WeaponFactory weaponFactory;

    public GameImpl(ModeFactory modeFactory, WeaponFactory weaponFactory) {
        this.modeFactory = modeFactory;
        this.weaponFactory = weaponFactory;
    }

    @Override
    public void startGame() {
        String decision;
        do {
            try {
                System.out.println("Please select the mode");
                Arrays.stream(PlayMode.values()).forEach(e -> System.out.println(e.getMode() + " " + e.getDescription()));
                Scanner modeScanner = new Scanner(System.in);
                int mode = modeScanner.nextInt();
                Optional<PlayMode> playMode = PlayMode.of(mode);
                if (playMode.isPresent()) {
                    Mode modeObject = modeFactory.getMode(playMode.get());
                    Players[] players = modeObject.getPlayers();
                    Arrays.stream(players).forEach(player -> setPlayers(player));
                    players[0].checkWin(players[1]);
                } else {
                    System.out.println("Wrong Mode Selected.Game Ends.");
                }
            } catch (InputMismatchException exception) {
                System.out.println("Wrong Input.Game Ends.");
            }
            System.out.println("Do you want to play another game?(y/n)");
            Scanner scanner = new Scanner(System.in);
            decision = scanner.nextLine();
        } while (decision.equals("y"));
    }

    public static void main(String[] args) {
        Game game = new GameImpl(new ModeFactoryImpl(), new WeaponFactoryImpl());
        game.startGame();
    }

    public Players setPlayers(Players player) {
        player.getUserDetails();
        System.out.println("Player : " + player.getName());
        System.out.println("Please select the weapon below :");
        Arrays.stream(Weapon.values()).forEach(weapon -> System.out.println(weapon.getId() + " " + weapon.getDescription()));
        Optional<Weapon> weapon = player.selectWeapon();
        if (weapon.isPresent()) {
            System.out.println(player.getName() + " selected " + weapon.get().getDescription());
            Weapons weapons = weaponFactory.getWeapon(weapon.get());
            player.setWeapon(weapons);
        }
        return player;
    }
}
