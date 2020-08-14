package collectionlistdemo;

public interface IQueueOperations {
	public void enqueue(int num);
	public int dequeue() throws Exception;
	public int size();
	public int getFrontElement();
	public int getRearElement();
}
