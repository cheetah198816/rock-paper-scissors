package players;

import enums.Weapon;
import weaponfctry.WeaponFactory;

import java.util.Optional;
import java.util.Scanner;

/**
 * Created by chetan on 30.11.2017.
 */
public class User extends Players {

    public User(WeaponFactory weaponFactory) {
        super(weaponFactory);
    }

    @Override
    public void getUserDetails() {
        System.out.println( "Please enter your name");
        Scanner scanner = new Scanner(System.in);
        String userName = scanner.nextLine();
        setName(userName);
    }

    @Override
    public void selectWeapon() {
        System.out.println("Please select weapon");
        Scanner scanner = new Scanner(System.in);
        int weaponType = scanner.nextInt();
        Optional<Weapon> weapon = Weapon.of(weaponType);
        if (weapon.isPresent()) {

        }
    }
}
