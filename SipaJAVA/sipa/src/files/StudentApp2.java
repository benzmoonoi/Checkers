package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;

public class StudentApp2 {

	File file;
	
	public StudentApp2(String fileName) {
		file = new File(fileName);
	}
	public StudentApp2(File file2) {
		file = file2;
	}
	public void listAllRecord(){
		System.out.println("list of student");
		try {
			Scanner scan = new Scanner(file);
			while (scan.hasNext()) {
				System.out.println(scan.nextLine());				
			}
		} catch (FileNotFoundException e) {
			System.out.print(e.getMessage());
		}
	}
	public static void main(String[] args) {		
		JFileChooser chooser = new JFileChooser();
		chooser.showOpenDialog(null);
		File file = chooser.getSelectedFile();
		StudentApp2 app = new StudentApp2(file);
		app.listAllRecord();

	}

}
