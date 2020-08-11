package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputDemo {

	public static void main(String[] args) throws IOException {
		//System.in - this tells that u have to read from console
		//BuffereReader class at a time reads 8192 characters
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter first numer");
		int num1 = Integer.parseInt(reader.readLine());
		System.out.println("Enter second number");
		int num2 = Integer.parseInt(reader.readLine());
		
		System.out.println("Enter input is: "+num1+ " and "+num2 );
		int res = num1 + num2;
		
		//Float.parseFloat(arg0)
		//Double.parseDouble(arg0)
		
		
		System.out.println("Result is: " +res);
//		InputStreamReader ireader = new InputStreamReader(System.in);//It reads single charater and returns
		
//		int num = ireader.read();
//		System.out.println("Enter input is: " +(char)num);
	}

}
