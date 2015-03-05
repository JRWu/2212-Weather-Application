public class DataObject {

    String userSettings;        // User temperature settings
    int windSpeed;
    String windDirection;   // Either North-North-East style for strings, or degree wise for integer
    int airPressure;
    int humidity;
    String skyCondition;
    double temp;
    double minT;
    double maxT; 
    int sunRise;        //24 hour clock ftw
    int sunSet;
    
 
    DataObject(String userSettings, int windSpeed, String windDirection, int airPressure, int humidity, String skyCondition, double temp, double minT, double maxT, int sunRise, int sunSet){
        
        setUserSettings(userSettings);
        setPressure(airPressure);
        setWind(windDirection, windSpeed);
        setHumidity(humidity);
        setSkyCondition(skyCondition);
        setSun(sunRise, sunSet);
        setTemp(temp, minT, maxT, userSettings);
        
    }
    
    //Get Set 
    
    public String getUserTemp(){
        return this.userSettings;
    }
    
    public double getTemp(String k ){                
        if (k.equals("max")){
            return this.maxT;
        }else if (k.equals("min")){
            return this.minT;
        }else{
            return this.minT;
        }
    }
    
    public int getWindseed(){
        return this.windSpeed;
    }
    
    public String getWindDirection(){
        return this.windDirection;
    }
    
    public int getAirPressure(){
        return this.airPressure;
    }
    
    public int getHumidity(){
        return this.humidity;
    }
    
    public int getRise(){
        return this.sunRise;
    }
    
    public int getSet(){
        return this.sunSet;
    }
    
    public String getSkyConidition(){
        return this.skyCondition;   
    }
    
    public void setUserSettings(String t){
        this.userSettings = t;
    }
    
    
    // Sets all 3 temperatures based on user settings.
    public void setTemp(double temp, double minT, double maxT, String user){                
        if (user.equals("celsius")){
            this.temp = temp-273;
            this.maxT = maxT-273;
            this.minT = minT-273;             
        }else if (user.equals("fahrenheit")){  
            this.temp = ((temp - 273) * (9/5) + 32);
            this.minT = ((minT - 273) * (9/5) + 32);
            this.maxT = ((maxT - 273) * (9/5) + 32);
        }else{
            this.temp = temp;
            this.minT = minT;
            this.maxT = maxT;
        }    
    }
     
    
    public void setPressure(int pressure){
        this.airPressure = pressure;
    }
    
    public void setWind(String direction, int wind){
        this.windDirection = direction;
        this.windSpeed = wind;
    }
    
    public void setHumidity(int humidity){
        this.humidity = humidity;
    }
    
    public void setSkyCondition(String sky){
        this.skyCondition = sky;
    }
    
    public void setSun(int rise, int set){
        this.sunRise = rise;
        this.sunSet = set;
    }
    
}

