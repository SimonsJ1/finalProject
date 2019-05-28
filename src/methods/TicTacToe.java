package methods;

//Jake Simons
//Date -
//AP CompSci -

import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.Dimension;

public class TicTacToe extends JPanel {

	public Display display = new Display();
	private JFrame frame = null;
	private JPanel panel = null;

	private static final int WIDTH = 800;
	private static final int HEIGHT = 600;

	public TicTacToe() 
	{
		frame = new JFrame("TicTacToe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        frame.setMaximumSize(new Dimension(WIDTH, HEIGHT));
        frame.setMinimumSize(new Dimension(WIDTH, HEIGHT));
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
        
        frame.add(display);
        frame.validate();
        frame.repaint();
	}

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    }
	
	public void playGame() {
        frame.revalidate();
        frame.repaint();
	}
	
	
	// MAIN CODE TO PLAY GAME
	
	// Initialize system
	// Draw board
	
	// back n forth between players uuntil win or tie
	
	// if (play again) {
	//    reset board and start over
	// }
	// else {
	//    quit game / program
	// }
}
