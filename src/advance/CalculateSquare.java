package advance;

public class CalculateSquare {
	
	//accpet integer type number and return its sqaure 
	int calcSquare(int num) {
		int result = num * num;
		return result;
	}

	
	public static void main(String[] args) {
		CalculateSquare calculateSquare = new CalculateSquare();
		//10
		int result = calculateSquare.calcSquare(10);
		System.out.println("Square of 10 is " + result);
	}

}
