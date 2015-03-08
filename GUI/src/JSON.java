import java.io.*;
import java.net.*;
import java.util.Iterator;
import java.util.List;

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
	private String query =  "?q="; 	//variable query, dependent on location and whether it will be current, short term, or long term
	private String location = ""; //String to contain location
	private URL url;	//URL Object, used to create connection
	private double temp,temp_max,temp_min,windSpeed; //all the variables for CURRENT weather (forecast still needs to be figured out)
	private int pressure, humidity, windDirectionDegree,time; 
	private String weatherDescription, skyState, windDirection; //This may change, need to test out how the currentWeatherSetVariables function is for a while
	private JSONObject allWeatherData; 
	
	
	public JSON (String l){ //When creating the JSON object, initially set the location (eg, London, CA for our city)
		
		location = l;
		query += location;//first part of the query is always the location. 
		
		
	}
	
	public JSONObject requestJson(String time){ //was in the UML diagram, will most likely be axed out for different implementation
		
		
		return allWeatherData;
	
	
	}
	
	public Current updateCurrentWeatherData(){ //
		try{
			url = new URL(HOST + PATH_CURRENT + query);
			System.out.println(HOST + PATH_CURRENT + query);
			HttpURLConnection connect = (HttpURLConnection) url.openConnection();
			InputStream in = connect.getInputStream();
			String jsonString = IOUtils.toString(in);
			JSONObject currentWeatherData = new JSONObject(jsonString);
			allWeatherData = new JSONObject(jsonString);
			time = currentWeatherData.getInt("dt");
			
			JSONObject main = currentWeatherData.getJSONObject("main");
			JSONArray weather = currentWeatherData.getJSONArray("weather");
			JSONObject wind = currentWeatherData.getJSONObject("wind");
			currentMainSetVariables(main);
			currentWeatherSetVariables(weather);
			currentWindSetVariables(wind);
			//return ADO_Object
			return new Current("celsius",time,pressure,windSpeed,temp,temp_min,temp_max,humidity,windDirection,skyState);
			
		}catch (IOException e){
			System.out.println(e.getMessage());
		}
		return null;
	}
	
	public static void main (String [] args){
		System.out.println("Creating JSON");
		JSON asdf = new JSON("London,CA");
		String qwer = "hello";
		System.out.println(qwer);
		
	}
	
	private void currentMainSetVariables(JSONObject main){
		humidity = main.getInt("humidity");
		pressure = main.getInt("pressure");
		temp_max = main.getDouble("temp_max");
		temp_min = main.getDouble("temp_min");
		temp = main.getDouble("temp");
	}
	
	private void currentWeatherSetVariables(JSONArray weather){
		JSONObject fdsa = weather.getJSONObject(0);//easier to represent the current weather as a JSONObject than array
		weatherDescription = fdsa.getString("description");
		skyState = fdsa.getString("main");
		
	}
	
	private void currentWindSetVariables(JSONObject wind){
		windDirectionDegree = wind.getInt("deg");
		windSpeed = wind.getDouble("speed");
		if (windDirectionDegree == 0)
			windDirection = "North";
		else if (windDirectionDegree > 0 && windDirectionDegree <=90)
			windDirection = "East";
		else if (windDirectionDegree > 90 && windDirectionDegree <= 180)
			windDirection = "South";
		else
			windDirection = "West";
	}
	
	
	
	
}
