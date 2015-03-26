
import java.io.*;
import javax.swing.ImageIcon;
import org.apache.commons.io.*;

/**
 * This class contains all parameters and methods required for a long term
 * forecast. It consists of an array of Daily objects.
 */
public class LongTerm implements java.io.Serializable {

    /**
     * Instance variables
     */
    private Daily[] longTerm;

    /**
     * Constructor for the short term forecast
     *
     * @param days the array for the long term forecast
     */
    public LongTerm(Daily[] days) {
        longTerm = days;
    }

    /**
     * Setter method for the long term forecast
     *
     * @param days the array for the long term forecast
     */
    public void setLongTerm(Daily[] days) {
        longTerm = days;
    }

    /**
     * Returns the array of Daily objects.
     *
     * @return the short term forecast object
     */
    public Daily[] getLongTerm() {
        return longTerm;
    }

    /**
     * Returns the Daily object stored at the specified index of the longTerm
     * array
     *
     * @return the object representing the correct day based off an integer
     * input (number between 0 and 4 is entered
     * @param i index of longTerm array; method return object at index i
     */
    public Daily getDaily(int i) {
        return longTerm[i];
    }
}
