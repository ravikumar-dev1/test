package advance;

public class FinalKeywordDemo {
	
	int pinCode;
	
	public void fun1(final int rollNo) {
//		rollNo = 22;
		System.out.println("Roll number is: " + rollNo);
	}

	public static void main(String[] args) {
		int num = 56;
		num = 20;
		
		final int finalNum = 45;//you can't change value of finalNum because its final
		
		final int rollNo;//final blank variable
		rollNo = 21;
		
		final FinalKeywordDemo obj = new FinalKeywordDemo();
		
		obj.fun1(rollNo);
		
		obj.pinCode = 34;
		
		obj.pinCode = 56;
		
		System.out.println("pincode: "+obj.pinCode);
		
		 FinalKeywordDemo obj1 = new FinalKeywordDemo();
//		 obj = obj1;
		
		//rollNo=22;//this is not allowed
		
		
	}

}
