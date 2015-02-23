/* Phone Class
	Coded by Collin Mullis
	CMP112 Practicum
	February 23rd 2015
*/

// Creates Phone class with 4 data members to keep track of Name, Make, Android verison, and Quantity
class Phone {
	public String name;
	public String make;
	public String version;
	public int quant;

/*---------------------------------------------------------------------------------------*/

// Constructor to keep track of quantity of the object. 
// No parameter Constructor
Phone() {
  name = "n/a";
  make = "n/a";
  version = "n/a";
  quant = 0;
}
// Full parameter Constructor
Phone( String thisName, String thisMake, String thisVersion, int thisQuantity) {
  name = thisName;
  make = thisMake;
  version = thisVersion;
  quant = thisQuantity;
}
// 3 Parameter Constructor 
Phone(String thisName, String thisMake, String thisVersion) {
  this();
  name = thisName;
  make = thisMake;
  version = thisVersion;
}
// 2 Parameter Constructor
Phone(String thisName, String thisMake) {
  this();
  name = thisName;
  make = thisMake;
} 
// Code to print out the data stored. 
public String toString() {
	String desc = "Name: " + name + " Make: " + make + " Android Version: " + version + " Quantity: " + quant;
	return desc;
	}
}
