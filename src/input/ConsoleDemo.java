package input;

import java.io.Console;

public class ConsoleDemo {

//	You can't run console method to take input while code running in IDE.
	public static void main(String[] args) {
		Console console = System.console();
		System.out.println("console value is : " + console);
		
		String name = console.readLine();
		
		System.out.println("Enter input is: " + name);
	}

}
