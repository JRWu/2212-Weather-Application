/**
 * UserPreferences represents the strings that describe the user's preferences
 * Help to update the display accordingly. 
 * @author team6
 */
public class UserPreferences {
    
    // Attributes
    private String temperatureUnit;
    private String speedUnit;
    private String pressureUnit;
    
    
// Default Constructor
    UserPreferences (){
        setSI();    // Default units are Metric
    }    
    
    /*******************************
    FUNCTION DECLARATIONS BEGIN HERE
    *******************************/
    /*
    * setUserPreferences will configure display units based on a serialized object
    * @preferences represents the preference string saved
    * default units are assumed to be metric
    */
    public void setUserPreferences(String preferences)
    {
        char c;
        try
        {
        c = preferences.charAt(0); // Get the character stored inpreferences
        }
            catch (StringIndexOutOfBoundsException ex)
        {
            c = 'K';
        }
        
        switch (c)  // Switch to determine the serialized object
        {
            case 'm':
            case 'M':
                setMetric();        // Metric 
                System.out.println(temperatureUnit); 
                break;
                
            case 'i':
            case 'I':
                setImperial();      // Imperial
                System.out.println(temperatureUnit); 
                break;
            
            case 's':
            case 'S':
                setSI();            //System Internationale
                System.out.println(temperatureUnit); 
                break;
                
            default:                // Default is Metric
                System.out.println(temperatureUnit); 
                break;
        }
    }
    

    
    // Getter for temperature Units
    public String getTemperatureUnit()
    {
        return temperatureUnit;
    }
    
    // Getter for speed Units
    public String getSpeedUni()
    {
        return speedUnit;
    }
    
    // Getter for pressure Units
    public String getPressureUnit()
    {
        return pressureUnit;
    }
    
    
    // Private Helper Functions to Set units
    private void setMetric()
    {
        temperatureUnit = " C";
        speedUnit = " m/s";
        pressureUnit = " hPa";
    }
    
    private void setImperial()
    {
        temperatureUnit = " F";
        speedUnit = " mi/s";
        pressureUnit = " hPa";
    }
    
    private void setSI()
    {
        temperatureUnit = " K";
        speedUnit = " mi/s";
        pressureUnit = " hPa";
    }

}
