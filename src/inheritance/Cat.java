package inheritance;

public class Cat extends Animal{

	//parameterized constructor
	public Cat(String color, int noOfLegs) {
		super(color, noOfLegs);
	}
	
	public void meow() {
		System.out.println("Meow cat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cat cat = new Cat("White", 4);
		
		cat.eat();
		cat.meow();
//		cat.bark();
	}

}
