package collectionlistdemo;

import java.util.Hashtable;
import java.util.Map;

public class MapDemo {

	public static void main(String[] args) {
		//Map stores key value pair
		Map<Integer, String> m1 = new Hashtable<>();
		//Here key is of type integer and value is of type string
		m1.put(1, "one");
		m1.put(2, "Two");
		m1.put(3, "Three");
		m1.put(4, "Four");
		System.out.println(m1);//First way to print map

		//below is Another way to print map
		for(Map.Entry<Integer, String> m : m1.entrySet()) {
			System.out.println("key: " + m.getKey()+"\tvalue: "+m.getValue());
		}
		
		//Insertion order is not maintained in hashtable

	}

}
