package collectionlistdemo;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		Queue<Integer> q1 = new PriorityQueue<>();//insertion order maintain nahi hot
		
		q1.add(67);
		q1.add(7);
		q1.add(679);

		System.out.println(q1);
		
		Queue<String> q2 = new PriorityQueue<>();
		q2.add("f");
		q2.add("a");
		q2.add("b");
		q2.add("y");
		
		System.out.println(q2);
		//priority queue stores elements in ascending order
		
	}

}
