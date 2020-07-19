package test;

public class TernaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 4;
		int num2 = 10;
		
		String result = num1 < num2 ? num1+" is less" : num2 + " is less";
		
//		System.out.println(result);
		
		int output = num1 > num2 ? num1++ : ++num2;
		// 4>10
		//output = ++num2
		System.out.println("Result: " + output);
		System.out.println("num2: " + num2);
		
		
	}

}
