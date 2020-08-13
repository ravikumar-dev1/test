package collectionlistdemo;


import java.util.ArrayList;
import java.util.List;


public class ArrayListDemo {

	public static void main(String[] args) {
		List l1 = new ArrayList<>();//it intetrnally stores elements in array
		
		l1.add("abc");
		l1.add(1);
		l1.add("abc");
		l1.add('g');
		
		System.out.println(l1);
		System.out.println(l1.size());
		System.out.println(l1.get(2));

	}

}
