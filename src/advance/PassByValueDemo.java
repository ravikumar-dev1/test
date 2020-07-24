package advance;

public class PassByValueDemo {

	void incrementNumberByOne(int num){//4000
		num = num + 1000;
//		System.out.println("inside incrementNumberByOne" + num);
	}
	
	public static void main(String[] args) {
		PassByValueDemo obj = new PassByValueDemo();
		int num = 5;//100
		obj.incrementNumberByOne(num);
		System.out.println("Result is: " + num);
		//0, 5, 6
	}

}
