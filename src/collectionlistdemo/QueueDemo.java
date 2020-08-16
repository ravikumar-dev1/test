package collectionlistdemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	
	public static void main(String[] args) {
		Queue<Integer> q1 = new LinkedList<>();
		
		q1.add(56);
		q1.add(6);
		q1.add(556);
		
		System.out.println(q1);
		System.out.println("peek element " + q1.peek());//front element
		System.out.println("poll element " + q1.poll());//It returns front element and remove that element from queue
		System.out.println("size: " + q1.size());
	}

}
