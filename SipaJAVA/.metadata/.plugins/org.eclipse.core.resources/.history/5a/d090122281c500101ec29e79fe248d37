import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;


public class readFile {

	public static void main(String[] args) {
		int temp = 0;
		File file = new File("E:/score.txt");
		try {			
			Scanner scan = new Scanner(file);
			while(scan.hasNext()){
				//temp += scan.nextInt();
				try {
					System.out.println(scan.nextInt());
				} catch (InputMismatchException e) {
					System.out.println("eception Inputmis");
					scan.next();
				}				
			}
		} catch (FileNotFoundException e) {
			System.out.println("Fie not found");
		}
		//System.out.println(temp);
	}
}
