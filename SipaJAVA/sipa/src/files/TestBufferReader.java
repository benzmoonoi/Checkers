package files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TestBufferReader {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException{
		FileReader fileR = new FileReader("tmp.txt");
		BufferedReader buf = new BufferedReader(fileR);
		
		
		/*while ((line = buf.readLine()) != null) {
			System.out.println(line);			
		}*/
		for(String line;(line = buf.readLine())!= null;){
			System.out.println(line);	
		}

	}

}
