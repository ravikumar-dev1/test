package test;

public class IfElseIfLadderDemo {

	public static void main(String[] args) {
		int num1 = 20;
		int num2 = 3;
		int num3 = 10;
		
		if(num1 >num2) {//nested if
			if(num1 > num3) {
				System.out.println("num1 is greater");
			}
		} else if(num2 >num1 && num2 > num3) {
			System.out.println("num2 is greater");
		} else if(num3 > num1 && num3>num2){//elseif ladder
			System.out.println("num3 is greater");	
		}
	}
	
}
