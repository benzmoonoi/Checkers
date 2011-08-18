import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


public class MyFrame7 extends JFrame{
	JPanel panel = new JPanel();
	JButton b1 = new JButton("OK");
	JButton b2= new JButton("OK2");

	public MyFrame7() {
		// TODO Auto-generated constructor stub
		add(panel);
		panel.add(b1);
		/*
		 * if 2 button
		 */
		/*Handler h = new Handler();
		b1.addActionListener(h);
		b2.addActionListener(h);*/
		//bOK.addActionListener(new Handler()); // register
		// call is b1is one use
		b1.addActionListener(new ActionListener() {// Anonymous inner class
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub
				System.out.println("Hello Anonymous inner class");
			}
		});
	}
	// inner class Handler
	class Handler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent arg0) {
			// TODO Auto-generated method stub
			System.out.println("Hello inner class");
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyFrame7 f = new MyFrame7();
		f.setSize(200,200);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);	
	}

}
