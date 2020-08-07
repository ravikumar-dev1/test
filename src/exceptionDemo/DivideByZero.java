package exceptionDemo;

import java.io.FileNotFoundException;

public class DivideByZero {

	public int divide(int num1, int num2) {
		int result=0;
		try {
			result = num1 / num2;
		} catch (ArithmeticException e) {
			e.printStackTrace();//this will print on which line error has occurred
			//int res = 3/0;//finally block will get executed
//			System.exit(0);//In case of system exit and JVM crash finally block will not be executed
			return -1;
		} finally {
			System.out.println("finally block will always get executed");//in both cases exception occurred or not occurred
		}
		
		//passing result to another funtion
		//calling another func to do som calculation
		//
		//
		System.out.println("before returning result.");
		return result;
	}
	
	public int divideVersion2(int num1, int num2) throws ArithmeticException{
		return num1 / num2;
		//
		//
		//
		
	}
	
	public void fun1() {
		divideVersion2(3, 4);
	}
	
	public static void main(String[] args) {
		DivideByZero obj = new DivideByZero();
		int result = obj.divide(10, 0);
		if(result != -1)
			System.out.println(result);
		else
			System.out.println("Can't divide by zero");
		System.out.println("xyz demo stmt");
		/*try {
			result = obj.divideVersion2(10, 0);
		} catch (ArithmeticException e) {
			System.out.println("Can't divide by zero.");
		}
		System.out.println("normal flow execution");*/
	}

}
