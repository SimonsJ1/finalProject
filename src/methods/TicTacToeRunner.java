package methods;

import java.awt.Color;
import java.awt.Graphics;

//Name -
//Date -
//Class -
//Lab  -

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class TicTacToeRunner 
{
	public TicTacToeRunner()
	{
		TicTacToe t = new TicTacToe();
		t.playGame();
	}

	public static void main( String args[] )
	{
		TicTacToeRunner run = new TicTacToeRunner();
	}
}