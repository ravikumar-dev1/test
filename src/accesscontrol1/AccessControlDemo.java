package accesscontrol1;

public class AccessControlDemo {
	
	private String name = "A";
	private String surname = "B";
	private String fullNameOfCustomer;
	
	private int balance;
	
	int accountNo=123;
	
	public String bankName = "SBI";
	
	public void fun1() {
		System.out.println("name is " + name);
	}
	
	//setter method
	public void setName(String name) {
		if(balance < 0 ) {
			//return error
		}
		this.name = name;
	}
	
	//getter method
	public String getName() {
		return name;
	}
	
	public void setSurname(String surname){
		this.surname = surname;
	}
	
	//You don't want to expose the method to outside world
	private String formFullName() {
		fullNameOfCustomer = name + " " +surname;
		return fullNameOfCustomer;
	}
	
	public String getFullName(){
		return formFullName();
	}	

	public static void main(String[] args) {
		AccessControlDemo obj = new AccessControlDemo();
		obj.name = "A";//name is private variable but we are accessing it in same class so its accessible
		System.out.println(obj.name);
		System.out.println("account no is: "+obj.accountNo);
	}

}
