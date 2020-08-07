package exceptionDemo;

public class IndexOutExceptionDemo {

	public void printData(String [] arr) {
		for(int i=0;i<4 ;i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static void main(String[] args) {
		
		IndexOutExceptionDemo obj = new IndexOutExceptionDemo();
		obj.printData(new String[]{"A", "B", "C"});
	}

}
