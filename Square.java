import javax.swing.ImageIcon;

public class Square {
	public boolean isWhite;
	public boolean hasPiece;
	public boolean pieceIsWhite;
	public boolean isHighlighted;

	private final ImageIcon emptyWhiteIcon = new ImageIcon("Squares/emptyWhite.png");
	private final ImageIcon emptyBlackIcon = new ImageIcon("Squares/emptyBlack.png");
	private final ImageIcon highlightedIcon = new ImageIcon("Squares/highlightedBlack.png");
	private final ImageIcon pieceWhiteIcon = new ImageIcon("Squares/whitePiece.png");
	private final ImageIcon pieceBlackIcon = new ImageIcon("Squares/blackPiece.png");
	
	public ImageIcon getIcon() {
		if (isWhite) {
			return emptyWhiteIcon;
		}
		else {
			if (hasPiece) {
				if (pieceIsWhite) {
					return pieceWhiteIcon;
				}
				else {
					return pieceBlackIcon;
				}
			}
			else {
				if (isHighlighted) {
					return highlightedIcon;
				}
				else {
					return emptyBlackIcon;
				}
				
			}
		}
	}
}
