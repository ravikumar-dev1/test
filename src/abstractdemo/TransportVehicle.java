package abstractdemo;

public class TransportVehicle extends Car{
	int validity_no, period;
	String start_date;
	
	public TransportVehicle(int reg_no, int model, String reg_date, int validity_no, int period, String start_date) {
		super(reg_no, model, reg_date);
		this.validity_no = validity_no;
		this.period = period;
		this.start_date = start_date;
	}
	
	@Override
	public void printData() {
		System.out.println("Reg_no "+reg_no +"\t validity_no: "+validity_no);
	}

	public static void main(String[] args) {
		Car car[] = new Car[5];
		car[0] = new TransportVehicle(34, 23, "09-aug-2020", 50, 2, "09-aug-2020");
		car[1] = new TransportVehicle(44, 233, "9-aug-2019", 50, 2, "09-Nov-2019");
		car[2] = new PrivateVehicle(44, 233, "9-aug-2019","ABC", "XYZ");
		car[3] = new PrivateVehicle(44, 233, "9-aug-2019","ABC1", "XYZ1");
		car[4] = new PrivateVehicle(424, 233, "10-aug-2019","ABC2", "XYZ2");
		
		for(int counter = 0; counter <car.length; counter++) {
			car[counter].printData();
		}
		
		

	}

}
