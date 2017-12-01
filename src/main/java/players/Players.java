package players;

import enums.Weapon;
import weapon.Weapons;

import java.util.Optional;

/**
 * Created by chetan on 30.11.2017.
 */
public abstract class Players {

    private String name;

    private Weapons weapon;

    /**
     * Gets the user details like name.
     */
    public abstract void getUserDetails();

    /**
     * selects the weapon for the current user.
     * @return optional weapon
     */
    public abstract Optional<Weapon> selectWeapon();

    /**
     * Checks the win of the current player with the second player.
     * @param playerTwo playerTwo object
     */
    public void checkWin(Players playerTwo) {
        if (this.getWeapon() != null && playerTwo.getWeapon() != null) {
            if (!this.getWeapon().getWeaponType().equals(playerTwo.getWeapon().getWeaponType())) {
                Optional<Weapon> weapon = this.getWeapon().compareWeapons(playerTwo.getWeapon().getWeaponType());
                if (weapon.isPresent()) {
                    System.out.println(playerTwo.getName() + " wins over " + this.getName());
                } else {
                    System.out.println(this.getName() + " wins over " + playerTwo.getName());
                }
            } else {
                System.out.println("Its a tie!!!!!!!!!!!!!!");
            }
        } else {
            System.out.println("Wrong Weapon selected.Game Ends.");
        }
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
