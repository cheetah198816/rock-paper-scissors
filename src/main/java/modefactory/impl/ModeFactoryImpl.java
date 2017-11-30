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

    private WeaponFactory weaponFactory;

    public ModeFactoryImpl(WeaponFactory weaponFactory) {
        this.weaponFactory = weaponFactory;
    }

    @Override
    public Mode getMode(PlayMode mode) {
        switch (mode) {
            case COMPUTER_VS_COMPUTER: return new ModeImpl(mode, new Computer(weaponFactory), new Computer(weaponFactory));
            case PLAYER_VS_COMPUTER: return new ModeImpl(mode, new User(weaponFactory), new Computer(weaponFactory));
            default : return new ModeImpl(mode, new User(weaponFactory), new User(weaponFactory));
        }
    }
}
