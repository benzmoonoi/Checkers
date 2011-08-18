package Table;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.TransferHandler;
import javax.swing.border.Border;


public class Table extends JFrame{

	JPanel panelFrame = new JPanel();
	
	JPanel box1 = new JPanel();
	JPanel box2 = new JPanel();
	JPanel box3 = new JPanel();
	JPanel box4 = new JPanel();
	JPanel box5 = new JPanel();
	JPanel box6 = new JPanel();
	JPanel box7 = new JPanel();
	JPanel box8 = new JPanel();
	JPanel box9 = new JPanel();
	JPanel box10 = new JPanel();
	JPanel box11 = new JPanel();
	JPanel box12 = new JPanel();
	JPanel box13 = new JPanel();
	JPanel box14 = new JPanel();
	JPanel box15 = new JPanel();
	JPanel box16 = new JPanel();
	JPanel box17 = new JPanel();
	JPanel box18 = new JPanel();
	JPanel box19 = new JPanel();
	JPanel box20 = new JPanel();
	JPanel box21 = new JPanel();
	JPanel box22 = new JPanel();
	JPanel box23 = new JPanel();
	JPanel box24 = new JPanel();
	JPanel box25 = new JPanel();
	JPanel box26 = new JPanel();
	JPanel box27 = new JPanel();
	JPanel box28 = new JPanel();
	JPanel box29 = new JPanel();
	JPanel box30 = new JPanel();
	JPanel box31 = new JPanel();
	JPanel box32 = new JPanel();
	JPanel box33 = new JPanel();
	JPanel box34 = new JPanel();
	JPanel box35 = new JPanel();
	JPanel box36 = new JPanel();
	JPanel box37 = new JPanel();
	JPanel box38 = new JPanel();
	JPanel box39 = new JPanel();
	JPanel box40 = new JPanel();
	JPanel box41 = new JPanel();
	JPanel box42 = new JPanel();
	JPanel box43 = new JPanel();
	JPanel box44 = new JPanel();
	JPanel box45 = new JPanel();
	JPanel box46 = new JPanel();
	JPanel box47 = new JPanel();
	JPanel box48 = new JPanel();
	JPanel box49 = new JPanel();
	JPanel box50 = new JPanel();
	JPanel box51 = new JPanel();
	JPanel box52 = new JPanel();
	JPanel box53 = new JPanel();
	JPanel box54 = new JPanel();
	JPanel box55 = new JPanel();
	JPanel box56 = new JPanel();
	JPanel box57 = new JPanel();
	JPanel box58 = new JPanel();
	JPanel box59 = new JPanel();
	JPanel box60 = new JPanel();
	JPanel box61 = new JPanel();
	JPanel box62 = new JPanel();
	JPanel box63 = new JPanel();
	JPanel box64 = new JPanel();
	
	JLabel Queen = new JLabel("Queen",SwingConstants.LEADING);
	JLabel Empty = new JLabel("    ",SwingConstants.LEADING);
	public Table(){
		
		Queen.setTransferHandler(new TransferHandler("text"));
		Empty.setTransferHandler(new TransferHandler("text"));
		
		Toolkit kit = Toolkit.getDefaultToolkit();
		Image img = kit.getImage("Image/thaichess.JPG");
		
		MouseListener listener = new DragMouseAdapter();
		Queen.addMouseListener(listener);
		Empty.addMouseListener(listener);
		setIconImage(img);
		setBackground(Color.white);
		
		panelFrame.setLayout(new GridLayout(8,8));
		panelFrame.setBackground(Color.WHITE);
		
		box1.setBackground(Color.WHITE);
		box1.add(Queen);
		box2.setBackground(Color.RED);
		box2.add(Empty);
		box3.setBackground(Color.WHITE);
		box4.setBackground(Color.RED);
		box5.setBackground(Color.WHITE);
		box6.setBackground(Color.RED);
		box7.setBackground(Color.WHITE);
		box8.setBackground(Color.RED);
		
		box9.setBackground(Color.RED);
		box10.setBackground(Color.WHITE);
		box11.setBackground(Color.RED);
		box12.setBackground(Color.WHITE);
		box13.setBackground(Color.RED);
		box14.setBackground(Color.WHITE);
		box15.setBackground(Color.RED);
		box16.setBackground(Color.WHITE);
		
		box17.setBackground(Color.WHITE);
		box18.setBackground(Color.RED);
		box19.setBackground(Color.WHITE);
		box20.setBackground(Color.RED);
		box21.setBackground(Color.WHITE);
		box22.setBackground(Color.RED);
		box23.setBackground(Color.WHITE);
		box24.setBackground(Color.RED);
		
		box25.setBackground(Color.RED);
		box26.setBackground(Color.WHITE);
		box27.setBackground(Color.RED);
		box28.setBackground(Color.WHITE);
		box29.setBackground(Color.RED);
		box30.setBackground(Color.WHITE);
		box31.setBackground(Color.RED);
		box32.setBackground(Color.WHITE);
		
		box33.setBackground(Color.WHITE);
		box34.setBackground(Color.RED);
		box35.setBackground(Color.WHITE);
		box36.setBackground(Color.RED);
		box37.setBackground(Color.WHITE);
		box38.setBackground(Color.RED);
		box39.setBackground(Color.WHITE);
		box40.setBackground(Color.RED);
		
		box41.setBackground(Color.RED);
		box42.setBackground(Color.WHITE);
		box43.setBackground(Color.RED);
		box44.setBackground(Color.WHITE);
		box45.setBackground(Color.RED);
		box46.setBackground(Color.WHITE);
		box47.setBackground(Color.RED);
		box48.setBackground(Color.WHITE);
		
		box49.setBackground(Color.WHITE);
		box50.setBackground(Color.RED);
		box51.setBackground(Color.WHITE);
		box52.setBackground(Color.RED);
		box53.setBackground(Color.WHITE);
		box54.setBackground(Color.RED);
		box55.setBackground(Color.WHITE);
		box56.setBackground(Color.RED);
		
		box57.setBackground(Color.RED);
		box58.setBackground(Color.WHITE);
		box59.setBackground(Color.RED);
		box60.setBackground(Color.WHITE);
		box61.setBackground(Color.RED);
		box62.setBackground(Color.WHITE);
		box63.setBackground(Color.RED);
		box64.setBackground(Color.WHITE);
		
		panelFrame.add(box1);panelFrame.add(box2);panelFrame.add(box3);panelFrame.add(box4);panelFrame.add(box5);panelFrame.add(box6);panelFrame.add(box7);panelFrame.add(box8);
		panelFrame.add(box9);panelFrame.add(box10);panelFrame.add(box11);panelFrame.add(box12);panelFrame.add(box13);panelFrame.add(box14);panelFrame.add(box15);panelFrame.add(box16);
		panelFrame.add(box17);panelFrame.add(box18);panelFrame.add(box19);panelFrame.add(box20);panelFrame.add(box21);panelFrame.add(box22);panelFrame.add(box23);panelFrame.add(box24);
		panelFrame.add(box25);panelFrame.add(box26);panelFrame.add(box27);panelFrame.add(box28);panelFrame.add(box29);panelFrame.add(box30);panelFrame.add(box31);panelFrame.add(box32);
		panelFrame.add(box33);panelFrame.add(box34);panelFrame.add(box35);panelFrame.add(box36);panelFrame.add(box37);panelFrame.add(box38);panelFrame.add(box39);panelFrame.add(box40);
		panelFrame.add(box41);panelFrame.add(box42);panelFrame.add(box43);panelFrame.add(box44);panelFrame.add(box45);panelFrame.add(box46);panelFrame.add(box47);panelFrame.add(box48);
		panelFrame.add(box49);panelFrame.add(box50);panelFrame.add(box51);panelFrame.add(box52);panelFrame.add(box53);panelFrame.add(box54);panelFrame.add(box55);panelFrame.add(box56);
		panelFrame.add(box57);panelFrame.add(box58);panelFrame.add(box59);panelFrame.add(box60);panelFrame.add(box61);panelFrame.add(box62);panelFrame.add(box63);panelFrame.add(box64);
		
		add(panelFrame);
		setTitle("Checkers");
		setBorder(BorderFactory.createEmptyBorder());
		setSize(500,500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
	}


	private void setBorder(Border createEmptyBorder) {
		// TODO Auto-generated method stub
		
	}


	private class DragMouseAdapter extends MouseAdapter {
		public void mousePressed(MouseEvent e) {
			JLabel c = (JLabel) e.getSource();
			TransferHandler handler = c.getTransferHandler();
			handler.exportAsDrag(c, e, TransferHandler.COPY);
		}
	}
	public static void main(String[] args){
		new Table();	   
	}
	
}
