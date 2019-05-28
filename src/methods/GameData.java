package methods;

import java.awt.Graphics;

//Jake Simons
//Date -
//AP CompSci -

public class GameData {

	boolean xTurn = true;
    String p1Turn = " Player 1's turn";
    String p2Turn = " Player 2's turn";
    // print to screen "Player 1 WON!"
    // print to screen "Player 2 WON!"
    // print to screen "Tie game, play again?"
	
	public GameData()
	{
	}
	
	public boolean isXTurn() {
		return xTurn;
	}
	
	public void setXTurn() {
		if (xTurn) {
			xTurn = false;
		}
		else {
			xTurn = true;
		}
	}

	public String getDialog() {
		// ADD for WIN and TIE messages
		if (isXTurn()) {
			return p1Turn;
		}
		else {
			return p2Turn;
		}
	}
}