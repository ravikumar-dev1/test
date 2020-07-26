package advance;

public class MethodOverloadDemo {

	//purpose of method overloading is to allow programmers to give same method name to different methods
	int sum(int num1, int num2) {
		System.out.println("Inside int type sum method");
		return num1 + num2;
	}
	
	float sum(float num1, float num2) {
		System.out.println("Inside float type sum method");
		return num1 + num2;
	}	
	
	public static void main(String[] args) {
		/*MethodOverloadDemo obj = new MethodOverloadDemo();
		System.out.println(obj.sum(50.1F, 60.4F));*/
		MethodOverloadDemo obj1 = new MethodOverloadDemo();
		System.out.println(obj1.sum(10, 20));
		
		System.out.println((char)97);
	}

}
