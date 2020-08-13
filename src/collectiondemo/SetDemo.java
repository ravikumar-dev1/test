package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class SetDemo {

	public static void main(String[] args) {
		Set s1 = new HashSet<>();
		
		s1.add("ABC");//string
		s1.add(23);//integer
		s1.add('a');//character
		s1.size();
		
		System.out.println(s1);
		s1.add(23);//set doesn't allow duplicate element to be inserted
		System.out.println(s1);
		
		int arr[] = new int[5];
//		arr[0] = "abc";
		
		Set<Integer> s2 = new HashSet<Integer>();
		s2.add(1);
		s2.add(100);
		s2.add(2);
		
		System.out.println(s2);		
//		s2.add("abc");
		Set<String> s3 = new HashSet();
		
		s3.add("vf");
		s3.add("af");
		s3.add("aaa");
		s3.add("gd");
		
		System.out.println("s3: " +s3);
		//Hashset doesn't maintain the insertion order of elements
		
	}

}
