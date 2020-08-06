package exceptionDemo;

import java.io.FileNotFoundException;

public class DivideByZero {

	public int divide(int num1, int num2) {
		try {
			return num1 / num2;
		} catch (ArithmeticException e) {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		DivideByZero obj = new DivideByZero();
		int result = obj.divide(10, 0);
		if(result != -1)
			System.out.println(result);
		else
			System.out.println("Can't divide by zero");
		System.out.println("xyz demo stmt");
	}

}
