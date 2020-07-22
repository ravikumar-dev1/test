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
		
		BoxDemo boxDemo;  //reference of a class boxDemo=null
		
		
		boxDemo = new BoxDemo();//boxDemo is a instance/objcet of a class
		boxDemo.depth=4;
		System.out.println(boxDemo.depth);
		
		BoxDemo box2 = new BoxDemo();	
		System.out.println(box2.depth);
	}

}
