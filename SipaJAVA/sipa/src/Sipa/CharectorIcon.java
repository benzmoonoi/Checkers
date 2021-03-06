package Sipa;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.Icon;
import javax.swing.ImageIcon;

public class CharectorIcon {
	static Toolkit kit = Toolkit.getDefaultToolkit();
	
	static Image imgBgRed = kit.getImage("images/bgRed.png");
	static Image imgBgBack = kit.getImage("images/bgRed.png");
	
	static Image imgKingY = kit.getImage("images/KingYellow.png");
	static Image imgQueenY = kit.getImage("images/QueenYellow.png");
	static Image imgKnightY = kit.getImage("images/KnightYellow.png");
	static Image imgPawnY = kit.getImage("images/PawnYellow.png");
	static Image imgRookY = kit.getImage("images/RookYellow.png");
	static Image imgBishopY = kit.getImage("images/BishopYellow.png");
	
	static Image imgKingB = kit.getImage("images/KingBlue.png");
	static Image imgQueenB = kit.getImage("images/QueenBlue.png");
	static Image imgKnightB = kit.getImage("images/KnightBlue.png");
	static Image imgPawnB = kit.getImage("images/PawnBlue.png");
	static Image imgRookB = kit.getImage("images/RookBlue.png");
	static Image imgBishopB = kit.getImage("images/BishopBlue.png");
	
	static Icon KingY = new ImageIcon(imgKingY);	// set Icon button1
	static Icon QueenY = new ImageIcon(imgQueenY);	// set Icon button1
	static Icon KnightY  = new ImageIcon(imgKnightY);	// set Icon button1
	static Icon PawnY = new ImageIcon(imgPawnY);	// set Icon button1
	static Icon RookY = new ImageIcon(imgRookY);	// set Icon button1
	static Icon BishopY = new ImageIcon(imgBishopY);	// set Icon button1
	
	static Icon KingB = new ImageIcon(imgKingB);	// set Icon button1
	static Icon QueenB = new ImageIcon(imgQueenB);	// set Icon button1
	static Icon KnightB = new ImageIcon(imgKnightB);	// set Icon button1
	static Icon PawnB = new ImageIcon(imgPawnB);	// set Icon button1
	static Icon RookB = new ImageIcon(imgRookB);	// set Icon button1
	static Icon BishopB = new ImageIcon(imgBishopB);	// set Icon button1
}
