/* So to make it easier to read, I'll try describe everything in this class:

DataObject.java is the super class that has 90% of the variables that would be shared between long/short term and current objects.
    -> its getTemperature method takes a string as parameter: "min", "max" make it return the min/max temperatures. Any other string will make it return the current temperature
    -> setTemperature takes min/max/current temp/ and user settings as paramters - the temps are all initially in kelvin (received from JSON), and it will set the min/max/temp
        variables of the object according to the user settings string.

Day, Hour, and Current classes all extend the DataObject class. They each have 1 unique variable to them --> which day it is, what time it starts from (for short term), and the last updated time
        -> I think the updated time variable could be added to all of the subclasses in the end, but that's a detail for later :)

This class, AllObjects, has 2 arrays of lengths 7 and 8 to store an object for each day of the week, and an object for every 3 hours of a day
It also has a current object.

I'm not 100% done this class. What remains is a constructor that initializes everything, along with set methods to update any objects.
I will add that later tonight. Also to make a txt file to store user settings.
*/

import java.io.*;
public class AllObjects extends ADO implements java.io.Serializable {
    private Daily[] longTerm;     // Will be length 7
    private Hourly[] shortTerm;   // Will be length 8
    private Current current;
    
    public Daily[] getLongTerm(){
        return longTerm;
    }
    
    public Hourly[] getShoterTerm(){
        return shortTerm;
    }
    
    public Current getCurrent(){
        return current;
    }    
}
