import enums.Weapon;
import players.Players;
import players.User;
import weapon.Weapons;
import weaponfctry.WeaponFactory;
import weaponfctry.impl.WeaponFactoryImpl;

/**
 * Created by chetan on 02.12.2017.
 */
public class TestHelper {

    private static WeaponFactory weaponFactory = new WeaponFactoryImpl();

    public static Players createPlayerWithWeapon(String playerName, Weapon weapon) {
        Players players = new User();
        players.setName(playerName);
        Weapons weapons = weaponFactory.getWeapon(weapon);
        players.setWeapon(weapons);
        return players;
    }
}
