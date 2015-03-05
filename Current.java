/* Depending on what the group thinks, last updated time could be an attribute in the super class. */

public class Current extends DataObject{
    int updateTime;
    
     public Current(String userSettings, int windSpeed, String windDirection, int airPressure, int humidity, String skyCondition, double temp, double minT, double maxT, int sunRise, int sunSet){
        super(userSettings, windSpeed, windDirection, airPressure, humidity, skyCondition, temp, minT, maxT, sunRise, sunSet);
        
    }
     
    public int getUpdateTime(){
        return this.updateTime;
    }
    
    public void setUpdateTime(int t){
        this.updateTime = t;
    }
     
}
