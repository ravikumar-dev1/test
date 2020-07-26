package advance;

public class BoxDemo2 {
	int depth;//attributes
	int width;
	int length;
	
	void setDimension(int n1, int n2, int n3) throws ArithmeticException {
		depth = n1;
		width = n2;
		length = n3;
	}
	
	void setDimension(int n1, int n2) {
		depth = n1;
		width = n2;
		
	}
	

	
	public int calculateVolume() {
		return depth * width * length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo2 box1 = new BoxDemo2();
		//width integer
		box1.setDimension(2, 3, 4);
		
		int result = box1.calculateVolume();
		System.out.println("Volume of a box is " + box1.calculateVolume());
	}

}
