package mode;

import players.Players;

/**
 * Created by chetan on 30.11.2017.
 */
public interface Mode {

    /**
     * fetches the players in a particular mode.
     * @return array of players.
     */
    Players[] getPlayers();
}
