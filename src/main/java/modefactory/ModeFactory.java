package modefactory;

import enums.PlayMode;
import mode.Mode;

/**
 * Created by chetan on 30.11.2017.
 */
public interface ModeFactory {

   /**
    * Fetches the mode depending on the mode type.
    * @param mode modetype of the mode.
    * @return mode.
    */
   Mode getMode(PlayMode mode);
}
