package methods;

//Jake Simons
//Date -
//AP CompSci -

import java.awt.*;
import java.awt.Color;
import java.awt.event.ActionListener;
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
	    		repaint();
	    	};
	    });
	
	
	    // Square 1 toggle
		JButton button1 = createButton(90, 100, 100, 110, "", true);
	    button1.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		// check if marked - if so do not change.
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
	    		gameData.setXTurn();
	    		label.setText(gameData.getDialog());
	    		//update data with marked square and check for win or tie
	    		repaint();
	    	};
	    });

	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    // FIX and CODE REST OF SQUARES
	    
	    JButton button2= new JButton("");
	    button2.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		gamePieces.colorO5 = Color.GREEN;
	    		repaint();
	    	};
	    });
	    button2.setBounds(90+150, 100, 140, 110);
	    button2.setContentAreaFilled(false);
	    add(button2);

	    JButton button3= new JButton("");
	    button3.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		gamePieces.colorO5 = Color.BLACK;
	    		repaint();
	    	};
	    });
	    button3.setBounds(90+310, 100, 130, 110);
	    button3.setContentAreaFilled(false);
	    add(button3);
	
	    JButton button4= new JButton("");
	    button4.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		gamePieces.colorO5 = Color.BLUE;
	    		repaint();
	    	};
	    });
	    button4.setBounds(90, 100+130, 130, 120);
	    button4.setContentAreaFilled(false);
	    add(button4);

	    JButton button7= new JButton("") {
            @Override public void setBorder(Border border) {
                // No!
            }
        };
	    button7.addActionListener(new ActionListener() {
	    	public void actionPerformed(ActionEvent e) {
	    		if (gameData.isXTurn()) {
	    			gamePieces.colorX7 = Color.CYAN;
	    			gamePieces.colorO7 = transparent;
	    			gamePieces.colorInnerO7 = transparent;
	    		}
	    		else {
	    			gamePieces.colorX7 = transparent;
	    			gamePieces.colorO7 = Color.CYAN;
	    			gamePieces.colorInnerO7 = Color.WHITE;
	    		}
	    		gameData.setXTurn();
	    		label.setText(gameData.getDialog());
	    		//update data with marked square and check for win or tie
	    		repaint();
	    	};
	    });
	    button7.setBounds(90, 100+270, 130, 130);
	    button7.setContentAreaFilled(false);
	    add(button7);

	
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
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

	// CREATE ADDITIONAL VISIBLE FOR ALL 9 BOXES
	
	public void setO5PieceVisible() {
	  gamePieces.colorO5 = Color.BLUE;
	  gamePieces.colorInnerO5 = Color.WHITE;
	}

	public void setX1PieceVisible() {
	  gamePieces.colorX1 = Color.RED;
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

