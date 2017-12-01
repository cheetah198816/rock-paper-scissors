package players;

import enums.Weapon;

import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public class Computer extends Players {

    @Override
    public void getUserDetails() {
        setName("Computer");
    }

    @Override
    public Optional<Weapon> selectWeapon() {
        return null;
    }
}
