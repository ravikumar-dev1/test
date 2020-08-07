package interfacedemo2;

public interface IProduct {

	void setPrice(int price);
	String getProductName();
	int getProductPrice();
	
	public default int convertDollarToRuppe(int price) {
		return price * 75;
	}
}
