package collectiondemo;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<String> s1 = new LinkedHashSet<>();//duplicates are not allowed and insertion order is maintained
		
		s1.add("vf");
		s1.add("af");
		s1.add("aaa");
		s1.add("gd");

		System.out.println(s1);//LinkedHashSet maintains the insertion order

	}

}
