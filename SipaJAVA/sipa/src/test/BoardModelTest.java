package test;

import static org.junit.Assert.*;

import org.junit.Test;

import Sipa.BoardModel;

public class BoardModelTest {
	@Test
	public void testMoveBoard() {
		BoardModel.resetCharecter();
		BoardModel.setCharecter(0, 0, "Queen");

		BoardModel.move(0, 0, 0, 1);

		String expected = "empty Queen empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		assertEquals(expected, BoardModel.getBoardStates());
	}

	@Test
	public void testSetBoard() {
		BoardModel.resetCharecter();
		BoardModel.setCharecter(0, 0, "Queen");
		
		String expected = "Queen empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		assertEquals(expected, BoardModel.getBoardStates());
	}

	@Test
	public void testResetBoard() {
		BoardModel.resetCharecter();

		String expected = "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ "empty empty empty empty empty empty empty empty \n"
						+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		assertEquals(expected, BoardModel.getBoardStates());
	}
	
	@Test
	public void testSetState(){
		BoardModel.setState();
		
		String expected = "1A 1B 1C 1D 1E 1F 1G 1H \n"
						+ "2A 2B 2C 2D 2E 2F 2G 2H \n"
						+ "3A 3B 3C 3D 3E 3F 3G 3H \n"
						+ "4A 4B 4C 4D 4E 4F 4G 4H \n"
						+ "5A 5B 5C 5D 5E 5F 5G 5H \n"
						+ "6A 6B 6C 6D 6E 6F 6G 6H \n"
						+ "7A 7B 7C 7D 7E 7F 7G 7H \n"
						+ "8A 8B 8C 8D 8E 8F 8G 8H \n";
		assertEquals(expected, BoardModel.getState());			
	}
	
	@Test
	public void testLoadBorad(){
		BoardModel.loadBorad();
		String expected  = "RookP1 KnightP1 BishopP1 KingP1 QueenP1 BishopP1 KnightP1 RookP1 \n" 
							+ "PawnP1 PawnP1 PawnP1 PawnP1 PawnP1 PawnP1 PawnP1 PawnP1 \n" 
							+ "empty empty empty empty empty empty empty empty \n" 
							+ "empty empty empty empty empty empty empty empty \n" 
							+ "empty empty empty empty empty empty empty empty \n" 
							+ "empty empty empty empty empty empty empty empty \n" 
							+ "PawnP2 PawnP2 PawnP2 PawnP2 PawnP2 PawnP2 PawnP2 PawnP2 \n" 
							+ "RookP2 KnightP2 BishopP2 QueenP2 KingP2 BishopP2 KnightP2 RookP2 \n" 
							+ ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		assertEquals(expected, BoardModel.getBoardStates());
	}
	
	@Test
	public void getState(){
		BoardModel.setState();
		
		assertEquals("1A", BoardModel.getState(0,0));
		assertEquals("8A", BoardModel.getState(7,0));
	}
	
	@Test
	public void checkRookP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "1A1H";
		
		assertEquals(expected, BoardModel.checkRookP1());
	}
	
	@Test
	public void checkRookP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "8A8H";
		
		assertEquals(expected, BoardModel.checkRookP2());
	}
	
	@Test
	public void checkPawnP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "2A2B2C2D2E2F2G2H";
		
		assertEquals(expected, BoardModel.checkPawnP1());
	}
	
	@Test
	public void checkPawnP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "7A7B7C7D7E7F7G7H";
		
		assertEquals(expected, BoardModel.checkPawnP2());
	}
	
	@Test
	public void checkKingP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "1D";
		
		assertEquals(expected, BoardModel.checkKingP1());
	}
	
	@Test
	public void checkKingP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "8E";
		
		assertEquals(expected, BoardModel.checkKingP2());
	}
	
	@Test
	public void checkQueenP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "1E";
		
		assertEquals(expected, BoardModel.checkQueenP1());
	}
	
	@Test
	public void checkQueenP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "8D";
		
		assertEquals(expected, BoardModel.checkQueenP2());
	}
	
	@Test
	public void CheckBishopP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "1C1F";
		
		assertEquals(expected, BoardModel.CheckBishopP1());
	}
	
	@Test
	public void CheckBishopP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "8C8F";
		
		assertEquals(expected, BoardModel.CheckBishopP2());
	}
	
	@Test
	public void CheckKnightP1(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "1B1G";
		
		assertEquals(expected, BoardModel.CheckKnightP1());
	}
	
	@Test
	public void CheckKnightP2(){
		BoardModel.resetCharecter();
		BoardModel.setState();
		BoardModel.loadBorad();
		
		String expected  = "8B8G";
		
		assertEquals(expected, BoardModel.CheckKnightP2());
	}
}