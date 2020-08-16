package synchdemo;

public class PrintTable {

	public synchronized void print(int num) {
		for(int i=1; i<=10; i++) {
			System.out.println("Table of "+num+" " + i * num);
		}
	}
	
}
