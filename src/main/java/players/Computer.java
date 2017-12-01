package players;

import enums.Weapon;

import java.util.Optional;
import java.util.Random;

/**
 * Created by chetan on 30.11.2017.
 */
public class Computer extends Players {

    public static final Integer NUMBER_OF_WEAPONS = 3;

    private Random randomGenerator = new Random();

    private String computerName;

    public Computer(String computerName) {
        this.computerName = computerName;
    }
    @Override
    public void getUserDetails() {
        setName(computerName);
    }

    @Override
    public Optional<Weapon> selectWeapon() {
        int weaponId = randomGenerator.nextInt(NUMBER_OF_WEAPONS) + 1;
        return Weapon.of(weaponId);
    }
}
