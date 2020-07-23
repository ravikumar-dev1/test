package advance;

public class BoxDemo {
	int depth;//attributes
	int width;
	int length;

	public int calculateVolume() {
		return depth * width * length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BoxDemo box1;  //reference of a class boxDemo=null
		
		box1 = new BoxDemo();//boxDemo is a instance/objcet of a class
		box1.depth=4;
//		System.out.println(boxDemo.depth);
		
		BoxDemo box2 = new BoxDemo();	
//		System.out.println(b	ox2.depth);
		
		
		BoxDemo b1 = new BoxDemo();
		b1.width = 45;
		
		BoxDemo b2 = b1;
		
		b2.depth = 67;
		System.out.println("Depth is " + b1.depth);
		
		
	}

}
