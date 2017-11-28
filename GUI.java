import javax.swing.*;
import java.awt.event.MouseListener;
import java.awt.event.MouseEvent;

public class GUI implements MouseListener{
	
	private JFrame frame;
	private JPanel pane;
	private Board board;
	private JLabel[][] squareLabels;
	
	private int squareSize = 91;
	
	//Penis

	public GUI(Board b){
		frame = new JFrame("Perfectly Functional Draughts");
		frame.setSize(squareSize*b.width + 16, squareSize*b.height + 39);
		frame.setLocationRelativeTo(null);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		this.board = b;

		pane = new JPanel();
		pane.setLayout(null);
		pane.setBounds(0,0,frame.getWidth(),frame.getHeight());
		pane.addMouseListener(this);
		
		squareLabels = new JLabel[b.width][b.height];
		
		for(int y=0;y<board.height;y++) {
			for(int x=0;x<board.width;x++) {
				squareLabels[x][y] = new JLabel();
				
				squareLabels[x][y].setBounds(squareSize*x, squareSize*y, squareSize, squareSize);
				pane.add(squareLabels[x][y]);
			}
		}
		
		updateBoardIcons();

		frame.add(pane);
		frame.setVisible(true);
	}
	
	private void updateBoardIcons() {
		for(int y=0;y<board.height;y++) {
			for(int x=0;x<board.width;x++) {
				squareLabels[x][y].setIcon(board.squares[x][y].getIcon());
			}
		}
	}
	
	public void mousePressed(MouseEvent e) {

	}

	public void mouseReleased(MouseEvent e) {

	}

	public void mouseEntered(MouseEvent e) {

	}

	public void mouseExited(MouseEvent e) {

	}

	public void mouseClicked(MouseEvent e) {
		int x = e.getX();
		int y = e.getY();
		int buttonX =(int) (x/squareSize);
		int buttonY = (int) (y/squareSize);
		System.out.println("Clicked position " + buttonX + "," + buttonY);
		if((buttonX+buttonY)%2==1) {board.squareClicked(buttonX, buttonY);}
		updateBoardIcons();
	}
	
}
