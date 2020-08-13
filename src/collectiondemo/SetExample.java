package collectiondemo;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		int arr[] = {23, 45, 22, 23, 56, 78, 100, 3, 56};
		
		//length = 8
		System.out.println("duplicate elements are");
		for(int i=0; i < arr.length; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(arr[i] == arr[j])
					System.out.println(arr[i]);
			}
		}
		
		//you have to find elements present more than once using single for
		Set<Integer> s1 = new HashSet<>();
		System.out.println("duplicate elements are");
		for(int i=0; i < arr.length; i++) {
			if(! s1.add(arr[i]))
				System.out.print(arr[i] + " ");
		}

	}

}
