package fileReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

public class BufferedReaderExample {

	public static void main(String[] args) {
		
		File file= new File("/Users/Ali/Desktop/text.txt");
		//String file= "/Users/Ali/Desktop/text.txt";
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr= new FileReader(file);
			br= new BufferedReader(fr);
			
			String line= " ";
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found " + file.getPath());
			e.printStackTrace();
		} catch (IOException e) {
			
			e.printStackTrace();
		}finally {
		try {
			fr.close();
			br.close();
		} catch (IOException e) {
			
			e.printStackTrace();
		}

	}
	}
}
