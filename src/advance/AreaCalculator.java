package advance;

public class AreaCalculator {
	int length, width;
	float radius;
	
	public AreaCalculator(float radius) {
		this.radius = radius;
	}
	
	public AreaCalculator(int length, int width) {
		this.length = length;
		this.width = width;
	}
	
	public int area(int length, int width) {
		return length * width;
	}
	
	
	public float area(float radius) {
		return 3.14F * radius * radius;
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
