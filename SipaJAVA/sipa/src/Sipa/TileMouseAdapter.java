package Sipa;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextPane;

public class TileMouseAdapter extends MouseAdapter {
	private JButton button;
	BoardView board;
	int x;
	int y;
	// Player1 is Yellow, Player2 is Blue
	static boolean player1 = false;
	String moveRook;
	JLabel p;	


	public TileMouseAdapter(JButton button, BoardView board, int x, int y, JLabel player) {
		this.button = button;
		this.board = board;
		this.x = x;
		this.y = y;
		this.p = player;
		
		this.p.setText("Player1");
		
	}

	@Override
	public void mouseClicked(MouseEvent event) {
		if (board.current == null) {
			pick();
		} else {
			put();
		}
		super.mouseClicked(event);
	}

	public void pick() {
		board.current = this;
		System.out.println("pick " + BoardModel.getState(board.current.x,board.current.y));
	}

	public void put() {
		System.out.println("put = " + BoardModel.getState(board.current.x,board.current.y));
		// Update model
		int from_x = board.current.x;
		int from_y = board.current.y;
		int to_x = this.x;
		int to_y = this.y;
		BoardModel.move(from_x, from_y, to_x, to_y);

		// Refresh view
		String empty = BoardModel.getCharecter(from_x, from_y);
		String character = BoardModel.getCharecter(to_x, to_y);
		if (player1 != true) {
			System.out.println("Player1");
			System.out.println(BoardModel.getBoardStates());
			if (character.equalsIgnoreCase("QueenP1")) {
				this.button.setIcon(CharectorIcon.QueenY);
				// disable player

			} else if (character.equalsIgnoreCase("KingP1")) {
				this.button.setIcon(CharectorIcon.KingY);
				// disable player 2

			} else if (character.equalsIgnoreCase("KnightP1")) {
				this.button.setIcon(CharectorIcon.KnightY);
				// disable player 2

			} else if (character.equalsIgnoreCase("PawnP1")) {
				this.button.setIcon(CharectorIcon.PawnY);
				// disable player 2

			} else if (character.equalsIgnoreCase("RookP1")) {
				this.button.setIcon(CharectorIcon.RookY);
				// disable player 2

			} else if (character.equalsIgnoreCase("BishopP1")) {
				this.button.setIcon(CharectorIcon.BishopY);
				// disable player 2

			}
			// board.current.button.setText(empty);
			board.current.button.setIcon(null);
			// this.button.setText(character);
			player1 = true;
			this.p.setText("Player2");
		} else {
			System.out.println("Player2");
			System.out.println(BoardModel.getBoardStates());
			if (character.equalsIgnoreCase("QueenP2")) {
				this.button.setIcon(CharectorIcon.QueenB);
			} else if (character.equalsIgnoreCase("KingP2")) {
				this.button.setIcon(CharectorIcon.KingB);
			} else if (character.equalsIgnoreCase("KnightP2")) {
				this.button.setIcon(CharectorIcon.KnightB);
			} else if (character.equalsIgnoreCase("PawnP2")) {
				this.button.setIcon(CharectorIcon.PawnB);
			} else if (character.equalsIgnoreCase("RookP2")) {
				this.button.setIcon(CharectorIcon.RookB);
			} else if (character.equalsIgnoreCase("BishopP2")) {
				this.button.setIcon(CharectorIcon.BishopB);
			}
			// board.current.button.setText(empty);
			board.current.button.setIcon(null);
			// this.button.setText(character);
			player1 = false;
			this.p.setText("Player1");
		}

		board.current = null;
	}
	
	public static void moveRook(){
		String state = "";
		
	}

}
