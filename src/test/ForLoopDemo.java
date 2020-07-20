package test;

import java.util.Arrays;

public class ForLoopDemo {
	
	public static void main(String args[]) {
		int marks [] = new int[5];
		marks[0] = 56;
		marks[1] = 98;
		marks[2] = 89;
		marks[3] = 67;
		marks[4] = 80;
		
		for(int counter = 0; counter<5;) {
			System.out.println("Marks of student " + counter +" is "+marks[counter]);
			++counter;
		}

	}
}
