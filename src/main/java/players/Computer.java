package players;

import weaponfctry.WeaponFactory;

/**
 * Created by chetan on 30.11.2017.
 */
public class Computer extends Players {

    public Computer(WeaponFactory weaponFactory) {
        super(weaponFactory);
    }
    @Override
    public void getUserDetails() {
        setName("Computer");
    }

    @Override
    public void selectWeapon() {

    }
}
