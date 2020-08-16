package collectionlistdemo;

import java.util.List;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		List<Integer> l = new Vector<>();
		l.add(34);
		l.add(78);
		
		System.out.println(l);
		
		
		System.out.println(l.get(0));//synch methods
		//performance slow because all methods are synch
		
		}

}
