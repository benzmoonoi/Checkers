package Sipa;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextPane;
import javax.swing.plaf.basic.BasicOptionPaneUI;

public class TileMouseAdapter implements ActionListener {
	private JButton button;
	BoardView board;
	int x;
	int y;
	// Player1 is Yellow, Player2 is Blue
	static boolean player1 = false;
	String moveRook;
	JLabel p;
	JPanel panelTop;
	static String test;
	static Color stateColor;

	public TileMouseAdapter(JButton button, BoardView board, int x, int y,
			JLabel player, JPanel panelLabelPlayer) {
		this.button = button;
		this.board = board;
		this.x = x;
		this.y = y;
		this.p = player;

		this.p.setText("Player1");
		this.panelTop = panelLabelPlayer;
		this.panelTop.setBackground(Color.YELLOW);

		// for (int i = 0; i < 8; i++) {
		// for (int j = 0; j < 8; j++) {
		// if (BoardModel.charecter[i][j].equals("RookP2")
		// | BoardModel.charecter[i][j].equals("KnightP2")
		// | BoardModel.charecter[i][j].equals("BishopP2")
		// | BoardModel.charecter[i][j].equals("QueenP2")
		// | BoardModel.charecter[i][j].equals("KingP2")
		// | BoardModel.charecter[i][j].equals("PawnP2")) {
		// BoardView.b[i][j].setEnabled(false);
		// }
		// }
		// }

	}

	public void pick() {
		System.out.println("enter pick");
		board.current = this;
		System.out.println("pick "
				+ BoardModel.getState(board.current.x, board.current.y));
		test = BoardModel.getState(board.current.x, board.current.y);
		//System.out.println(test);
		stateColor = this.button.getBackground();
		this.button.setBackground(Color.GREEN);
	}

	public void put() {
		System.out.println("enter put");
		System.out.println(this.button.getName());
		if (test.equals(this.button.getName())) {
			//System.out.println("OK");
			pick();

		} else if(!test.equals(this.button.getName())){

			System.out.println("put = "
					+ BoardModel.getState(board.current.x, board.current.y));
			// Update model
			int from_x = board.current.x;
			int from_y = board.current.y;
			int to_x = this.x;
			int to_y = this.y;
			BoardModel.move(from_x, from_y, to_x, to_y);

			// Refresh view
			String empty = BoardModel.getCharecter(from_x, from_y);
			String character = BoardModel.getCharecter(to_x, to_y);
			if (player1 == true) {

				// System.out.println("Player2");
				// System.out.println(BoardModel.getBoardStates());
				if (character.equals("QueenP2")) {
					this.button.setIcon(CharectorIcon.QueenB);
				} else if (character.equals("KingP2")) {
					this.button.setIcon(CharectorIcon.KingB);
				} else if (character.equals("KnightP2")) {
					this.button.setIcon(CharectorIcon.KnightB);
				} else if (character.equals("PawnP2")) {
					this.button.setIcon(CharectorIcon.PawnB);
				} else if (character.equals("RookP2")) {
					this.button.setIcon(CharectorIcon.RookB);
				} else if (character.equals("BishopP2")) {
					this.button.setIcon(CharectorIcon.BishopB);
				}
				// board.current.button.setText(empty);
				board.current.button.setIcon(null);
				board.current.button.setBackground(stateColor);
				// this.button.setText(character);
				player1 = false;
				this.p.setText("Player1");
				this.panelTop.setBackground(Color.YELLOW);

			} else {

				// System.out.println("Player1");
				// System.out.println(BoardModel.getBoardStates());
				if (character.equals("QueenP1")) {
					this.button.setIcon(CharectorIcon.QueenY);
					// disable player

				} else if (character.equals("KingP1")) {
					this.button.setIcon(CharectorIcon.KingY);
					// disable player 2

				} else if (character.equals("KnightP1")) {
					this.button.setIcon(CharectorIcon.KnightY);
					// disable player 2

				} else if (character.equals("PawnP1")) {
					this.button.setIcon(CharectorIcon.PawnY);
					// disable player 2

				} else if (character.equals("RookP1")) {
					this.button.setIcon(CharectorIcon.RookY);
					// disable player 2

				} else if (character.equals("BishopP1")) {
					this.button.setIcon(CharectorIcon.BishopY);
					// disable player 2
				} else {
					this.button.setEnabled(false);
				}

				// board.current.button.setText(empty);
				board.current.button.setIcon(null);
				board.current.button.setBackground(stateColor);
				// this.button.setText(character);
				player1 = true;
				this.p.setText("Player2");
				this.panelTop.setBackground(Color.BLUE);

			}
		}

		// if(player1 != true){
		// for (int i = 0; i < 8; i++) {
		// for (int j = 0; j < 8; j++) {
		// if (BoardModel.charecter[i][j].equals("RookP2")
		// | BoardModel.charecter[i][j].equals("KnightP2")
		// | BoardModel.charecter[i][j].equals("BishopP2")
		// | BoardModel.charecter[i][j].equals("QueenP2")
		// | BoardModel.charecter[i][j].equals("KingP2")
		// | BoardModel.charecter[i][j].equals("PawnP2")) {
		// BoardView.b[i][j].setEnabled(true);
		// }
		// }
		// }
		// }else {
		// for (int i = 0; i < 8; i++) {
		// for (int j = 0; j < 8; j++) {
		// if (BoardModel.charecter[i][j].equals("RookP2")
		// | BoardModel.charecter[i][j].equals("KnightP2")
		// | BoardModel.charecter[i][j].equals("BishopP2")
		// | BoardModel.charecter[i][j].equals("QueenP2")
		// | BoardModel.charecter[i][j].equals("KingP2")
		// | BoardModel.charecter[i][j].equals("PawnP2")) {
		// BoardView.b[i][j].setEnabled(false);
		// }
		// }
		// }
		// }else if(player2 == true){
		// for (int i = 0; i < 8; i++) {
		// for (int j = 0; j < 8; j++) {
		// if (BoardModel.charecter[i][j].equals("RookP1")
		// | BoardModel.charecter[i][j].equals("KnightP1")
		// | BoardModel.charecter[i][j].equals("BishopP1")
		// | BoardModel.charecter[i][j].equals("QueenP1")
		// | BoardModel.charecter[i][j].equals("KingP1")
		// | BoardModel.charecter[i][j].equals("PawnP1")) {
		// BoardView.b[i][j].setEnabled(false);
		// }
		// }
		// }
		// }else if(player2 == false){
		// for (int i = 0; i < 8; i++) {
		// for (int j = 0; j < 8; j++) {
		// if (BoardModel.charecter[i][j].equals("RookP1")
		// | BoardModel.charecter[i][j].equals("KnightP1")
		// | BoardModel.charecter[i][j].equals("BishopP1")
		// | BoardModel.charecter[i][j].equals("QueenP1")
		// | BoardModel.charecter[i][j].equals("KingP1")
		// | BoardModel.charecter[i][j].equals("PawnP1")) {
		// BoardView.b[i][j].setEnabled(true);
		// }
		// }
		// }
		// }
		BoardView.setColorButton(); 
		board.current = null;
	}

	public static void moveRook() {
		String state = "";

	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		System.out.println("enter mouse clicked");
		if (board.current == null) {
			pick();

		} else {
			put();
		}
	}

}
