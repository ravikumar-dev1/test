package abstractdemo;

public class Rectangle extends Shape{

	public Rectangle(float dim1, float dim2){
		super(dim1, dim2);
	}
	
	public float calcArea() {
		System.out.println("Inside rectanle calcArea method");
		return dim1 * dim2;
	}
	
	@Override//annotation
	public String toString(){
		return dim1 + " " + dim2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
