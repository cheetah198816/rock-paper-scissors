package modefactory;

import enums.PlayMode;
import mode.Mode;

/**
 * Created by chetan on 30.11.2017.
 */
public interface ModeFactory {
   Mode getMode(PlayMode mode);
}
