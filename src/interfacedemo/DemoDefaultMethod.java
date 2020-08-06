package interfacedemo;

public class DemoDefaultMethod implements IFirst, ISecond{

	public void concreteMethod() {
//		ISecond.super.concreteMethod();
		System.out.println("My own implemention");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		
	}




}
