package inheritance;

//sub class
public class ChildClass extends ParentClass {
	
	public void childClassMethod() {
		num = 20;
		System.out.println("Inside childClassMethod");
		parentClassMethod();
//		marks = 78;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildClass childObj = new ChildClass();
//		childObj.childClassMethod();
		childObj.parentClassMethod();
	}

}
