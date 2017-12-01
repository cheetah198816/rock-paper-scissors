package modefactory.impl;

import enums.PlayMode;
import mode.Mode;
import mode.ModeImpl;
import modefactory.ModeFactory;
import players.Computer;
import players.User;
import weaponfctry.WeaponFactory;

/**
 * Created by chetan on 30.11.2017.
 */
public class ModeFactoryImpl implements ModeFactory {

    @Override
    public Mode getMode(PlayMode mode) {
        switch (mode) {
            case COMPUTER_VS_COMPUTER: return new ModeImpl(mode, new Computer(), new Computer());
            case PLAYER_VS_COMPUTER: return new ModeImpl(mode, new User(), new Computer());
            default : return new ModeImpl(mode, new User(), new User());
        }
    }
}
