package threaddemo;

public class ThreadDemo extends Thread{
	
	@Override
	public void run(){
		System.out.println("Inside running: "+ Thread.currentThread().getName());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Inside main: "+ Thread.currentThread().getName());
		ThreadDemo t1 = new ThreadDemo();//it create new thread
		t1.setName("xyz");
		t1.start();
		//t1.run();//it does not assign task to execute by new thread
	}

}
