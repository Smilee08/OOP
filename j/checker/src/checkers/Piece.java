package checkers;

import java.util.Stack;

public class Piece {
	
	private static final Integer EMPTY = null;
	protected Integer[][] piece=new Integer[8][8];
	private Stack<Move> moves=new Stack<Move>();
	
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
	
	public void makeMove(Move m) {
		
		piece [m.to_Row][m.to_Column]=piece[m.from_Row][m.from_Column];
		piece[m.from_Row][m.from_Column]=EMPTY;
		moves.push(m);
	}
	
	public void takebackMove() {
		if(moves.isEmpty()) {
			return;
		}
		Move move_back=moves.pop();
		piece[move_back.from_Row][move_back.from_Column]=piece [move_back.to_Row][move_back.to_Column];
		piece [move_back.to_Row][move_back.to_Column]=EMPTY;
	}

}
