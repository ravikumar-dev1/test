package interfacedemo;

public interface ISecond {
	//After Java 8 version allowed
	public default void concreteMethod() {
		System.out.println("This is IADemo default method.");
	}
}
