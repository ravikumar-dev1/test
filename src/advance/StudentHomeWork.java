package advance;

import java.util.Arrays;

public class StudentHomeWork {

	String name, address;
	int rollNo;
	String arr[];

	public StudentHomeWork(String name, String address, int rollNo, String arr[]) {
		this.name = name;
		this.address = address;
		this.rollNo = rollNo;
		this.arr = arr;
	}
	
	void printData() {
		System.out.println("Roll No.: " +rollNo+ "\t Name: "+name+"\t Address: "+address+"\t Subjects: "+Arrays.toString(arr));
	}
			
	public static void main(String[] args) {
		StudentHomeWork [] studentObjetcs = new StudentHomeWork[5];
		studentObjetcs[0] = new StudentHomeWork("A", "PQR", 23, new String[]{"Sub1"});
		studentObjetcs[1] = new StudentHomeWork("B", "PQR34", 25, new String[]{"Sub1", "Sub2"});
		studentObjetcs[2] = new StudentHomeWork("C", "PQR", 27, new String[]{"Sub1", "Sub3"});
		studentObjetcs[3] = new StudentHomeWork("C", "PQR", 27, new String[]{"Sub1", "Sub3"});
		studentObjetcs[4] = new StudentHomeWork("C", "PQR", 27, new String[]{"Sub1", "Sub3"});
		
		for(int counter = 0; counter < studentObjetcs.length; counter++) {
			studentObjetcs[counter].printData();
		}
		
	}
	
	
}
