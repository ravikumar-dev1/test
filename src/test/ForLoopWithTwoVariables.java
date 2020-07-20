package test;

public class ForLoopWithTwoVariables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] marks = new int[] {34, 56, 67, 89, 100};
		String [] name = new String[] {"A", "B", "C" ,"D" ,"E"};
		
		//marks of the student E is 34
		//I must use single for loop
	
		for(int reverseCounter = 4, counter=0  ; reverseCounter>=0 &&  counter<5 ; reverseCounter--, counter++ ) {
			System.out.println("Marks of the student " + name[reverseCounter] + " is "+marks[counter]);
		}
		
	}

}
