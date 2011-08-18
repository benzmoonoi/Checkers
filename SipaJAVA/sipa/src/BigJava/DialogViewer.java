package BigJava;

import java.io.PrintStream;

import javax.swing.JOptionPane;

public class DialogViewer {
	public static void main(String[] args){
		PrintStream p = System.out;
/*		JOptionPane.showMessageDialog(null, "Hello,	World!");
		System.exit(0);*/
		String name = JOptionPane.showInputDialog("What is your name?");
			p.println(name);
			System.exit(0);
	}
}
