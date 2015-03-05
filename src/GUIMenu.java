/**
 *
 * CS2212 6_TheWeather  
 * GUIMenu.java
 * Usage: Represents the Menu-Options bar across the top, and their associated operations.
 * 
 * @author Team6 
 * @version 1.0 
 */

// Import Libraries
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.*;
import java.text.*;
import javax.swing.Timer;


/**
 * GUIMenu represents the main menu that is drawn across the top of the GUI window.
 * Integrates all the options into one bar.
 **/
public class GUIMenu extends JMenuBar implements ActionListener
{		
	// Attributes (Menu Options)
	String time = "4:20"; // Ask TONY how to update this for last updated
	SimpleDateFormat timeFormat = new SimpleDateFormat("hh:mm:ss"); // For time display
	
	JMenu preferences = new JMenu ("Preferences");
	JButton search = new JButton("Search:");
	JTextField searchOption = new JTextField("Location",1);
	JLabel timeLive;
	JLabel lastUpdatedTime = new JLabel ("Last Updated at: " + time + "| Current:" );
	JLabel buffer = new JLabel(" ");
	

	
	// Default Constructor
	public GUIMenu()
	{
		formatJButton(search);
		
		initTime();	// Set the live action time
		
		add (preferences);
		add (search);
		add (searchOption);
		add (lastUpdatedTime);
		add (timeLive);
		add (buffer);
	}

	/**
	 * formatJButton takes a JButton object and makes it look like a JMenu object.
	 **/
	private void formatJButton (JButton button)
	{
		button.setFocusPainted(false);
        button.setMargin(new Insets(0, 0, 0, 0));
        button.setBorderPainted(true); // Gives characteristic blue look
        button.setContentAreaFilled(false);
        button.setOpaque(false);
        button.setMnemonic(KeyEvent.VK_S);
	}
	
	/**
	 * initTime continuously updates the current time with an ActionListener.
	 **/
	private void initTime()
	{
		Calendar now = Calendar.getInstance();
		timeLive = new JLabel(timeFormat.format(now.getTime()));
		
	    new Timer(1000, new ActionListener() {
	        @Override
	        public void actionPerformed(ActionEvent e) {
	            Calendar now = Calendar.getInstance();
	            timeLive.setText(timeFormat.format(now.getTime()));
	        }
	    }).start();
	}	
	
	
	// Function to be called when "search" is performed
	private void setLastTime(JLabel lastUpdatedTime, String lastTime)
	{
		lastUpdatedTime.setText(lastTime);
	}
	


	// DUMMY DATA TO SILENCE WARNING OF IMPLEMENTING ACTIONLISTENER
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}


	// New Classes Go here
	
	
	
	
}