/**
 *
 * CS2212 6_TheWeather  
 * GUI.java
 * Usage: Handle default swing & JFrame objects for GUI.
 * 
 * @author Team6 
 * @version 1.0 
 */

// Import Libraries
import javax.swing.*;

public class GUI extends JFrame {

	GUIMenu mainDisplay;
	
	
	// Default Constructor
	public GUI() {
		this.initUI();
		this.setJMenuBar((JMenuBar)(mainDisplay = new GUIMenu()));
	}
	
	
	// Method Definitions
	private void initUI(){
		this.setTitle("6_TheWeather");
		this.setSize(1024, 576);	// 16:9 resolution
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}

}
