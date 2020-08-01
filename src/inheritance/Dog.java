package inheritance;

public class Dog extends Animal{

	//parameterized constructor
	public Dog(String color, int noOfLegs) {
		super(color, noOfLegs);
	}
	
	public void bark() {
		System.out.println("bark cat");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog dog = new Dog("Brown", 4);
		dog.eat();
		dog.bark();
	}

}
