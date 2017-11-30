package enums;

import java.util.Arrays;
import java.util.Optional;

/**
 * Created by chetan on 29.11.2017.
 */
public enum Weapon {
    PAPER(1, "Paper"), SCISSORS(2, "Scissors"), ROCK(3, "Rock");

    private int id;

    public int getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    private String description;

    Weapon(int id , String description) {
        this.id = id;
        this.description = description;
    }

    public static Optional<Weapon> of(int id) {
        return Arrays.stream(values()).filter(weapon -> weapon.getId() == id).findAny();
    }

}
