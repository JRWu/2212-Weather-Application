/**
 *
 * CS2212 6_TheWeather  
 * DesignWindow.java
 * Usage: Handle default swing & JFrame objects for GUI.
 * 
 * @author Team6 
 * @version 1.0 
 */


import javax.swing.*;

import java.awt.Color;
import java.awt.event.*;

import javax.swing.border.*;

import java.awt.color.*;

public class DesignWindow extends JFrame{
	
	private String time = "5:00";
	
	Border blackline = blackline = BorderFactory.createLineBorder(Color.black);
	
	// Constructor
	public DesignWindow() {
		this.initUI();
		this.setJMenuBar(this.createMenuBar());
	}
	
	private void initUI(){
		this.setTitle("6_TheWeather");
		this.setSize(1024, 576);	// 16:9 resolution
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	private JMenuBar createMenuBar() {
		JMenuBar menubar = new JMenuBar();
		JMenu menuPreferences = new JMenu("Preferences");
		menuPreferences.setMnemonic(KeyEvent.VK_P); // Hotkey "P" to open preferences
		menuPreferences.setBorder(blackline);
		
		JButton search = new JButton("Search:"); // Add Actionlistener to this for searchign
		search.setBorder(blackline);
		JTextField searchOption = new JTextField("Location",1); // Gets the string from the user
		searchOption.setMaximumSize(new java.awt.Dimension(200,5000));
		searchOption.setBorder(blackline);
		
		JLabel menuTime = new JLabel("Time: " + time+" ");
		menuTime.setBorder(blackline);
		JLabel menuLastUpdated = new JLabel("Updated: " + time);
		menuLastUpdated.setBorder(blackline);
		
		
		/* FOR DROPDOWN MENU 
		JMenuItem mniFileExit = new JMenuItem("Exit");
		mniFileExit.setMnemonic(KeyEvent.VK_E);
		mniFileExit.setToolTipText("Exit application");;
		*/	
//		mnuFile.add(mniFileExit);
		
		
		
		
		menubar.add(menuPreferences);
		menubar.add(search);
		menubar.add(searchOption);
		
		menubar.add(menuTime);
		menubar.add(menuLastUpdated);
		
		return menubar;
	}
	
}
