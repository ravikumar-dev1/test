package exceptionDemo;

public class NullPointerExceptionDemo {
	String address = "";
	
	@Override
	public boolean equals(Object obj) throws NullPointerException {
		NullPointerExceptionDemo anotherObj = (NullPointerExceptionDemo) obj;
		if(this.address.equals(anotherObj.address)) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		NullPointerExceptionDemo obj1 = new NullPointerExceptionDemo();
		NullPointerExceptionDemo obj2 = new NullPointerExceptionDemo();
		System.out.println(obj1.equals(obj2));
	}

}
