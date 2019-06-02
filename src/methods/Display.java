package methods;

//Jake Simons
//Date -
//AP CompSci -

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

import javax.swing.*;
import javax.swing.border.Border;

//public class GameBoard extends Canvas {
public class Display extends JPanel {

	public GameData gameData = new GameData();
	public GameBoard gameBoard = new GameBoard();
	public GamePieces gamePieces = new GamePieces();
	public Color transparent = new Color(255, 255, 255, 0);

	String textValue = gameData.getDialog();
	JTextField label = null;
	
	public Display() // constructor - sets up the class
	{
		setBackground(Color.WHITE);
		setLayout(null);
		setVisible(true);

		
		// Quit button
		JButton buttonQuit = createButton(620, 520, 120, 30, "Quit", false);
	    buttonQuit.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	            Container frame = buttonQuit.getParent();
	            do 
	            	frame = frame.getParent(); 
	          	while (!(frame instanceof JFrame));                                      
	           		((JFrame) frame).dispose();
	    	};
	    });

	    
	    // Play again button
		JButton buttonAgain = createButton(50, 520, 120, 30, "Play Again?", false);
	    buttonAgain.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// reset all board to empty and all data to empty
	    		// set all to invisible
	    		gameData = new GameData();
	    		gamePieces.colorX1 = transparent;
	    		gamePieces.colorO1 = transparent;
	    		gamePieces.colorInnerO1 = transparent;
	    		gamePieces.colorX2 = transparent;
	    		gamePieces.colorO2 = transparent;
	    		gamePieces.colorInnerO2 = transparent;
	    		gamePieces.colorX3 = transparent;
	    		gamePieces.colorO3 = transparent;
	    		gamePieces.colorInnerO3 = transparent;
	    		gamePieces.colorX4 = transparent;
	    		gamePieces.colorO4 = transparent;
	    		gamePieces.colorInnerO4 = transparent;
	    		gamePieces.colorX5 = transparent;
	    		gamePieces.colorO5 = transparent;
	    		gamePieces.colorInnerO5 = transparent;
	    		gamePieces.colorX6 = transparent;
	    		gamePieces.colorO6 = transparent;
	    		gamePieces.colorInnerO6 = transparent;
	    		gamePieces.colorX7 = transparent;
	    		gamePieces.colorO7 = transparent;
	    		gamePieces.colorInnerO7 = transparent;
	    		gamePieces.colorX8 = transparent;
	    		gamePieces.colorO8 = transparent;
	    		gamePieces.colorInnerO8 = transparent;
	    		gamePieces.set9PiecesTransparent();
	    		
	    		repaint();
	    	};
	    });
		
	    // Square 1 toggle
		JButton button1 = createButton(90, 100, 100, 110, "", true);
	    button1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(0, 0)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX1 = Color.RED;
	    	    		gamePieces.colorO1 = transparent;
	    	    		gamePieces.colorInnerO1 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX1 = transparent;
	    	    		gamePieces.colorO1 = Color.RED;
	    	    		gamePieces.colorInnerO1 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(0,0) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie

	    	    	repaint();
	    	    };
	    	};
	    });

	    JButton button2 = createButton(90+150, 100, 140, 110, "", true);
	    button2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	    if (!gameData.isGameValueSet(0, 1)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		gamePieces.colorX2 = Color.RED;
	    	    		gamePieces.colorO2 = transparent;
	    	    		gamePieces.colorInnerO2 = transparent;
	    	    	}
	    	    	else {
	    	    		gamePieces.colorX2 = transparent;
	    	    		gamePieces.colorO2 = Color.RED;
	    	    		gamePieces.colorInnerO2 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(0,1) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 3 toggle
		JButton button3 = createButton(90+310, 100, 130, 110, "", true);
	    button3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(0, 2)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX3 = Color.RED;
	    	    		gamePieces.colorO3 = transparent;
	    	    		gamePieces.colorInnerO3 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX3 = transparent;
	    	    		gamePieces.colorO3 = Color.RED;
	    	    		gamePieces.colorInnerO3 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(0,2) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 4 toggle
		JButton button4 = createButton(90, 100+130, 130, 120, "", true);
	    button4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(1, 0)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX4 = Color.RED;
	    	    		gamePieces.colorO4 = transparent;
	    	    		gamePieces.colorInnerO4 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX4 = transparent;
	    	    		gamePieces.colorO4 = Color.RED;
	    	    		gamePieces.colorInnerO4 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(1,0) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 5 toggle
		JButton button5 = createButton(90+150, 100+130, 140, 120, "", true);
	    button5.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(1, 1)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX5 = Color.RED;
	    	    		gamePieces.colorO5 = transparent;
	    	    		gamePieces.colorInnerO5 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX5 = transparent;
	    	    		gamePieces.colorO5 = Color.RED;
	    	    		gamePieces.colorInnerO5 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(1,1) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 6 toggle
		JButton button6 = createButton(90+310, 100+130, 130, 120, "", true);
	    button6.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(1, 2)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX6 = Color.RED;
	    	    		gamePieces.colorO6 = transparent;
	    	    		gamePieces.colorInnerO6 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX6 = transparent;
	    	    		gamePieces.colorO6 = Color.RED;
	    	    		gamePieces.colorInnerO6 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(1,2) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 7 toggle
		JButton button7 = createButton(90, 100+270, 130, 130, "", true);
	    button7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(2, 0)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX7 = Color.RED;
	    	    		gamePieces.colorO7 = transparent;
	    	    		gamePieces.colorInnerO7 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX7 = transparent;
	    	    		gamePieces.colorO7 = Color.RED;
	    	    		gamePieces.colorInnerO7 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(2,0) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 8 toggle
		JButton button8 = createButton(90+150, 100+270, 140, 130, "", true);
	    button8.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(2, 1)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		// ALSO DECIDE ON COLORS YOU WANT FOR X's and O's
	    	    		gamePieces.colorX8 = Color.RED;
	    	    		gamePieces.colorO8 = transparent;
	    	    		gamePieces.colorInnerO8 = transparent;
	    	    	}
	    	    	else {
	    	    		// COULD REPLACE WITH VISIBLE METHOD CALLS
	    	    		gamePieces.colorX8 = transparent;
	    	    		gamePieces.colorO8 = Color.RED;
	    	    		gamePieces.colorInnerO8 = Color.WHITE;
	    	    	}
	    	    	gameData.setGameValue(2,1) ;
	    	    	gameData.checkGameState();
	    	    	gameData.setXTurn();			
	    	    	label.setText(gameData.getDialog());
	    	    	//update data with marked square and check for win or tie
	    	    	repaint();
	    	    };
	    	};
	    });

	    // Square 9 toggle
		JButton button9 = createButton(90+310, 100+270, 130, 130, "", true);
	    button9.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
	    	    if (!gameData.isGameValueSet(2, 2)) {
	    	    	if (gameData.isXTurn()) {
	    	    		gamePieces.setX9PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO9PieceVisible();
	    	    	}
	    	    	setPieceData(2, 2);
	    	    	repaint();
	    	    };
	    	};
	    });

        label = new JTextField()
        {
            @Override public void setBorder(Border border) {
                // No!
            }
        };

        label.setText(textValue);
        label.setBackground(Color.WHITE);
        label.setForeground(Color.BLACK);
	    label.setBounds(90+180, 20, 140, 30);
	    label.setAlignmentY(CENTER_ALIGNMENT);
        add(label);
	}

	public void paintComponent(Graphics g) {
      super.paintComponent(g);
      gameBoard.drawBoard(g);
      gamePieces.drawX(g);
      gamePieces.drawO(g);
	}

	public void setPieceData(int row, int col) {
    	gameData.setGameValue(row, col) ;
    	gameData.checkGameState();
    	gameData.setXTurn();			
    	label.setText(gameData.getDialog());
	}
	
	public JButton createButton(int x, int y, int length, int height, String text, boolean borderOverride) {
		JButton button = null;
		
		if (borderOverride) {
			button = new JButton(text) {
	            @Override public void setBorder(Border border) {
	                // No!
	            }
	        };
		    button.setContentAreaFilled(false);
		}
		else {
			button = new JButton(text);
		}
		button.setBounds(x, y, length, height);
	    add(button);
		
		return button;
	}
}

