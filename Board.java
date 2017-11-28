public class Board {
	public int width = 8;
	public int height = 8;
	public Square[][] squares;
	
	public Board() {
		squares = new Square[width][height];
		
		initialSetup();
	}
	
	public void initialSetup() {
		Square square;
		boolean blackPiece;
		boolean whitePiece;
		for(int y=0;y<height;y++) {
			for(int x=0;x<width;x++) {
				square = new Square();
				
				blackPiece = y < (height / 2) - 1;
				whitePiece = y > height / 2;
				
				square.isWhite = (x + y) % 2 == 0;
				square.hasPiece = whitePiece || blackPiece;
				square.pieceIsWhite = whitePiece;
				square.isHighlighted = false;
				
				squares[x][y] = square;
			}
		}
	}
	
	public void squareClicked(int x, int y) {
		if(!squares[x][y].hasPiece) {
			
		}
		
		squares[x][y].isWhite = !squares[x][y].isWhite;
	}
}
