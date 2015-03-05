public class Day extends DataObject {
    String day = " ";
    
    public Day (String userSettings, int windSpeed, String windDirection, int airPressure, int humidity, String skyCondition, double temp, double minT, double maxT, int sunRise, int sunSet, String day){
        super(userSettings, windSpeed, windDirection, airPressure, humidity, skyCondition, temp, minT, maxT, sunRise, sunSet);
        setDay(day);
    }
    
    public String getDay() {
        return this.day;
    }
    
    public void setDay(String d){
        this.day = d;
    }
    
}
