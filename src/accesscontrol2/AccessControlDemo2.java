package accesscontrol2;

import accesscontrol1.AccessControlDemo;

public class AccessControlDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AccessControlDemo obj = new AccessControlDemo();
		//obj.name = "A"; //not accessible
		//System.out.println("account no is: "+obj.accountNo); //accessible
		System.out.println("Bank name: " + obj.bankName);
	}

}
