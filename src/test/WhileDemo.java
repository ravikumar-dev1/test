package test;

public class WhileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//print even numbers between 0-100
		int counter = 0;
		/*while(counter <= 100) {
			if(!(counter % 2 != 0)) {
				System.out.println(counter + " is even.");
			}
			counter++;
		}*/
		
		while(counter <= 100) {
			System.out.println(counter + " is even.");
			//counter = counter + 2;
			counter += 2;
		}
		
		int i, j;
		i=100;
		j=200;
		
		//101<199
		//102<198
		//149<151
		//150<150
		while(++i < --j){
		
		System.out.println("Value of i is "+i);
		}
		System.out.println("Value of j is "+j);
	}

}
