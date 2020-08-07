package exceptionDemo;


//you're defining ur own exception
public class NegativeDepositAmountException extends Exception {
	String message;
	
	public NegativeDepositAmountException(String message) {
		this.message = message;
	}
	
	public String getMessage() {
		return message;
	}

}
