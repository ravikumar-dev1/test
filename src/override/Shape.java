package override;

public class Shape {
	public float dim1, dim2;
	
	public Shape(float dim1, float dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public float calcArea() {
		System.out.println("Invalid shape to calculate area");
		return -1.0F;
	}
	
	public final void demoMethod(){
		System.out.println("Shape's final method");
	}
	
}
