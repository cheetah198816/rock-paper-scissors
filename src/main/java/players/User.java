package players;

import enums.Weapon;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by chetan on 30.11.2017.
 */
public class User extends Players {

    @Override
    public void getUserDetails() {
        System.out.println("Please enter your name");
        final Scanner scanner = new Scanner(System.in);
        final String userName = scanner.nextLine();
        setName(userName);
    }

    @Override
    public Optional<Weapon> selectWeapon() {
        final Scanner scanner = new Scanner(System.in);
        final int weaponType = scanner.nextInt();
        return Weapon.of(weaponType);
    }
}
