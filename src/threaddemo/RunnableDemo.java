package threaddemo;

public class RunnableDemo implements Runnable{

	//run  method is entry point for any thread
	@Override
	public void run() {//task1
		System.out.println("run-Thread name "+Thread.currentThread().getName());//t1-2nsec
//		System.out.println("Inside run method.");
	}
	
	public void fun1(){//task2
		System.out.println("fun1-Thread name "+Thread.currentThread().getName());
	}
	
	//3thread 1. main 2.my new thread t1 3.latest thread t2
	
	public static void main(String[] args) {
		RunnableDemo obj = new RunnableDemo();
		Thread t1 = new Thread(obj, "my new thread t1");//here we are creating new thread and state will be new
		Thread t2 = new Thread(obj, "latest thread t2");
//		System.out.println("main-Thread name " + Thread.currentThread().getName());
		//1-min
		//10-max
		t1.setPriority(Thread.MAX_PRIORITY);//10-max pri it doesnt not garuntee ur thread will execute first
		t1.start();//this will create new thread and thread will be in runnable(ready to run/execute) state
//		obj.fun1();//this line will be executed by main thread
		t2.start();
		//any thread can execute first
	}

}
