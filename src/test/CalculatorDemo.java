package test;

import java.util.Scanner;

public class CalculatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int choice;
		do{
			int num1, num2;
			num1 = 20;
			num2 = 45;
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. Div");
			System.out.println("5. Exit");
			
			choice = scanner.nextInt();
			int result=0;
			
			switch (choice) {
			case 1:
				result = num1 + num2;
				System.out.println("Add of " + num1 + " and " + num2 + " is "+ result);
				break;
			case 2:
				result = num1 - num2;
				System.out.println("Sub of " + num1 + " and " + num2 + " is "+ result);
				break;
			case 3:
				result = num1 * num2;
				System.out.println("Mul of " + num1 + " and " + num2 + " is "+ result);
				break;
			case 4:
				result = num1 / num2;
				System.out.println("Div of " + num1 + " and " + num2 + " is "+ result);
				break;
			/*case 5:
				break;*/
			default:
				break;
			}
			
		}while(choice != 5);
	}

}
