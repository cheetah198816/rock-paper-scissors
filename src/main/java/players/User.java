package players;

import enums.Weapon;
import weapon.Weapons;
import weaponfctry.WeaponFactory;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by chetan on 30.11.2017.
 */
public class User extends Players {

    @Override
    public void getUserDetails() {
        System.out.println( "Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        setName(userName);
    }

    @Override
    public Optional<Weapon> selectWeapon() {
        Scanner scanner = new Scanner(System.in);
        int weaponType = scanner.nextInt();
        return Weapon.of(weaponType);
    }
}
