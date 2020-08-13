package collectiondemo;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		Set<Integer> s1 = new TreeSet<>();//stored in sorted order and duplicates are not allowed
		
		s1.add(56);
		s1.add(6);
		s1.add(5);
		s1.add(5346);
		s1.add(2);
		s1.add(6);
		s1.size();
		
		System.out.println(s1);
		
		Set<String> s2 = new TreeSet<>();
		
		s2.add("f");
		s2.add("e");
		s2.add("a");
		s2.add("z");
		
		System.out.println(s2);
		
		Set<String> s3 = new TreeSet<>();
		
		s3.add("vf");
		s3.add("af");
		s3.add("aaa");
		s3.add("gd");
		
		System.out.println(s3);
	}

}
