package staticexample;

public class StaticDemo {
	static int counter = 10;//static variable
	int num=2;//instance variable
	
	public static void incrementNumber(int num){
		anotherStaticMethod();
		counter =21;
//		num = 22;
	}
	
	public static void anotherStaticMethod(){
		
	}
	
	public void normalMethod(int num){
		this.num = num;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StaticDemo.incrementNumber(0);
		
		
		StaticDemo obj = new StaticDemo();
		obj.num = 34;
		obj.counter = 40;
		
		
		StaticDemo obj1 = new StaticDemo();
//		System.out.println("conunter value is: " + StaticDemo.counter);
		System.out.println("num value is: " + obj1.num);//2, 0, 34
		System.out.println("conunter value is: " + obj1.counter);
		
		obj.normalMethod(2);
	}

}
