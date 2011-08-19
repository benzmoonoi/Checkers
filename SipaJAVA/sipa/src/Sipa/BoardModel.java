package Sipa;


public class BoardModel {
	static String[][] charecter = new String[8][8];
	static String[][] state = new String[8][8];
	public static final String EMPTY = "empty";
							//		0		   1		 2		    3		 4	       5
static public String[] charec = {"RookP1","KnightP1","BishopP1","QueenP1","KingP1","PawnP1",
								 "RookP2","KnightP2","BishopP2","QueenP2","KingP2","PawnP2"};
							//		6		   7		 8		    9		 10	      11

	public static String[][] setState(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(j==0){
					state[i][j] = i+1 + "A";
				}else if (j==1){
					state[i][j] = i+1 + "B";
				}else if(j==2){
					state[i][j] = i+1 + "C";
				}else if(j==3){
					state[i][j] = i+1 + "D";
				}else if(j==4){
					state[i][j] = i+1 + "E";
				}else if(j==5){
					state[i][j] = i+1 + "F";
				}else if(j==6){
					state[i][j] = i+1 + "G";
				}else if(j==7){
					state[i][j] = i+1 + "H";
				}
			}
		}
		return state;
	}
	
	public static String getState(){
		String temp = "";
		for(int i=0;i<8;i++){
			for (int j=0;j<8;j++) {
				temp = temp + state[i][j] + " ";
			}
			temp = temp + "\n";
		}
		return temp;
	}
	public static String getState(int x,int y){
		setState();
		return state[x][y];
	}
	
	public static void printState(){
		System.out.println(getState());
	}
	
	public static void printBoard() {
		System.out.println(getBoardStates());
	}
	
	public static String getBoardStates() {
		String state = "";
		for (int i = 0; i < 8; i++) {
			for (int j = 0; j < 8; j++) {
				state = state + charecter[i][j] + " ";
			}
			state = state + "\n";
		}
		state = state + ">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>\n";
		return state;
	}

	public static String getCharecter(int x, int y) {
		 return charecter[x][y];
	}
	
	public static void setCharecter(int x, int y,String in) {
		charecter[x][y] = in;
	}
	
	public static void move(int from_x, int from_y, int to_x, int to_y) {
		String in = getCharecter(from_x, from_y);
		setCharecter(to_x, to_y, in);
		
		setCharecter(from_x, from_y, EMPTY);
	}

	public static void resetCharecter() {
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				charecter[i][j] = EMPTY;
			}
		}	
	}
			
	public static String[][] loadBorad(){
// Thai
//			charecter[0][0] = charec[0]; 	charecter[0][1] = charec[1]; charecter[0][2] = charec[2]; 	charecter[0][3] = charec[4]; 
//			charecter[0][4] = charec[3]; 	charecter[0][5] = charec[2]; charecter[0][6] = charec[1]; 	charecter[0][7] = charec[0]; 
//			
//			charecter[2][0] = charec[5]; 	charecter[2][1] = charec[5]; charecter[2][2] = charec[5]; 	charecter[2][3] = charec[5]; 
//			charecter[2][4] = charec[5]; 	charecter[2][5] = charec[5]; charecter[2][6] = charec[5]; 	charecter[2][7] = charec[5]; 
//			
//			charecter[5][0] = charec[11]; 	charecter[5][1] = charec[11]; charecter[5][2] = charec[11]; 	charecter[5][3] = charec[11]; 
//			charecter[5][4] = charec[11]; 	charecter[5][5] = charec[11]; charecter[5][6] = charec[11]; 	charecter[5][7] = charec[11]; 
//			
//			charecter[7][0] = charec[6]; 	charecter[7][1] = charec[7]; charecter[7][2] = charec[8]; 	charecter[7][3] = charec[9]; 
//			charecter[7][4] = charec[10]; 	charecter[7][5] = charec[8]; charecter[7][6] = charec[7]; 	charecter[7][7] = charec[6]; 

			charecter[0][0] = charec[0]; 	charecter[0][1] = charec[1]; charecter[0][2] = charec[2]; 	charecter[0][3] = charec[4]; 
			charecter[0][4] = charec[3]; 	charecter[0][5] = charec[2]; charecter[0][6] = charec[1]; 	charecter[0][7] = charec[0]; 
			
			charecter[1][0] = charec[5]; 	charecter[1][1] = charec[5]; charecter[1][2] = charec[5]; 	charecter[1][3] = charec[5]; 
			charecter[1][4] = charec[5]; 	charecter[1][5] = charec[5]; charecter[1][6] = charec[5]; 	charecter[1][7] = charec[5]; 
			
			charecter[6][0] = charec[11]; 	charecter[6][1] = charec[11]; charecter[6][2] = charec[11]; 	charecter[6][3] = charec[11]; 
			charecter[6][4] = charec[11]; 	charecter[6][5] = charec[11]; charecter[6][6] = charec[11]; 	charecter[6][7] = charec[11]; 
			
			charecter[7][0] = charec[6]; 	charecter[7][1] = charec[7]; charecter[7][2] = charec[8]; 	charecter[7][3] = charec[9]; 
			charecter[7][4] = charec[10]; 	charecter[7][5] = charec[8]; charecter[7][6] = charec[7]; 	charecter[7][7] = charec[6]; 
		
		return charecter;
	}
	// check เรือ player1
	public static String checkRookP1(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("RookP1")){
					ckP1 += state[i][j] ;
				}
			}
		}
		return ckP1;
	}
	// check เรือ player2
	public static String checkRookP2(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("RookP2")){
					ckP2+= state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	// check เม็ด player1
	public static String checkPawnP1(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("PawnP1")){
					ckP1+= state[i][j] ;
				}
			}
		}
		return ckP1;
	}
	// check เม็ด player2
	public static String checkPawnP2(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("PawnP2")){
					ckP2+= state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	
	// check ขุน player1
	public static String checkKingP1(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("KingP1")){
					ckP1+= state[i][j] ;
				}
			}
		}
		return ckP1;
	}
	
	// check ขุน player2
	public static String checkKingP2(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("KingP2")){
					ckP2+= state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	
	// check ควีน player2
	public static String checkQueenP1(){
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("QueenP1")){
					ckP1+= state[i][j] ;
				}
			}
		}
		return ckP1;
	}

	// check ควีน player2
	public static String checkQueenP2() {
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("QueenP2")){
					ckP2+= state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	// check โคน player1
	public static String CheckBishopP1() {
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("BishopP1")){
					ckP1+= state[i][j] ;
				}
			}
		}
		return ckP1;
	}
	// check โคน player2
	public static String CheckBishopP2() {
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("BishopP2")){
					ckP2+= state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	
	// check ม้า player2
	public static String CheckKnightP1() {
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP1 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("KnightP1")){
					ckP1+= state[i][j] ;
				}
			}
		}
		return ckP1;
	}
	
	// check ม้า player1
	public static String CheckKnightP2() {
		resetCharecter();
		setState();
		loadBorad();
		
		String ckP2 = "";
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equalsIgnoreCase("KnightP2")){
					ckP2 += state[i][j] ;
				}
			}
		}
		return ckP2;
	}
	
	public static void getP2(){
		for(int i=0;i<8;i++){
			for(int j=0;j<8;j++){
				if(charecter[i][j].equals("RookP2")|
				   charecter[i][j].equals("KnightP2")|
				   charecter[i][j].equals("BishopP2")|
				   charecter[i][j].equals("QueenP2")|
				   charecter[i][j].equals("KingP2")|
				   charecter[i][j].equals("PawnP2")){
					
				}
			}
		}
		
	}

	public static String getWinner(){
		
		String test = "";
		//setCharecter(0, 3, "empty");
		for (int i = 0; i < charecter.length; i++) {
			for (int j = 0; j < charecter.length; j++) {
				if(charecter[i][j].equals("empty")){
					test = "OK";
				}
			}
		}
		return test;
	}
	public static void pawnMove(){
		int x;
		int y;
		
	}
	public static void main(String args[]){
		String t = getWinner();
		System.out.println(t);
		BoardModel.printBoard();
	}

}
