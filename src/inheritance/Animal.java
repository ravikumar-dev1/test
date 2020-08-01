package inheritance;

public class Animal {
	String color;
	int noOfLegs;
	
	public Animal(String color, int noOfLegs){
		this.color = color;
		this.noOfLegs = noOfLegs;
	}
	
	protected void eat() {
		System.out.println("Animal is eating.");
	}
	
	public Animal(){}

}
