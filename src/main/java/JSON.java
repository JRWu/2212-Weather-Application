import java.io.*;
import java.net.*;
import java.util.Iterator;
import java.util.List;
import javax.swing.ImageIcon;

import org.apache.commons.io.*;
import org.json.JSONObject;
import org.json.JSONException;
import org.json.JSONArray;

/*unfortunately I needed to add some referenced libraries. 
To get the JSON jar go to this link: http://search.maven.org/#search%7Cgav%7C1%7Cg%3A%22org.json%22%20AND%20a%3A%22json%22
I'm using version 20131018 as for some reason the 2014 wouldn't work for my system. 
org.apache.commons.io.* can be found here: http://commons.apache.org/proper/commons-io/
Version 2.4 is the one I'm using, older versions *should* work as well, haven't been tested though. 
Best way to handle this would be to make a MAVEN pom file, but I haven't figured that out yet so until then
this is the way to go. 	

*/

public class JSON {
//	private String url = "http://api.openweathermap.org/data/2.5/forecast?q=london,ca&cnt=7";
	private final String HOST = "http://api.openweathermap.org"; //host and protocol 
	private final String PATH_CURRENT = "/data/2.5/weather";	//where we'll be getting the current weather from
	private final String PATH_FORECAST = "/data/2.5/forecast";	//where we'll be getting short term and long term forecasts from
	private final String PATH_ICON = "/img/w";
	private String query =  "?q="; 	//variable query, dependent on location and whether it will be current, short term, or long term
	
	private String location = ""; //String to contain location
	private URL weatherURL,iconURL;	//URL Object, used to create connection
	private double temp,temp_max,temp_min,windSpeed; //all the variables for CURRENT weather (forecast still needs to be figured out)
	private int pressure, humidity, windDirectionDegree,time,sunrise,sunset; 
	private String weatherDescription, skyState, windDirection; //This may change, need to test out how the currentWeatherSetVariables function is for a while
	private JSONObject allWeatherData; 
	private ImageIcon icon;
	
	/**
	 * Returns a JSON object to use for obtaining weather data. 
	 * 
	 * @param l the string for the location JSON object will be grabbing. 
	 */
	public JSON (String l){ //When creating the JSON object, initially set the location (eg, London, CA for our city)
		
		location = l;
		query += location;//first part of the query is always the location. 
		
		
	}
	
	
	
	/**
	 * Method to obtain current weather data; in the future it will throw an error if it cannot connect. 
	 * 
	 * @return a Current object with all fields filled for the current weather data. 
	 */
//	public Current updateCurrentWeatherData() throws NoConnectionException {
	public Current updateCurrentWeatherData(){ 
		try{
			weatherURL = new URL(HOST + PATH_CURRENT + query);
			HttpURLConnection connect = (HttpURLConnection) weatherURL.openConnection();
//			if (HttpURLConnection.HTTP_OK != connect.getResponseCode()) throw new NoConnectionException(connect.getResponseMessage());
			InputStream in = connect.getInputStream();
			String jsonString = IOUtils.toString(in);
			JSONObject currentWeatherData = new JSONObject(jsonString);
			allWeatherData = new JSONObject(jsonString);
			time = currentWeatherData.getInt("dt");
			
			JSONObject main = currentWeatherData.getJSONObject("main");
			JSONArray weather = currentWeatherData.getJSONArray("weather");
			JSONObject wind = currentWeatherData.getJSONObject("wind");
			JSONObject sun = currentWeatherData.getJSONObject("sys");
			currentMainSetVariables(main);
			currentWeatherSetVariables(weather);
			currentWindSetVariables(wind);
			currentSunTime(sun);
			//return ADO_Object

			return new Current("celsius",time,pressure,windSpeed,temp,temp_min,temp_max,humidity,windDirection,skyState);
	
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		return null;
	}

	
	/**
	 * Private method to set all temperature and humidity and pressure fields
	 * 
	 * @param main JSONObject containing these fields.
	 */
	private void currentMainSetVariables(JSONObject main){
		humidity = main.getInt("humidity");
		pressure = main.getInt("pressure");
		temp_max = main.getDouble("temp_max");
		temp_min = main.getDouble("temp_min");
		temp = main.getDouble("temp");
		}
	
	/**
	 * Private method for weather variables. Gets sky state and weather description as well as ImageIcon for skystate
	 * 
	 * @param weather JSONArray containing all weather fields
	 */
	private void currentWeatherSetVariables(JSONArray weather){
		JSONObject weatherData= weather.getJSONObject(0);//easier to represent the current weather as a JSONObject than array
		weatherDescription = weatherData.getString("description");
		skyState = weatherData.getString("main");
		
		//Uses a URL to grab an ImageIcon, to later be implemented in the data
		try {
			iconURL = new URL(HOST + PATH_ICON + weatherData.getString("icon") + ".png");
			icon = new ImageIcon(iconURL);
		}catch (Exception e){}
		
	}
	
	/**
	 * Private method that gets wind data and converts the degree to a rough direction
	 * 
	 * @param wind JSONObject containing all wind data
	 */
	private void currentWindSetVariables(JSONObject wind){
		windDirectionDegree = wind.getInt("deg");
		windSpeed = wind.getDouble("speed");
		if (windDirectionDegree == 0 || windDirectionDegree <=15){
			windDirection = "North";
		}
		else if (windDirectionDegree <= 45){
			windDirection = "North East";
		}
		else if (windDirectionDegree <=105){
			windDirection = "East";
		}
		else if ( windDirectionDegree <= 135){
			windDirection = "South East";
		}
		else if (windDirectionDegree <= 195){
			windDirection = "South";
		}
		else if (windDirectionDegree <= 225){
			windDirection = "South West";
		}
		else if (windDirectionDegree <= 285)
			windDirection = "West";
		else
			windDirection = "North West";
	}
	
	/**
	 * Private method that gets data for sunrise and sunset and sets it
	 * 
	 * @param sun JSONObject for sunrise and sunset data
	 */
	private void currentSunTime(JSONObject sun){
		sunrise = sun.getInt("sunrise");
		sunset = sun.getInt("sunset");
	}
	
	
	
	
}
