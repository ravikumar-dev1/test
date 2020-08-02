package override;

public class Child extends Parent{

	//method overriding
	 public void show() {
//		super.show();
		System.out.println("Inside child show method");
	}
	 
	 //in java you can't override private methods
	 private void fun1() {
			System.out.println("This is private method of child class");
	 }
	 
	 //in java you can't override static methods
	public static void statMethod(){
		System.out.println("Child's static method called");
	}
	
	@Override//annotation
	public String toString(){
		return "this is child class object.";
	}
	
	//If i want to call parent's show method, how to do that?
	
	public static void main(String[] args) {
		Child child = new Child();
//		child.show();
		Parent parent = new Child();
		parent.show();//run time polymorphism
//		parent.fun1(); //you can't override private method in subclass
		parent.statMethod();//compile time binding
		Parent.statMethod();//compile time binding
		
		System.out.println("Object value is " + parent);
	}

}
