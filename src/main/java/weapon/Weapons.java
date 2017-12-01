package weapon;

import enums.Weapon;

import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public interface Weapons {

    /**
     * checks if the weapon exists in the defeating weapons list.
     * @param weapon weapon to check for existence.
     * @return weapon if it exists.
     */
    Optional<Weapon> compareWeapons(Weapon weapon);

    /**
     * fetches the weapon type.
     * @return weapon
     */
    Weapon getWeaponType();
}
