package players;

import enums.Weapon;
import weapon.Weapons;
import weaponfctry.WeaponFactory;

import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public abstract class Players {

    public WeaponFactory getWeaponFactory() {
        return weaponFactory;
    }

    private WeaponFactory weaponFactory;

    public Players(WeaponFactory weaponFactory) {
        this.weaponFactory = weaponFactory;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private String name;

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    private Weapons weapon;

    public abstract void getUserDetails();

    public abstract void selectWeapon();

    public void checkWin(Players playerTwo) {
        Optional<Weapon> weapon = this.getWeapon().compareWeapons(playerTwo.getWeapon().getWeaponType());
        if(weapon.isPresent()) {
            System.out.println(playerTwo.getName() + " wins over " + this.getName());
        } else {
            System.out.println(this.getName() + " wins over " + playerTwo.getName());
        }
    }
}
