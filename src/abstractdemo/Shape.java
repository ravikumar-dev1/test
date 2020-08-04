package abstractdemo;

public abstract class Shape {
public float dim1, dim2;
	
	public Shape(float dim1, float dim2) {
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public abstract float calcArea();//this is only deceleration there is no body or implementation to method
	
//	public abstract float calcVolume();
}
