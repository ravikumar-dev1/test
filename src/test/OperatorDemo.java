package test;

public class OperatorDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//plus
		int result;
		float num1 = 23;
		int num2 = 4;
      	//result = num1 + num2; // float can't be converted to int
//		System.out.println("Addition is: "+result);
		
		
		float divResult = num1/num2;//int can be convert into float
		
		//Data type of smaller range/more precision can be assigned to larger range datatype
		System.out.println("Division: "+divResult);
		
		int number = 5;
//		number =  number +1;
		number++;
		
		System.out.println("number value: "+number);
		//number =  number -1;
		number--;
		System.out.println("number value: "+number);
		
		//not number value is 5
		 int new_num = number++;
		System.out.println("new_num value: "+new_num);
		System.out.println("number value: "+number);
		
		new_num = ++number;
		System.out.println("new_num value: "+new_num);		
	}

}
