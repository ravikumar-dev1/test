package accesscontrol1;

public class AnotherClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlDemo obj = new AccessControlDemo();
		obj.setName("A");
		System.out.println("value is : "+obj.getName());
		System.out.println("account no is: "+obj.accountNo);
		//obj.privateMethod();
		System.out.println("Full name is: " +obj.getFullName());
	}

}
