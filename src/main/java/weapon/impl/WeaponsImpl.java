package weapon.impl;

import enums.Weapon;
import weapon.Weapons;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public class WeaponsImpl implements Weapons {

    private Weapon weaponType;

    private Weapon[] defeatingWeapons;

    public WeaponsImpl(Weapon weaponType, Weapon... defeatingWeapons) {
        this.weaponType = weaponType;
        this.defeatingWeapons = defeatingWeapons;
    }

    public Optional<Weapon> compareWeapons(final Weapon weapon) {
        return Arrays.stream(defeatingWeapons).filter(e -> e.equals(weapon)).findAny();
    }

    @Override
    public Weapon getWeaponType() {
        return this.weaponType;
    }
}
