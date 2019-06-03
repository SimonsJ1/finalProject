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
	    		gamePieces.set1PiecesTransparent();
	    		gamePieces.set2PiecesTransparent();
	    		gamePieces.set3PiecesTransparent();
	    		gamePieces.set4PiecesTransparent();
	    		gamePieces.set5PiecesTransparent();
	    		gamePieces.set6PiecesTransparent();
	    		gamePieces.set7PiecesTransparent();
	    		gamePieces.set8PiecesTransparent();
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
	    	    		gamePieces.setX1PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO1PieceVisible();
	    	    	}
	    	    	setPieceData(0, 0);
	    	    	repaint();
	    	    };
	    	};
	    });

	    JButton button2 = createButton(90+150, 100, 140, 110, "", true);
	    button2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		
	    	    if (!gameData.isGameValueSet(0, 1)) {		
	    	    	if (gameData.isXTurn()) {
	    	    		gamePieces.setX2PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO2PieceVisible();
	    	    	}
	    	    	setPieceData(0, 1);
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
	    	    		gamePieces.setX3PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO3PieceVisible();
	    	    	}
	    	    	setPieceData(0, 2);
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
	    	    		gamePieces.setX4PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO4PieceVisible();
	    	    	}
	    	    	setPieceData(1, 0);
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
	    	    		gamePieces.setX5PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO5PieceVisible();
	    	    	}
	    	    	setPieceData(1, 1);
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
	    	    		gamePieces.setX6PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO6PieceVisible();
	    	    	}
	    	    	setPieceData(1, 2);
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
	    	    		gamePieces.setX7PieceVisible();    	    		
	    	    	}
	    	    	else {
	    	    		gamePieces.setO7PieceVisible();
	    	    	}
	    	    	setPieceData(2, 0);
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
	    	    		gamePieces.setX8PieceVisible();    	    		
	    	    	}
	    	    	else {
		    	    	gamePieces.setO8PieceVisible();
		    	    }
		    	    setPieceData(2, 1);
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

