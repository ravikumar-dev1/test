package synchdemo;

public class ThreadTest implements Runnable{
	ProducerConsumerClass obj;
	
	public ThreadTest(ProducerConsumerClass obj) {
		this.obj = obj;
	}
	
	@Override
	public void run() {
		obj.produce();
	}

}
