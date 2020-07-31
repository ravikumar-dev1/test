package inheritance;

public class BoxCourier  extends BoxWeight{

	
	//compiler will add default constructor
	public BoxCourier(){
		super();
		super.length = 2;
		depth=23;
		System.out.println("BoxCourier default constructor called");
	}
	
	public static void main(String[] args) {
//		BoxWeight boxWeight = new BoxWeight();
		BoxCourier boxCourier = new BoxCourier();
		boxCourier.subClassMethod();
		
	}

}
