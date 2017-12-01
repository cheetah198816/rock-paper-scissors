package weaponfctry;

import enums.Weapon;
import weapon.Weapons;

/**
 * Created by chetan on 30.11.2017.
 */
public interface WeaponFactory {

    /**
     * fetches the Weapon according to the weapon type.
     * @param type type of the weapon
     * @return weapons object.
     */
    Weapons getWeapon(Weapon type);
}
