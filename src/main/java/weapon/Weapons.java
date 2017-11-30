package weapon;

import enums.Weapon;

import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public interface Weapons {
    Optional<Weapon> compareWeapons(Weapon weapon);

    Weapon getWeaponType();
}
