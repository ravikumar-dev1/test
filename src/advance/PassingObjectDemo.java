package advance;

public class PassingObjectDemo {
	
	int num;
	
	public void incrementObject(PassingObjectDemo obj) {
		obj = null;
//		obj.num++;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PassingObjectDemo obj = new PassingObjectDemo();
		PassingObjectDemo obj1 = new PassingObjectDemo();
		
		obj1.num = 10;
		
		obj.incrementObject(obj1);
		System.out.println("Value of num is: " + obj1.num);
	}

}
