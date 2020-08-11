package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo1 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first numer");
		String num1 = reader.readLine();
		System.out.println("Enter second number");
		String num2 = reader.readLine();
		System.out.println("result is ");
		System.out.println(num1 + num2);//concatenation of two strings
	
	}

}
