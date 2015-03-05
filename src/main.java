/**
 *
 * CS2212 6_TheWeather  
 * main.java
 * Usage: Main program for 6_TheWeather.
 * 
 * @author Team6 
 * @version 1.0 
 */

// Import Libraries
import javax.swing.SwingUtilities;


public class main {
	
	public static void main(String[] args) 
	{
	    SwingUtilities.invokeLater(new Runnable()
	    {

	    	public void run()
	    	{
	    		GUI window = new GUI();		// Draw the main window
	    		window.setVisible(true);
	    	}
	    });
	}

}
