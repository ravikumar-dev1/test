package synchdemo;

public class ThreadPrintTableDemo implements Runnable{
	PrintTable printTable;
	int num;
	
	public ThreadPrintTableDemo(PrintTable printTable, int num) {
		this.printTable = printTable;
		this.num = num;
	}
	
	@Override
	public void run() {
		synchronized (printTable) {//thread is taking lock on shared resource printTable
			printTable.print(num);
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		PrintTable obj = new PrintTable();
//		ThreadPrintTableDemo o1 = new ThreadPrintTableDemo(obj, 5);
		Thread t1 = new Thread(new ThreadPrintTableDemo(obj, 7), "t1");
		Thread t2 = new Thread(new ThreadPrintTableDemo(obj, 10), "t2");
		t1.start();
//		t1.join();
		t2.start();
	}

	
}
