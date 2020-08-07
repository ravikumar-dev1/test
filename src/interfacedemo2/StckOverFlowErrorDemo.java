package interfacedemo2;

public class StckOverFlowErrorDemo {

	public void fun1() {
		fun1();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StckOverFlowErrorDemo obj = new StckOverFlowErrorDemo();
		obj.fun1();
	}

}
