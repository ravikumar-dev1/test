package synchdemo;

import java.util.Scanner;

public class ProducerConsumerClass {
	private int num;
	
	public void produce(){
		Scanner scanner = new Scanner(System.in);
		try {
			while(true) {
				synchronized (this) {//it will take lock/monitor on this
					System.out.println("Produce the number");
					int num = scanner.nextInt();
					this.num = num;
					notifyAll();//this will wake up thread which is waiting on lock this
					//notify();//it will wake up single high priority thread
					wait();//to give up the lock
				}
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void consume(){
		try{
			Thread.sleep(100);//thread will sleep for 100 ms
			while(true) {
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
