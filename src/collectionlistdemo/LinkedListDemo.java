package collectionlistdemo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

	public static void main(String[] args) {
	List l1 = new LinkedList<>();//it intetrnally stores elements in array
		
	l1.add("abc");
	l1.add(1);
	l1.add("abc");
	l1.add('g');

	System.out.println(l1);

	}

}
