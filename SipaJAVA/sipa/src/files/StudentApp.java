package files;

import java.io.File;
import java.util.Formatter;
import java.util.InputMismatchException;
import java.util.Scanner;

public class StudentApp {
	File file = new File("tmp.txt");
	Formatter out;
	float score;
	
	public StudentApp() {
		try {
			this.out = new Formatter(file);
		} catch (Exception e) {
			System.out.print(e.getMessage());
		}		
	}
	public void addRecord(Student student){
		out.format("%2d %-5s %3.2f\n",
				student.getId(),
				student.getName(),
				student.getScore());
		out.flush();
	}
	public Student input(){
		
		Scanner scan = new Scanner(System.in);
		System.out.print("id : ");
		int id = scan.nextInt();
		System.out.print("Name : ");
		String name = scan.next();
		System.out.print("score : ");
		float score = scan.nextFloat();
	
		return new Student(id,name,score);
	}
	public static void main(String[] args) {
		StudentApp st = new StudentApp();
		Scanner scan = new Scanner(System.in);
		char more = 'y';
		do {
			try {
				Student s = st.input();
				st.addRecord(s);
				System.out.println("ทำต่อหรือไม่ กด y เพื่อทำต่อ กด n เพื่อหยุด");
				more = scan.next().charAt(0);
			} catch (InputMismatchException e) {
				System.out.println("invalid input,try again");
			}		
		} while (more != 'n');
		System.out.println("Bye");
		
	}
}
