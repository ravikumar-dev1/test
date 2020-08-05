package abstractdemo;

public abstract class Shape {
public float dim1, dim2;
	
	public Shape(float dim1, float dim2) {//You can't have abstract constructor because constructors are not inherited
		this.dim1 = dim1;
		this.dim2 = dim2;
	}
	
	public abstract float calcArea();//this is only deceleration there is no body or implementation to method
	
	public float getFirstDimension() {//in abstract you can have one or more than one implemented/concrete methods
		return dim1;
	}
	
//	public abstract static void fun1(); //You can't have static methods as abstract because static methods are not inherited
	
//	public abstract float calcVolume();
}
