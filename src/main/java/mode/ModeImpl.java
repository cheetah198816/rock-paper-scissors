package mode;

import enums.PlayMode;
import players.Players;

/**
 * Created by chetan on 30.11.2017.
 */
public class ModeImpl implements Mode {

    private PlayMode playMode;

    private Players[] players;

    public ModeImpl(PlayMode playMode, Players... players) {
        this.playMode = playMode;
        this.players = players;
    }

    @Override
    public Players[] getPlayers() {
        return this.players;
    }
}
