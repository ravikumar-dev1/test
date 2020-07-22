package test;

public class ReturnDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = new int[] {23, 45, 56, 98, 21, 44};
		
		//find 98
		for(int counter = 0; counter < arr.length; counter++){
			if(arr[counter] == 98) {
				System.out.println("Found 98 at location " + counter);
				return;
			}
		}
		System.out.println("Outside for");
//
		//
		//
	}

}
