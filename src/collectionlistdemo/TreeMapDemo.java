package collectionlistdemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		Map<Integer, String>m1 = new TreeMap<>();//it stores in sorted order
		
		m1.put(1, "one");
	
		m1.put(3, "three");
		m1.put(4, "four");
		m1.put(2, "two");
		
		System.out.println(m1);

	}

}
