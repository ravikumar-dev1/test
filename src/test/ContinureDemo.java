package test;

public class ContinureDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int counter=0; counter < 100; counter ++) {
			if(counter%2 == 0) {
				continue;
			}
			//if execution is here we are sure number is odd.
			System.out.println(counter + " is odd.");
			//
			//
			//
		}
	}

}
