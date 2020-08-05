package interfacedemo;

public class InterfaceDemo implements IBDemo{//You can implement multiple interfaces

	public void calcArea() {
		System.out.println(dim1);
	}
	
	public void demoMethod() {
		
	}
	
	public static void main(String[] args) {
//		IADemo obj = new IADemo();//You can't create object of interface
		IADemo obj;//You can create reference of interface
		obj = new InterfaceDemo();
		obj.calcArea();
	}

}
