
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.Panel;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class MyFrame extends JFrame{

	// Default Constructor
	public MyFrame(){
		
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("images/appGallery_skin.gif");	// set Icon of frame
		setIconImage(img);
		// create components
		
		Image img1 = kit.getImage("images/icon_widget.png");
		Image img2 = kit.getImage("images/icon_languagePack.gif");
		Icon icon1 = new ImageIcon(img1);	// set Icon button1
		Icon icon2 = new ImageIcon(img2);	// set Icon button1

		
		JButton b1 = new JButton("Click Me",icon1); //set Images
		b1.setRolloverIcon(icon2);
		//b1.setToolTipText("don't click");
		//add(b1,BorderLayout.SOUTH);
		//b1.setBounds(50,100,100,25);
		b1.setVerticalTextPosition(SwingConstants.BOTTOM);
		b1.setHorizontalAlignment(SwingConstants.CENTER);
		
		JButton b2 = new JButton("Click Me b2", icon1);
		b2.setRolloverIcon(icon2);
		//add(b2,BorderLayout.SOUTH);		
		//setLayout(new FlowLayout());
		b2.setVerticalTextPosition(SwingConstants.BOTTOM);
		b2.setHorizontalAlignment(SwingConstants.CENTER);
		
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.red);
		panel.add(b1);
		panel.add(b2);
		add(panel,BorderLayout.SOUTH);
		
		//setLayout(null);
		setVisible(true);
	}	
	// Constructor
	public MyFrame(String name){
		this();
		this.setTitle(name);		
	}
	
	public static void main(String args[]){
		MyFrame f = new MyFrame("Hello JFrame");
	}
}

