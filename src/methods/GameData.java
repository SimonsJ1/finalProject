package methods;

import java.awt.Graphics;

//Jake Simons
//Date -
//AP CompSci -

public class GameData {

	boolean xTurn = true;
    String p1Turn = " Player 1's turn";
    String p2Turn = " Player 2's turn";
	String p1Won = " Player 1 WON!";
	String p2Won = " Player 2 WON!";
	String tie = " Tie game, play again?";
	int[][] gameValues = new int[3][3];
	int xcount = 0;
	int ocount = 0;
	int winner = 0;
	
	public GameData()
	{
	    for(int k=0; k<3; k++){
	    	for(int j=0; j<3; j++){  //checks for a winner
	    		gameValues[k][j] = 0;
	    	}
	    }
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
		if (winner > 0 && winner == 1) {
			return p1Won;
		}
		else if (winner > 0 && winner == 2) {
			return p2Won;
		}
		if (winner > 0 && winner == 3) {
			return tie;
		}
		else if (isXTurn()) {
			return p1Turn;
		}
		else {
			return p2Turn;
		}
	}
	
	public void setGameValue(int row, int col) {
		if (isXTurn())
			gameValues[row][col] = 1;
		else
			gameValues[row][col] = 2;
	}

	public boolean isGameValueSet(int row, int col) {
		if (gameValues[row][col] > 0) {
			return true;
		}
		else if (winner > 0) {
			return true;
		}
		return false;
	}
	
	public boolean checkGameState() {
		xcount = 0;
		ocount = 0;
		winner = 0;
		
		// check horizontal
		if (checkHorizontalWin())
			return true;
			
	    // check vertical
		if (checkVerticalWin())
			return true;
		
	    
	    // check diagonial
	    if (gameValues[0][0] == 1 &&
	        gameValues[1][1] == 1 &&
	        gameValues[2][2] == 1) {
		   winner = 1;
		   return true;
	    }
    	if (gameValues[0][0] == 2 &&
    	    gameValues[1][1] == 2 &&
    	    gameValues[2][2] == 2) {
	   	   winner = 2;
	   	   return true;
    	}
    	if (gameValues[0][2] == 1 &&
    	    gameValues[1][1] == 1 &&
    	    gameValues[2][0] == 1) {
	   	   winner = 1;
	   	   return true;
    	}
    	if (gameValues[0][2] == 2&&
    	    gameValues[1][1] == 2 &&
    	    gameValues[2][0] == 2) {
	   	   winner = 2;
	   	   return true;
    	}

	    // check for tie game. 
	    for(int k=0; k<3; k++){
	       for(int j=0; j<3; j++){  //checks for a winner
	          if (gameValues[k][j] > 0)
	             xcount++;
	       }
	       
	       if(xcount == 9) {
	    	   winner = 3;
	    	   return true;
	       }
	    }

	    return false;
	}

	public boolean checkHorizontalWin() {
		xcount = 0;
		ocount = 0;
		winner = 0;
		
	    for(int k=0; k<3; k++){
	       for(int j=0; j<3; j++){  //checks for a winner
	          if (gameValues[k][j] == 1)
	             xcount++;
	          else if (gameValues[k][j] == 2)
	             ocount++;
	       }
	       
	       if(xcount == 3) {
	    	   // if 3 1 or X acrosss WIN
	    	   winner = 1;
	    	   return true;
	       }
    	   else if(ocount ==3) {
    		   // if 3 2 or O acrosss WIN
    		   winner = 2;
    		   return true;
    	   }
    	   else {
    		   // else reset and check next row
    		   xcount = 0;
    		   ocount = 0;
    	   }
	    }

	    return false;
	}

	public boolean checkVerticalWin() {
		xcount = 0;
		ocount = 0;
		winner = 0;
		
		for(int k=0; k<3; k++){
	    	for(int j=0; j<3; j++){  //checks for a winner
		        if (gameValues[j][k] == 1)  // switch j and k
		        	xcount++;
		         else if (gameValues[j][k] == 2)// switch j and k
		            ocount++;
		    }
		       
	    	if(xcount == 3) {
		   	   // if 3 1 or X acrosss WIN
		   	   winner = 1;
		   	   return true;
	    	}
	        else if(ocount ==3) {
	   		   // if 3 2 or O acrosss WIN
	   		   winner = 2;
	   		   return true;
	        }
	    	else {
	    	   // else reset and check next row
	    	   xcount = 0;
	    	   ocount = 0;
	    	}
		}
		
		return false;
	}
 }
