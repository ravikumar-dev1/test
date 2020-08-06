package interfacedemo;

interface IADemo {//access specifier of interface will be always public
	public static final float dim1 = 3.4f;
//	private int a=3;//Private are not allowed
	
/*	public IADemo(){//constructors are not allowed in interface
		
	}*/
	
	public void calcArea(); //interface methods are always public and abstract

	//These below method will be able compile on JDK 9 version
	/*private void fun1() {
		
	}
	
	private static void fun2() {
		
	}*/

}
