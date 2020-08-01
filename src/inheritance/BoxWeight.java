package inheritance;

//subclass
public class BoxWeight extends Box {
	int weigth;
	int length = 10;
	
	public BoxWeight(int length, int width, int depth, int weigth) {
		super(length, width, depth);
		this.weigth = weigth;
		System.out.println("Boxweight constructor called.");
	}
	
	public BoxWeight() {
		super();
		System.out.println("Boxweight default called.");
	}
	
	public void subClassMethod() {
		System.out.println("Length is: " + super.length);
	}	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoxWeight boxWeight = new BoxWeight(1, 2, 3, 4);//created subclass object
		
		System.out.println("Volume of box is: " + boxWeight.calcVolume());
		
		boxWeight.subClassMethod();
		
//		boxWeight.weigth = 56;
//		boxWeight.superClassMethod();
		
		//
		
	}

}
