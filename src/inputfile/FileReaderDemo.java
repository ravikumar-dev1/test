package inputfile;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		FileReader reader = new FileReader("C:\\Users\\nilesh.gavhane\\Desktop\\test.txt");
		int num ;
		while((num = reader.read()) != -1)//FileReader reads file content character by character. when end of file it returns -1
			System.out.print((char)num);
	}

}
