/**
 * March 23, 2014
 * CS 2212
 * @author team 6
 * This class represents the weather object for Mars and contains all methods contained within the ADO class
 */
import java.util.*;
import javax.swing.ImageIcon;
public class Mars extends ADO{
/**
 * 
 * @param air the air pressure on mars
 * @param wind the wind speed on mars
 * @param temp the temperature on mars
 * @param min the expected minimum temperature on mars
 * @param max the expected maximum temperature on mars
 * @param humid the expected humidity on mars
 * @param windDir the wind direction on mars
 * @param sky the state of the sky on mars
 * @param state an image representing the sky state
 */
	public Mars(int air, double wind, double temp, double min, double max,int humid, String windDir, String sky, ImageIcon state)
	{
		super(air,wind,temp,humid,windDir,sky,state);
	}
}

