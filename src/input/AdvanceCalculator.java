package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AdvanceCalculator {
	
	
	public static void add(int num1, int num2) {
		System.out.println(num1 + num2);
	}
	
	public static void add(float num1, float num2) {
		System.out.println(num1 + num2);
	}
	
	public static void div(float num1, float num2) {
		System.out.println(num1 / num2);
	}
	
	
	//only integer type throws arithmetic exception for divide by 0
	public static void div(int num1, int num2) {
		try {
			System.out.println(num1 / num2);
		}catch (ArithmeticException e) {
			System.out.println("can't divde by zero");
		}
	}
	
	

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int choice = 0;
		do {
		System.out.println("1. Add");
		System.out.println("2. Sub");
		System.out.println("3. Mul");
		System.out.println("4. Div");
		System.out.println("5. Exit");
		
		try {
		choice = Integer.parseInt(reader.readLine());
		System.out.println("enter 1 for int operation and 2 for float type operation.");
		int opTypeChoice = Integer.parseInt(reader.readLine());
		int num1Integer = 0;
		int num2Integer = 0;
		
		float num1Float = 0;
		float num2Float = 0;
		
		if(opTypeChoice == 1) {
			System.out.println("Enter first number");
			num1Integer = Integer.parseInt(reader.readLine());
			System.out.println("Enter second number");
			num2Integer = Integer.parseInt(reader.readLine());
		} else {
			System.out.println("Enter first number");
			num1Float = Float.parseFloat(reader.readLine());
			System.out.println("Enter second number");
			num2Float = Float.parseFloat(reader.readLine());
		}
		
		
		switch (choice) {
		case 1:
			if(opTypeChoice == 1)
				add(num1Integer, num2Integer);
			else 
				add(num1Float, num2Float);
			break;
			
		case 4:
			if(opTypeChoice == 1)
				div(num1Integer, num2Integer);
			else 
				div(num1Float, num2Float);
			break;

		default:
			System.out.println("Enter valid choice");
			break;
		}
		}catch (IOException e) {
			System.out.println("Exception while reading input.");
		}

		}while(choice != 5);
	}

}
