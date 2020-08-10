package synchdemo;

public class ThreadTest2 implements Runnable{
ProducerConsumerClass obj;
	
	public ThreadTest2(ProducerConsumerClass obj) {
		this.obj = obj;
	}

	@Override
	public void run() {
		obj.consume();
	}

}
