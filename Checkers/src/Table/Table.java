package Table;

import javax.swing.JFrame;

public class Table extends JFrame{
	
	
	public Table(){
		setTitle("Checkers");
		setSize(200,200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		
	}
	
	public static void main(String[] args){
		new Table();
	}
	
}
