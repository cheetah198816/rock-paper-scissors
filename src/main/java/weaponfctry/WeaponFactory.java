package weaponfctry;

import enums.Weapon;
import weapon.Weapons;

/**
 * Created by chetan on 30.11.2017.
 */
public interface WeaponFactory {
    Weapons getWeapon(Weapon type);
}
