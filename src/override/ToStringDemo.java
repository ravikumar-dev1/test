package override;

public class ToStringDemo{
	
	int num = 3;
	String address = "";

	@Override
	public String toString() {
		return "num is " + num;
	}
	
	@Override
	public boolean equals(Object obj2) {
		if(this == obj2) { //this condition will compare address
			System.out.println("Both objects are equal because addresses are same.");
			return true;
		}
		ToStringDemo otherObj = (ToStringDemo) obj2;
		if(this.num == otherObj.num && this.address.equals(otherObj.address)) {
			System.out.println("Both objects are equal because contents are same.");
			return true;
		}
		System.out.println("Both objects are different.");
		return false;
	}
	
	public static void main(String[] args) {
		ToStringDemo obj1 = new ToStringDemo();
		obj1.num  = 5;
		System.out.println(obj1);
		
		ToStringDemo obj2 = new ToStringDemo();
		obj2.num  = 5;
		obj1.equals(obj2);
		Object obj22 = obj1;
	}

}
