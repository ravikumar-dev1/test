package abstractdemo;

public class PrivateVehicle extends Car{
	String owner_name, owner_address;
	
	public PrivateVehicle(int reg_no, int model, String reg_date, String owner_name, String owner_address) {
		super(reg_no, model, reg_date);
		this.owner_name = owner_name;
		this.owner_address = owner_address;
	}

	@Override
	public void printData() {
		System.out.println("Reg_no "+reg_no +"\t owner_name: "+owner_name);
		
	}
	
	
}
