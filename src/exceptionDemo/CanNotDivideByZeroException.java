package exceptionDemo;


//This is user defined
public class CanNotDivideByZeroException extends RuntimeException {
	String msg;
	
	public CanNotDivideByZeroException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
	
	
}
