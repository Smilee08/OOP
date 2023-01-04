package checkers;

public class Black_Piece extends Piece {
	//Position[][] piece;

	public void Add_Black_Pices() {
		
	    this.piece[0][0] = 1;
	    this.piece[0][3] = 1;
	    this.piece[0][5] = 1;
	    this.piece[0][7] = 1;
	    
	    this.piece[1][2] = 1;
	    this.piece[1][4] = 1;
	    this.piece[1][6] = 1;
	    this.piece[1][8] = 1;
	    
	    this.piece[2][1] = 1;
	    this.piece[2][3] = 1;
	    this.piece[2][5] = 1;
	    this.piece[2][7] = 1;
	}
}
