package override;

public class Triangle extends Shape{

	public Triangle(float dim1, float dim2){
		super(dim1, dim2);
	}
	
	public float calcArea() {
		return (dim1 * dim2)/2;
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
		
		for(int counter = 0; counter < arr.length; counter++) {
			System.out.println("Dimensions are " + arr[counter]);
			System.out.println("Area: is " + arr[counter].calcArea());//method overriding
			
		}		
		
		
		
	}

}
