package staticdmeo;

public class StringClassDemo {

	public static void main(String[] args) {
		String name = "ABC";
		System.out.println(name);
		
		name = "PQR";
		
		name = "ABC";//this value is allocated from string pool
		
		//String surname = "ABC";
		String surname = new String("ABC");
		
		System.out.println(name);
		
		//string comparision
		if(name.equals(surname)) {//this is not comparing string content its just comparing address of those strings
			System.out.println("Two strings are equal.");
		} else {
			System.out.println("Two strings are not equal.");
		}
		
		//== compares address
		//equals() compare actual content of the string
		
	}

}
