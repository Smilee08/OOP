package Default;

import java.util.Stack;

public class Board {
	private static final Integer WIDTH = 8;
	private static final Integer HEIGHT = 8;
	private static final Integer EMPTY = null;
	private Integer[][] board=new Integer[8][8];
	private Stack<Move> moves=new Stack<Move>();
	int row,col,x,y;
	
	private class Move{
		Integer from_Row;
		Integer from_Column;
		Integer to_Row;
		Integer to_Column;
		
		public Move(Integer from_Column,Integer from_Row,Integer to_Column,Integer to_Row) {
			this.from_Column=from_Column;
			this.from_Row=from_Row;
			this.to_Column=to_Column;
			this.to_Row=to_Row;
		}
		
	}
	private void makeMove(Move m) {
		
		board [m.to_Row][m.to_Column]=board[m.from_Row][m.from_Column];
		board[m.from_Row][m.from_Column]=EMPTY;
		moves.push(m);
	}
	
	private void takebackMove() {
		if(moves.isEmpty()) {
			return;
		}
		Move move_back=moves.pop();
		board[move_back.from_Row][move_back.from_Column]=board [move_back.to_Row][move_back.to_Column];
		board [move_back.to_Row][move_back.to_Column]=EMPTY;
	}

	public void drawboard() {
		for(row=0;row<8;row++) {
			for(col=0;col<9;col++) {
				System.out.print("| ");
			}
			System.out.print("\n");
		}
	}
	
}
