package test;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String dayOfTheWeek = "Sun";
		
		switch (dayOfTheWeek) {
		case "Mon" :
		case "Tue" :
		case "Wed" :
			System.out.println("Today is working day, so no fun");
			break;
		case "Sun" :
			System.out.println(" Today is not working day, so have fun");
			break;
		/*default:
			System.out.println("Invalid day of the week");
			break;*/
		}
		
		
		
	}

}
