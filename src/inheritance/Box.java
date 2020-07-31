package inheritance;

//super class
public class Box {
	int length;//1
	int width;
	int depth;

	public Box(int length, int depth, int width){//parameterized constructor
		System.out.println("parameterized constructor of super class");
		this.length = length;
		this.depth = depth;
		this.width = width;
	}
	
	public void superClassMethod(){
		
	}
	
	public float calcVolume(){
		return length*width*depth;
	}
	
	public Box() {//default constructor
		System.out.println("default construcotr of super class");
	}
	
}
