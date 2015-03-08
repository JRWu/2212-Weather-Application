/**
* March 8, 2014
* CS 2212
* @author team 6
* This class returns an arrray of daily, hourly or just a current object to represent the long term, short term and current forecasts
*/
import java.io.*;
public class AllObjects extends ADO implements java.io.Serializable {
/**
* Instance variables 
*/
    private Daily[] longTerm;     
    private Hourly[] shortTerm;   
    private Current current;
/**
* @return an array of type Daily to represent the long term forecast
*/
    public Daily[] getLongTerm(){
        return longTerm;
    }
/**
* @return an array of type Hourly to represent the short term forecast
*/
    public Hourly[] getShoterTerm(){
        return shortTerm;
    }
/**
* @return an object of type Current to represent the current forecast
*/    
    public Current getCurrent(){
        return current;
    }    
}