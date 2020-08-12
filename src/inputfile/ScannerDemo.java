package inputfile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("C:\\Users\\nilesh.gavhane\\Desktop\\test.txt"));
		
		String line;
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}

	}

}
