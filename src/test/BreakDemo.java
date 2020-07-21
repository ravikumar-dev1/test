package test;

public class BreakDemo {

	public static void main(String[] args) {
		
		//Find number 21 from the loop
		int [] arr = {21, 56, 78, 34, 23, 5, 21};
		int counter = 0;
		for(int i=0; i<3; i++) {
			for(counter=0; counter < arr.length; counter++) {
				if(arr[counter] == 21) {
					System.out.println("Yes..21 found in the array at location " + counter);
					break;
					//
				}
				
			}
		}
		System.out.println("Value of counter is "+counter);		
	}
}
