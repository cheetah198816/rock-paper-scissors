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
            case ROCK: return new WeaponsImpl(type, Weapon.PAPER, Weapon.SPOCK);
            case PAPER: return new WeaponsImpl(type, Weapon.SCISSORS, Weapon.LIZARD);
            case LIZARD: return new WeaponsImpl(type, Weapon.SCISSORS, Weapon.ROCK);
            case SPOCK: return new WeaponsImpl(type, Weapon.PAPER, Weapon.LIZARD);
            default: return new WeaponsImpl(type, Weapon.ROCK, Weapon.SPOCK);
        }
    }
}
