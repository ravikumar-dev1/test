package inputfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		//Reading using BufferedReader is more efficient because it stores/bufferes characters 
		BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\nilesh.gavhane\\Desktop\\test.txt"));

		String line;
		while((line = reader.readLine()) != null){
			System.out.println(line);
			System.out.println("executing");
		}
		
		
	}

}
