package test;

import java.util.Arrays;

public class HW2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String empName = "Rakesh";
		String address = "MG Road, B2-803, Newasa";
		String leaves[] = new String[]{"Mon", "Fri"};
		String empId = "A344";
		int salary = 24000;
		System.out.println("employee name: "+empName);
		System.out.println("Salary: " + salary);
		
		int [] marks = new int[85];
		System.out.println("Leaves: "+Arrays.toString(leaves));
//		System.out.println("marks: "+Arrays.toString(marks));
		
		String [] nameArray;
		nameArray = new String[1000];
		
		nameArray[0] = "A";
//		nameArray[1] = "B";
//		nameArray[-1] = "C";
		
		System.out.println("New student name: "+Arrays.toString(nameArray));
		System.out.println("students in class: "+nameArray.length);
//		= new String[];
		
		int mat[][] = new int[3][3]; //array of array
		
		System.out.println("length row-0 : "+ mat[0].length);
		System.out.println("length row-1: "+ mat[1].length);//size of each row
		mat[1][1] = 23;
		System.out.println("element: " + mat[2].length);
		System.out.println("matrix elements: " + Arrays.deepToString(mat));//all elements
		//
		int mat2[][] = new int[3][];
		mat2[0] = new int[3];
		mat2[1] = new int[2];
		mat2[2] = new int[1];
		
		System.out.println("mat2 elements: "+ Arrays.deepToString(mat2));
			
	}

}
