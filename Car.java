/* Code taken from Brian Capouch's Repository
	Commented by Collin Mullis
	CMP112 Practicum
	February 23rd 2015 */
// Creates the class and names it "Car" Giving it the data members "make" (a string) and "year" (an integer)
public class Car {
	public String make;
	public int year;

/* ----------------------------------------------------------------- */

// Creates a zero parameter constructor that sets the value for make to "Unknown" and year to 2015
Car () {
	make = "Unknown";
	year = 2015;
	}
// Creates a single parameter constructor that will use the keyword "this" to set both values to the ones given in 
// the zero parameter constructor first, then replace any values with the parameters that it has been given.  
Car (String thisMake) {
	this();
	make = thisMake;
	}
// Creates a two parameter constructor that DOES NOT set values to the zero parameter values, and takes two parameters
// to set the values to whatever arguments you send it. 
Car (String thisMake, int thisYear) {
	make = thisMake;
	year = thisYear;
	}
// Makes a String that will consist of  "Make: (make) Year: (year)" using the parameter values.
public String toString() {
	String desc = "Make: " + make + " Year: " + year;
	return desc;
	}
}
