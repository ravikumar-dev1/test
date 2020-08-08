package exceptionDemo;

public class InvalidPasswordException extends RuntimeException {

	String msg;
	
	public InvalidPasswordException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}
