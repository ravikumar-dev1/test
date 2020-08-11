package synchdemo;

import java.util.Scanner;

public class ProducerConsumerClass {
	private int num;
	
	//t1 will excute below produce method()
	public void produce(){
		Scanner scanner = new Scanner(System.in);
		try {
			
			while(true) {//infinite loop
				synchronized (this) {//it will take lock/monitor on this
					System.out.println("Produce the number");
					int num = scanner.nextInt();
					this.num = num;
					wait();//to give up the lock
					notify();//this will wake up thread which is waiting on lock this
					//notify();//it will wake up single high priority thread
					
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	//t2 will execute below consume()
	public void consume(){
		try{
			Thread.sleep(100);//thread will sleep for 100 ms
			while(true) {//infinite loop
				//if thread doesn't get lock it went into blocked state
				synchronized (this) {//it will take lock/monitor on this
					System.out.println("consuming the number "+ this.num);
					notifyAll();
					wait();//lock released
				}
			}
		}catch (Exception e) {
			// TODO: handle exception
		}
	}
}
