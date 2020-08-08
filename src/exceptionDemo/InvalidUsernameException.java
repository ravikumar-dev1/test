package exceptionDemo;

public class InvalidUsernameException extends RuntimeException {
	String msg;
	
	public InvalidUsernameException(String msg) {
		this.msg = msg;
	}
	
	public String getMessage() {
		return msg;
	}
}
