package interfacedemo2;

public class Pen implements IProduct{
	int price;

	@Override
	public void setPrice(int price) {
		this.price = convertDollarToRuppe(price);
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "pen";
	}

	@Override
	public int getProductPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}



}
