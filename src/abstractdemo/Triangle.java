package abstractdemo;

public class Triangle extends Shape{

	public Triangle(float dim1, float dim2){
		super(dim1, dim2);
	}
	
	public float calcArea() {//here we have implemented abstract calcArea method of class shape
		return (dim1 * dim2)/2;
	}
	
	public float calcVolume(){	
		return 3.4F;
	}
	
	@Override//annotation
	public String toString(){
		return dim1 + " " + dim2;
	}
	
	//can't overriden final method from shape class
	/*public void demoMethod(){
		System.out.println("Shape's final method");
	}*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape arr[] = new Shape[3];
		arr[0] = new Triangle(3.4F, 5);
		arr[1] = new Rectangle(2.0F, 5);
		arr[2] = new Rectangle(3.0F, 5);
		
		/*for(int counter = 0; counter < arr.length; counter++) {
			System.out.println("Dimensions are " + arr[counter]);
			System.out.println("Area: is " + arr[counter].calcArea());//method overriding
			
		}	*/	
		
		Shape shape;//its just creating ref of Shape class
		
		shape = new Rectangle(2.0f, 2);
		System.out.println("Area is: " + shape.calcArea());
		
		//Shape shape = new Shape(2.3f, 6); You can't create object of abstract class
		
		
	}

}
