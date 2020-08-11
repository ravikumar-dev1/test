package input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class InputDemo2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the array");
		String num1 = reader.readLine();
		String arr [] = num1.split(" ");
		System.out.println("array length: "+arr.length);
		int result = 0;
		for(int i=0; i<arr.length; i++) {
			result += Integer.parseInt(arr[i]);
		}
		System.out.println("Entered array is "+Arrays.toString(arr));
		System.out.println("REsult is "+result);

	}

}
