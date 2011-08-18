import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class MyFrame4 extends JFrame{
	JButton b1,b2;
	JTextField txt = new JTextField(20);
	JPanel jPanel;
	public MyFrame4() {
		ActionHandler ac = new ActionHandler();
		// TODO Auto-generated constructor stub
		b1 = new JButton("button1");
		b1.addActionListener(ac);
		b2 = new JButton("button2");
		b2.addActionListener(ac);
		txt.addActionListener(ac);
		jPanel = new JPanel();
		add(b1);
		add(b2);
		add(txt);
		setLayout(new FlowLayout());
		
		setSize(400,100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	class ActionHandler implements ActionListener{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			if(e.getSource() == b1){
				System.out.println("Hello b1");
			}else if(e.getSource() == b2){
				System.out.println("Hi b2");
			}else if(e.getSource() == txt){
				System.out.println(e.getActionCommand());
			}
		}
		
	}
	public static void main(String args[]){
		MyFrame4 f = new MyFrame4();
	}

}
