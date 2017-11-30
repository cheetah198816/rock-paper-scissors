package weaponfctry.impl;

import enums.Weapon;
import weapon.Weapons;
import weapon.impl.WeaponsImpl;
import weaponfctry.WeaponFactory;

/**
 * Created by chetan on 30.11.2017.
 */
public class WeaponFactoryImpl implements WeaponFactory {

    public Weapons getWeapon(Weapon type) {
        switch (type) {
            case ROCK: return new WeaponsImpl(type, Weapon.PAPER);
            case PAPER: return new WeaponsImpl(type, Weapon.SCISSORS);
            default: return new WeaponsImpl(type, Weapon.ROCK);
        }
    }
}
