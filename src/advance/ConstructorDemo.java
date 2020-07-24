package advance;

public class ConstructorDemo {
	int num;
	boolean flag;
	
	ConstructorDemo() {
//		num = 5;
		flag = true;
		System.out.println("Constructor is called.");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo obj = new ConstructorDemo();
		System.out.println(obj.flag);
		
		ConstructorDemo obj1 = new ConstructorDemo();
		
		
//		obj.ConstructorDemo();
	}

}
