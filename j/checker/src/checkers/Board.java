package checkers;

public class Board {

	Integer[][] board=new Integer[8][8];
	Integer t=1;
	
	public void draw_board() {
		initialize();
		System.out.print("\n");
		System.out.print("\n\t    -----------------------------------------\n");
		for(int i=0;i<board.length;i++) {
			System.out.print("\t"+t++ +"   ");
			System.out.print("|");
			if(i%2==0) {
				for(int j=0;j<board[i].length;j++) {
					if(j%2==0){
						
						if(board[i][j]==null ) {
							//if(board[i][j]==0) {
								System.out.print(" 0 ");
							//}else {
								//System.out.print(" O ");
							//}
						}
						System.out.print(" |");
					}
					if((j%2!=0 && i%2!=0)||j%2!=0){
						System.out.print(" ## |");
					}
				}
				System.out.print("\n\t    -----------------------------------------\t");
				System.out.print("\n");
			
			}
			
			if(i%2!=0) {
				for(int j=0;j<board[i].length;j++) {
		
						if(j%2==0){
							System.out.print(" ## ");
							
						}
						
						if((j%2!=0 && i%2!=0)||j%2!=0){
							System.out.print("|    |");
						}
					
				}
				System.out.print("\n\t    -----------------------------------------\t");
				System.out.print("\n");
			}
		}
	
		System.out.print("\t       1    2    3    4    5    6    7    8\t");
	}
	
	
	public void initialize() {
		this.board[0][1] = 1;
	    this.board[0][3] = 1;
	    this.board[0][5] = 1;
	    this.board[0][7] = 1;
	    this.board[1][0] = 1;
	    this.board[1][2] = 1;
	    this.board[1][4] = 1;
	    this.board[1][6] = 1;
	    this.board[2][1] = 1;
	    this.board[2][3] = 1;
	    this.board[2][5] = 1;
	    this.board[2][7] = 1;
	    
	    this.board[5][1] = 0;
	    this.board[5][3] = 0;
	    this.board[5][5] = 0;
	    this.board[5][7] = 0;
	    this.board[6][0] = 0;
	    this.board[6][2] = 0;
	    this.board[6][4] = 0;
	    this.board[6][6] = 0;
	    this.board[7][1] = 0;
	    this.board[7][3] = 0;
	    this.board[7][5] = 0;
	    this.board[7][7] = 0;
	    
	    for(int i=0;i<8;i++) {
	    	for(int j=0;j<8;j++) {
	    	
	    		
	    		
	    	}
	    }
	    
	}

}
