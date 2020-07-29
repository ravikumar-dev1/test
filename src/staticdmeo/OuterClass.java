package staticdmeo;

//enclosing class
//outer class can never be static
public class OuterClass {
	
	int outerNum;
	
	
	static String name;
	
	//static-nested class
	static class InnerClass{
		
		String address;
		public void fun1() {
			OuterClass obj = new OuterClass();
			obj.outerNum = 4;//we have to create class object
			name = "ABC";//directly accessible because name is static in outer class
		}
		
	}
	
	//nested class
	class AnotherInnerClass{
		int innerNum;
		public void fun1() {
			outerNum = 4;//here we are accessing outer member w/o creating class object
			name = "ABC";
			outerClassMethod();
		}
	}
	
	public void outerClassMethod(){
//		innerNum=2;
//		fun1();
		AnotherInnerClass obj = new AnotherInnerClass();//to access inner class member you have to create object of inner class it may be static or non-static inner class
		obj.innerNum=34;
		
		InnerClass obj1 = new InnerClass();
		obj1.address = "PQR";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
