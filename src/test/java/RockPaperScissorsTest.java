import enums.PlayMode;
import enums.Weapon;
import mode.Mode;
import modefactory.ModeFactory;
import modefactory.impl.ModeFactoryImpl;
import org.junit.Test;
import players.Players;
import weapon.Weapons;
import weaponfctry.WeaponFactory;
import weaponfctry.impl.WeaponFactoryImpl;

import java.util.Optional;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Created by chetan on 02.12.2017.
 */
public class RockPaperScissorsTest {

    private WeaponFactory weaponFactory = new WeaponFactoryImpl();

    private ModeFactory modeFactory = new ModeFactoryImpl();

    @Test
    public void test_weapon_is_present() {
        Optional<Weapon> weaponType = Weapon.of(1);

        assertThat(weaponType.isPresent()).isTrue();
        assertThat(weaponType.get()).isEqualTo(Weapon.PAPER);

        Weapons weapons = weaponFactory.getWeapon(weaponType.get());

        assertThat(weapons).isNotNull();
    }

    @Test
    public void test_weapon_is_not_present() {
        Optional<Weapon> weaponType = Weapon.of(6);

        assertThat(weaponType.isPresent()).isFalse();
    }

    @Test
    public void test_mode_is_present() {
        Optional<PlayMode> playMode = PlayMode.of(1);

        assertThat(playMode.isPresent()).isTrue();
        assertThat(playMode.get()).isEqualTo(PlayMode.PLAYER_VS_COMPUTER);

        Mode mode = modeFactory.getMode(playMode.get());

        assertThat(mode).isNotNull();
    }

    @Test
    public void test_mode_is_not_present() {
        Optional<PlayMode> playMode = PlayMode.of(4);

        assertThat(playMode.isPresent()).isFalse();
    }

    @Test
    public void test_win_tie() {
        Players playerOne = TestHelper.createPlayerWithWeapon("playerOne", Weapon.PAPER);
        Players playerTwo = TestHelper.createPlayerWithWeapon("playerTwo", Weapon.PAPER);
        boolean checkWin = playerOne.checkWin(playerTwo);

        assertThat(checkWin).isFalse();
    }

    @Test
    public void test_win_player_one_win() {
        Players playerOne = TestHelper.createPlayerWithWeapon("playerOne", Weapon.PAPER);
        Players playerTwo = TestHelper.createPlayerWithWeapon("playerTwo", Weapon.ROCK);
        boolean checkWin = playerOne.checkWin(playerTwo);

        assertThat(checkWin).isTrue();
    }

    @Test
    public void test_win_player_two_win() {
        Players playerOne = TestHelper.createPlayerWithWeapon("playerOne", Weapon.ROCK);
        Players playerTwo = TestHelper.createPlayerWithWeapon("playerTwo", Weapon.PAPER);
        boolean checkWin = playerOne.checkWin(playerTwo);

        assertThat(checkWin).isFalse();
    }
}
