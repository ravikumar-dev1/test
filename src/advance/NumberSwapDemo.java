package advance;

public class NumberSwapDemo {
	
	//temp=10
	//num1=10
	//num2=20
	public void swapFunction(NumberClass obj) {
		int temp = obj.num1;
		obj.num1 = obj.num2;
		obj.num2 = temp;
	}
	
	public static void main(String[] args) {
		NumberSwapDemo obj = new NumberSwapDemo();
		NumberClass numClassObj = new NumberClass();
		numClassObj.num1 = 10;
		numClassObj.num2 = 20;
		obj.swapFunction(numClassObj);
		System.out.println("num1: " + numClassObj.num1 + "\t num2: " + numClassObj.num2);
	}

}
