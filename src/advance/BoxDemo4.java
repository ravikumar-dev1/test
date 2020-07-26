package advance;

public class BoxDemo4 {
	int depth;//attributes, global
	int width;
	int length;
	int x;
	
	public BoxDemo4() {
		System.out.println("inside w/o param. constructor");
		depth = 1;
		length = 2;
		width = 3;
	}
	
	public BoxDemo4(BoxDemo4 obj) {
		depth = obj.depth;
		length = obj.length;
		width = obj.width;
	}
	
	public BoxDemo4(int depth, int width, int length) {
		System.out.println("inside 3 param. constructor");
		this.depth = depth;
		this.length = length;
		this.width = width;
	}
	
	public BoxDemo4(int length) {
		System.out.println("inside 1 param. constructor");
		this.depth = length;
		this.length = length;
		this.width = length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxDemo4 obj = new BoxDemo4();
		BoxDemo4 obj1 = new BoxDemo4(3, 4, 5);
		BoxDemo4 obj4 = new BoxDemo4(3, 4, 5);
		BoxDemo4 obj2 = obj1;//this not creating new object
		
		BoxDemo4 obj3 = new BoxDemo4(obj1);
		
		//you have to create new object of box of same dimension
		
		
	}

}
