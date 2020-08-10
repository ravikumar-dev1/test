package synchdemo;

public class TestProblem {

	public static void main(String[] args) {
		try{
			ProducerConsumerClass obj = new ProducerConsumerClass();
//			ThreadTest o1 = new ThreadTest(obj);
			
			Thread t1 = new Thread(new Runnable() {
				@Override
				public void run() {
					obj.produce();
				}
			});
			
			Thread t2 = new Thread(new Runnable() {
				@Override
				public void run() {
					obj.consume();
				}
			});
			
			t1.start();
			t2.start();
			
		}catch (Exception e) {
			// TODO: handle exception
		}
		

	}

}
