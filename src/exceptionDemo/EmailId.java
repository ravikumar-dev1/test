package exceptionDemo;

public class EmailId {
	String username = "abc", domainId="@gmail.com", password="password";
	
	public EmailId() {//initialize user1 creds
		username = "abc";
		password = "password";
	}
	
	
	public EmailId(String username, String domainId, String password) throws NullPointerException{
		if(! this.username.equals(username))
			throw new InvalidUsernameException("Please enter the correct username");
		if(! this.password.equals(password))
			throw new InvalidPasswordException("Please enter the correct password");
		this.username = username;
		this.password = password;
		this.domainId = domainId;
	}
	
	public static void main(String[] args) {
		EmailId obj = new EmailId();
		
		//user will enter his creds here
		String username = "abc";
		String passsword = "password2";
		
		try {
			EmailId obj2 = new EmailId(username, "@gmail.com", passsword);
		} catch (InvalidUsernameException | InvalidPasswordException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
			return;
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unknown exception occurred");
			return;
		}
		
		System.out.println("date is valid");

	}

}
