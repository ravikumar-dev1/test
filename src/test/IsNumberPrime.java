package test;

public class IsNumberPrime {

	public static void main(String[] args) {
		
		int num = 41;
		
		//4-1,2,4
		//5-1,5
		//10-5[6-9][2-4]
		//100-50[51-99]
		//1000-500[501-999]
		
		for(int i = 2; i<=100; i++) {
			boolean isPrime = true;
			for(int counter = 2; counter <= i/2; counter++) {
				if(i % counter != 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) 
				System.out.println(i + " is prime.");
			else
				System.out.println(i + " is not prime.");
		}
	}

}
