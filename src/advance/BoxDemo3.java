package advance;

public class BoxDemo3 {
	int depth;//attributes, global
	int width;
	int length;
	
	BoxDemo3(int depth, int width, int length) {//parameterized constructor, local
		this.depth = depth;
		width = width;
		length = length;
	}	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo3 obj = new BoxDemo3(2, 3, 4);
		System.out.println(obj.depth);
		
	}

}
