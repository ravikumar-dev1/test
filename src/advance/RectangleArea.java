package advance;

public class RectangleArea {
	float length;
	float width;
	
	RectangleArea(float length, float width){
		this.length = length;
		this.width = width;
	}
	
	
/*	void setDimenesions(float length, float width){
		this.length = length;
		this.width = width;
	}*/
	
	float calcArea() {
		return length * width;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		RectangleArea obj  = new RectangleArea(4, 2);
		
//		System.out.println("Area: " + obj.calcArea());
		
		RectangleArea obj1  = new RectangleArea(10, 20);
		
		//obj3
		
		//obj1000
		System.out.println("Area: " + obj.calcArea());//0, 8, 200	
		System.out.println("Area: " + obj1.calcArea());//0, 8, 200	
	}

}
