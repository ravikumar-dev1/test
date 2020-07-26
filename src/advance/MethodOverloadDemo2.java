package advance;

public class MethodOverloadDemo2 {
	int[] houseNo;
	String[] owner;

	public MethodOverloadDemo2() {
		// TODO Auto-generated constructor stub
		houseNo = new int[] {12, 45, 78, 90};
		owner = new String[] {"A", "P", "W", "F"};
	}
	
	void search(int houseNo) {
		for(int counter = 0; counter < this.houseNo.length; counter++) {
			if(this.houseNo[counter] == houseNo) {
				System.out.println("Found required houseNo in database.");
			} else {
				continue;
			}
		}
	}
	
	void search(String owner) {
		for(int counter = 0; counter < this.owner.length; counter++) {
			if(this.owner[counter].equals(owner)) {
				System.out.println("Found required owner in database.");
			} else {
				continue;
			}
		}
	}
	
	void search(int houseNo, String owner) {
		
	}
	
	//you can search by homeNo or owner
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverloadDemo2 obj = new MethodOverloadDemo2();
		//45
		
	}

}
