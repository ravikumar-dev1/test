package exceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestMe  {

    public int performDivision(int num1, int num2) {
    	if (num2 == 0)
    		throw new CanNotDivideByZeroException("Can't divide by zero");
        return num1 / num2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*User can enter input number or character or symbol*/
        try {  
	        int num1 = scanner.nextInt();
	        int num2 = scanner.nextInt();
	
	        TestMe obj = new TestMe();
	        
	        System.out.println(obj.performDivision(num1, num2));
        } catch(CanNotDivideByZeroException e) {
        	System.out.println(e.getMessage());
        } catch (InputMismatchException e) {
			System.out.println("Please enter the numeric value only.");
		}
    }
}