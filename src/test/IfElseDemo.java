package test;

public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int student1Marks = 75;
		int student2Marks = 80;
		
		if(student1Marks >  student2Marks) {
			System.out.println("St1 has more marks.");
		} else {
			System.out.println("St2 has more marks.");
		}
		
		int num1 = 90;
		int num2 = 100;
		int num3 = 200;
		
		if(num1 >num2 && num1 > num3) {
			System.out.println(num1 + " is greatest number...");
		}
		
		if(num2 >num1 && num2>num3) {
			System.out.println(num2 + " is greatest number");	
		}
	
		if(num3 >num1 && num3>num2) {
			System.out.println(num3 + " is greatest number");	
		}
		
		//200<100
		//1 && 0 => 0
		//short ckt
		if(num3 < num2 || ++num1 > 10) {
			System.out.println("num3 is greater than num2");//will this line get printed
		}
		
		System.out.println("num1 value: "+num1);//whats the value of num1
		
		//0-false
		//other than 0 is always true[-1, 90, 1000, true]
		
		int condition = 5;
		if(condition > 6) {
			
		}
		
	}

}
