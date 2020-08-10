package threaddemo;

public class JoinDemo extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside run method.");
		for(int i=0;i<100; i++)
			System.out.print(i + " ");
		System.out.println();
	}
	
	public void fun1(){
	System.out.println("inside fun1");	
	}

	public static void main(String[] args) throws InterruptedException {
		JoinDemo obj = new JoinDemo();
		obj.start();
		obj.join();
		System.out.println("After thread start");//this will get executed when above thread get executed completely
	}

}
