package staticdmeo;

public class Website {
	
	static int counter;
	int num;
	
	//static block is called when class is loaded i.e. before constructor and called only once.
	static{
		System.out.println("static block called.");
		counter=0;
	}
	
	public Website() {
		System.out.println("constructor called.");
	}

	public void websiteVisited() {//non-static 
		counter++;
	}
	
	public int getWebsiteVisitedCount() {
		return counter;
	}
	
	public static void main(String[] args) {
		Website web1 = new Website();
		web1.websiteVisited();
		web1.websiteVisited();
		System.out.println("count1: " + web1.getWebsiteVisitedCount());//2
		
		Website web2 = new Website();
		web2.websiteVisited();
		System.out.println("count2: " + web2.getWebsiteVisitedCount());//3
		
		Website web3 = new Website();
		web3.websiteVisited();
		System.out.println("count3: " + web3.getWebsiteVisitedCount());//4
	}

}
