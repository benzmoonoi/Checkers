import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;


public class MyFrame6 extends JFrame implements ListSelectionListener{
	private JList colorList;	//List to display colors
	private final String colorName[] = {"Black","Blue","Cyan",
			"Dark_Gray","Green","Light_Gray",
			"Magenta","Orange","Pink"};
	private final Color colors[] = {Color.black,Color.blue,Color.CYAN,
			Color.DARK_GRAY,Color.GREEN,Color.LIGHT_GRAY,
			Color.MAGENTA,Color.ORANGE,Color.PINK};
	JPanel panel = new JPanel();
	public MyFrame6() {
		colorList = new JList(colorName);
		JScrollPane scroll = new JScrollPane(colorList);
		add(panel);
		panel.add(scroll);
		
		//panel.add(colorList);
		panel.add(new JScrollPane(colorList));
		panel.setBackground(Color.yellow);
		colorList.addListSelectionListener(this);
		
		setSize(300,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MyFrame6();
	}

	@Override
	public void valueChanged(ListSelectionEvent arg0) {
		// TODO Auto-generated method stub
		System.out.println(colorList.getSelectedIndex());
		//step
		/*int index = colorList.getSelectedIndex();
		Color color = colors[index];
		panel.setBackground(color);*/
		panel.setBackground(colors[colorList.getSelectedIndex()]);
		
	}

}
