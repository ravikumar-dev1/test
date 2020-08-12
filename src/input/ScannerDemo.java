package input;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		System.out.println("Enter integer");
//		int num = sc.nextInt();
//		System.out.println("Enter number is " + num);

		String str = sc.nextLine();
		int num = Integer.parseInt(str);
		System.out.println("Enter string is " + str);
		
		
	}

}
