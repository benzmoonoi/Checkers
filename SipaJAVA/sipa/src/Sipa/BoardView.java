package Sipa;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextPane;


public class BoardView extends JFrame {
	static Color boardEvenColor = Color.RED;
	static Color boardOddColor = Color.WHITE;
	static final int width = 750;
	static final int hight = 750;
	JPanel panel = new JPanel(); // panel on frame is keep 64 button 
	TileMouseAdapter current = null; 
	static JButton[][] b = new JButton[8][8]; // button on panel is keep event from user click
	static JLabel player = new JLabel(); // label on panelLabelPlayer is keep label is state player using by TileMouseAdapter 
	JPanel panelLabelPlayer = new JPanel();	// panel on frame is keep label using by TileMouseAdapter 
	JPanel panelLabelColumn = new JPanel(); // panel on frame is keep label to column 1 2 3 4 5 6 7 8
	JPanel panelLabelRow = new JPanel();	// panel on frame is keep label to row A B C D E F G H
	JPanel panelStateUser = new JPanel();

	public BoardView() {
		BoardModel.resetCharecter();
		createButton(); 						// create button	
		loadModel(); 							// load BoardModel
		setColorButton(); 						// set Color to Button
		addButtonToBoard(panel); 				// add button to panel
		setNameButton();						// set Name of Button
		//setTextButton(); 						// set Text of Button
		loadBoradICon();
		// register button to MouseListenner
		for(int i=7;i>=0;i--){
			for(int j=0;j<8;j++){
				b[i][j].addMouseListener(new TileMouseAdapter(b[i][j], this, i, j, player, panelLabelPlayer));
			}
		}						
		setFrame(this, panel , panelLabelPlayer, panelLabelColumn, panelLabelRow, panelStateUser);	// set Frame
	}

	// create button
	public static void createButton(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				b[i][j] = new JButton();
			}
		}
	}
	// set Name of Button
	public static void setNameButton(){
		for(int i=7;i>=0;i--){
			for(int j=0;j<8;j++){
				if(j==0){
					b[i][j].setName(i+1 + "A");
				}else if (j==1){
					b[i][j].setName(i+1 + "B");
				}else if(j==2){
					b[i][j].setName(i+1 + "C");
				}else if(j==3){
					b[i][j].setName(i+1 + "D");
				}else if(j==4){
					b[i][j].setName(i+1 + "E");
				}else if(j==5){
					b[i][j].setName(i+1 + "F");
				}else if(j==6){
					b[i][j].setName(i+1 + "G");
				}else if(j==7){
					b[i][j].setName(i+1 + "H");
				}
			}
		}
	}
	// set Text of Button
	public static void setTextButton(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				b[i][j].setText(BoardModel.getCharecter(i, j));	
			}
		}
	}
	// set color of button
	public static void setColorButton() {
		// set background Button
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(i%2==0){
					if(j%2==0){
						b[i][j].setBackground(boardOddColor);
					}else {
						b[i][j].setBackground(boardEvenColor);
					}
				}else if(i%2!=0){
					if(j%2==0){
						b[i][j].setBackground(boardEvenColor);
					}else {						
						b[i][j].setBackground(boardOddColor);
					}
				}
			}
		}
	}

	// add button on panel
	// addMouseListerner to button

	// add button to panel
	public static void addButtonToBoard(JPanel panel) {
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				panel.add(b[i][j]);
			}
		}
	}

	// set Frame
	public static void setFrame(JFrame frame, JPanel panel, JPanel panelLabel,
								JPanel panelLabelColumn, JPanel panelLabelRow, JPanel panelStateUser) {
		frame.add(panel); // add panel to frame
		frame.add(panelLabel,BorderLayout.NORTH);
		frame.add(panelLabelColumn,BorderLayout.WEST);
		frame.add(panelLabelRow,BorderLayout.SOUTH);
		frame.add(panelStateUser,BorderLayout.EAST);
		panelLabel.add(player);
		panel.setLayout(new GridLayout(8, 8)); // set panel to GridLyout
		
		panel.setBackground(Color.PINK); // set background
		panelLabel.setBackground(Color.orange);
		panelLabelRow.setBackground(Color.YELLOW);
		panelLabelColumn.setBackground(Color.WHITE);
		panelStateUser.setBackground(Color.GRAY);
		
		panelLabelColumn.setLayout(new GridLayout(0,1));
		panelLabelColumn.add(new JLabel("1"));
		panelLabelColumn.add(new JLabel("2"));
		panelLabelColumn.add(new JLabel("3"));
		panelLabelColumn.add(new JLabel("4"));
		panelLabelColumn.add(new JLabel("5"));
		panelLabelColumn.add(new JLabel("6"));
		panelLabelColumn.add(new JLabel("7"));
		panelLabelColumn.add(new JLabel("8"));
		
		panelLabelRow.setLayout(new GridLayout(1,0));
		panelLabelRow.add(new JLabel("A"));
		panelLabelRow.add(new JLabel("B"));
		panelLabelRow.add(new JLabel("C"));
		panelLabelRow.add(new JLabel("D"));
		panelLabelRow.add(new JLabel("E"));
		panelLabelRow.add(new JLabel("F"));
		panelLabelRow.add(new JLabel("G"));
		panelLabelRow.add(new JLabel("H"));
		
		

		frame.setSize(width, hight);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
	// load Board Model to Board View
	public static void loadModel() {
		//BoardModel.resetCharecter();
		//BoardModel.getBoard();
		//BoardModel.setCharecter(0, 0, "Queen");
		//BoardModel.printBoard();
		BoardModel.loadBorad(); // load game default
		
	}
	// load Icon from CharectorIcon class
	public static void loadBoradICon(){
		b[0][0].setIcon(CharectorIcon.RookY); 	b[0][1].setIcon(CharectorIcon.KnightY); b[0][2].setIcon(CharectorIcon.BishopY); 	b[0][3].setIcon(CharectorIcon.KingY); 
		b[0][4].setIcon(CharectorIcon.QueenY); 	b[0][5].setIcon(CharectorIcon.BishopY); b[0][6].setIcon(CharectorIcon.KnightY); 	b[0][7].setIcon(CharectorIcon.RookY); 
		
		b[1][0].setIcon(CharectorIcon.PawnY); 	b[1][1].setIcon(CharectorIcon.PawnY); b[1][2].setIcon(CharectorIcon.PawnY); 	b[1][3].setIcon(CharectorIcon.PawnY); 
    	b[1][4].setIcon(CharectorIcon.PawnY); 	b[1][5].setIcon(CharectorIcon.PawnY); b[1][6].setIcon(CharectorIcon.PawnY); 	b[1][7].setIcon(CharectorIcon.PawnY); 
    	
    	b[6][0].setIcon(CharectorIcon.PawnB); 	b[6][1].setIcon(CharectorIcon.PawnB); b[6][2].setIcon(CharectorIcon.PawnB); 	b[6][3].setIcon(CharectorIcon.PawnB); 
    	b[6][4].setIcon(CharectorIcon.PawnB); 	b[6][5].setIcon(CharectorIcon.PawnB); b[6][6].setIcon(CharectorIcon.PawnB); 	b[6][7].setIcon(CharectorIcon.PawnB); 
    	
    	b[7][0].setIcon(CharectorIcon.RookB); 	b[7][1].setIcon(CharectorIcon.KnightB); b[7][2].setIcon(CharectorIcon.BishopB); 	b[7][3].setIcon(CharectorIcon.QueenB); 
		b[7][4].setIcon(CharectorIcon.KingB); 	b[7][5].setIcon(CharectorIcon.BishopB); b[7][6].setIcon(CharectorIcon.KnightB); 	b[7][7].setIcon(CharectorIcon.RookB); 
	}
	// inner class 
	
}
