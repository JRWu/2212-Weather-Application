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
    public static void main(String[] args) {
        System.out.println("Hello, Team6 WeatherJunkies");
        
        SwingUtilities.invokeLater(new Runnable(){
//        	@Override
        	public void run(){
        		DesignWindow window = new DesignWindow();
        		window.setVisible(true);
        	}
        });
        
        
    }
    
    
    
    
    
    
    

}