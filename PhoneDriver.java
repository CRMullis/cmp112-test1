/* Coded by Collin Mullis
	CMP112 Practicum 
	Phone Class Driver
*/
// Driver to test Phone Class
public class PhoneDriver {
	public static void main(String[] args) {
	
// My Phone to test full parameter version
	Phone xt1029 = new Phone("Droid Razr", "Motorola", "Kit-kat", 1);
	System.out.println(xt1029.toString());
// Non existent phone to test no parameter version
	Phone nonexist = new Phone();
	System.out.println(nonexist.toString());
}
}
