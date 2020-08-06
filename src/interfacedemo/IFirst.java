package interfacedemo;

public interface IFirst {

	public void calcArea();
	
	//After Java 8 version allowed and its optional
	public default void concreteMethod() {
		System.out.println("This is IADemo default method.");
	}
		
	//for new req. you have to add new method inIFirst interface
	public default void calcPerimeter() {
		
	}
	
}
