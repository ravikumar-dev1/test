package abstractdemo;

public abstract class Car {
	int reg_no, model;
	String reg_date;
	
	public Car(int reg_no, int model, String reg_date){
		this.reg_no = reg_no;
		this.model = model;
		this.reg_date = reg_date;
	}
	
	public abstract void printData();

}
