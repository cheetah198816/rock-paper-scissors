package modefactory.impl;

import enums.PlayMode;
import mode.Mode;
import mode.ModeImpl;
import modefactory.ModeFactory;
import players.Computer;
import players.User;

/**
 * Created by chetan on 30.11.2017.
 */
public class ModeFactoryImpl implements ModeFactory {

    public static final String COMPUTER_NAME = "Computer";

    public static final String COMPUTER_PLAYER_NAME_ONE = "Computer One";

    public static final String COMPUTER_PLAYER_NAME_TWO = "Computer Two";

    @Override
    public Mode getMode(PlayMode mode) {
        switch (mode) {
            case COMPUTER_VS_COMPUTER: return new ModeImpl(mode, new Computer(COMPUTER_PLAYER_NAME_ONE), new Computer(COMPUTER_PLAYER_NAME_TWO));
            case PLAYER_VS_COMPUTER: return new ModeImpl(mode, new User(), new Computer(COMPUTER_NAME));
            default : return new ModeImpl(mode, new User(), new User());
        }
    }
}
