package enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by chetan on 29.11.2017.
 */
public enum PlayMode {
    PLAYER_VS_COMPUTER(1, "Player vs. Computer"),
    PLAYER_VS_PLAYER(2, "Player vs. Player"),
    COMPUTER_VS_COMPUTER(3, "Computer vs. Computer");

    private Integer mode;

    private String description;

    PlayMode(Integer mode, String description) {
        this.mode = mode;
        this.description = description;
    }

    public Integer getMode() {
        return mode;
    }

    public String getDescription() {
        return description;
    }

    public static Optional<PlayMode> of(int mode) {
        return Arrays.stream(values()).filter(playMode -> playMode.getMode().equals(mode)).findAny();
    }
}
