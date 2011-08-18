import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Calculate extends JFrame {
	JTextField txtINput = new JTextField();
	JPanel cPanel = new JPanel();
	JPanel lPanel = new JPanel();
	JPanel hPanel = new JPanel();
	
	public Calculate() {
		initComponent();
		add(txtINput,BorderLayout.NORTH);
		cPanel.setLayout(new GridLayout(4, 5));
		
		add(cPanel);
		add(lPanel,BorderLayout.WEST);
		lPanel.setBackground(Color.blue);
		lPanel.setLayout(new GridLayout(0,1));
		add(hPanel,BorderLayout.NORTH);
		hPanel.setBackground(Color.red);
				
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	JButton b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
	JButton mc,mr,ms,m;
	JButton bk,ce,c;
	
	private void initComponent() {
		b0 = new JButton("0");
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		
		mc = new JButton("MC");
		mr = new JButton("MR");
		ms = new JButton("MS");
		m = new JButton("M+");
		
		//cPanel.add(b0);
		cPanel.add(b7);
		cPanel.add(b8);
		cPanel.add(b9);
		cPanel.add(b4);
		cPanel.add(b5);
		cPanel.add(b6);
		cPanel.add(b1);
		cPanel.add(b2);
		cPanel.add(b3);
		
		lPanel.add(mc);
		lPanel.add(mr);
		lPanel.add(ms);
		lPanel.add(m);
		
		bk = new JButton("Backspace");
		ce = new JButton("CE");
		c = new JButton("C");
		
		hPanel.add(bk);
		hPanel.add(ce);
		hPanel.add(c);
		
	}
	public static void main(String[] args) {
		Calculate f = new Calculate();

	}

}
