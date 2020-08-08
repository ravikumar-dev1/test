package exceptionDemo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.FileSystemNotFoundException;

public class FileContentReadDemo {
	
	public void printData(String fileName) {
		
		try {
			FileReader fileReader  = new FileReader(fileName);//Here ur getting file handle
			BufferedReader reader = new BufferedReader(fileReader); //here actually streaming file content to buffer reader
			
			String line = "";
			while((line = reader.readLine()) != null) {
				System.out.println(line);
			}
		}catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File " + fileName + " not found on computer.");
		}catch(IOException  e) {
			System.out.println("Error while reading file content " + fileName);
		}catch (Exception e) {//This is generic exception handling
			System.out.println("Unknown exception occurred.");
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FileContentReadDemo obj = new FileContentReadDemo();
		
		obj.printData("C:\\Users\\nilesh.gavhane\\Desktop\\test1.txt");
	}

}
