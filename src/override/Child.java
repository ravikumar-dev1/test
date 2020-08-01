package override;

public class Child extends Parent{

	//method overriding
	 void show() {
//		super.show();
		System.out.println("Inside child show method");
	}
	 
	 private void fun1() {
			System.out.println("This is private method of Parent class");
	 }
	
	//If i want to call parent's show method, how to do that?
	
	public static void main(String[] args) {
		Child child = new Child();
//		child.show();
		Parent parent = new Child();
		parent.show();//run time polymorphism
	}

}
