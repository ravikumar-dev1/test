package interfacedemo2;

public class EarPhone implements IProduct{

	int price;

	@Override
	public void setPrice(int price) {
		this.price = convertDollarToRuppe(price);
	}

	@Override
	public String getProductName() {
		// TODO Auto-generated method stub
		return "EarPhone";
	}

	@Override
	public int getProductPrice() {
		// TODO Auto-generated method stub
		return price;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EarPhone obj = new EarPhone();
		obj.setPrice(10);
		System.out.println("Price of earphone in india is " + obj.getProductPrice());
	}

}
