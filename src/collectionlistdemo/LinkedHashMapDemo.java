package collectionlistdemo;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		Map<Integer, String> m1 = new LinkedHashMap<Integer, String>();//insertion order is maintained in linkedhashmap
		//Here key is of type integer and value is of type string
		m1.put(1, "one");
		m1.put(2, "Two");
		m1.put(3, "Three");
		m1.put(4, "Four");
		System.out.println(m1);
	}

}
