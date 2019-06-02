package methods;

//Jake Simons
//Date -
//AP CompSci -

import java.awt.Graphics;
import java.awt.Color;

import javax.swing.JPanel;

public class GamePieces extends JPanel {

	public Color transparent = new Color(255, 255, 255, 0);

	public Color colorX1 = transparent;
	public Color colorX2 = transparent;
	public Color colorX3 = transparent;
	public Color colorX4 = transparent;
	public Color colorX5 = transparent;
	public Color colorX6 = transparent;
	public Color colorX7 = transparent;
	public Color colorX8 = transparent;
	public Color colorX9 = transparent;

	public Color colorO1 = transparent;
	public Color colorO2 = transparent;
	public Color colorO3 = transparent;
	public Color colorO4 = transparent;
	public Color colorO5 = transparent;
	public Color colorO6 = transparent;
	public Color colorO7 = transparent;
	public Color colorO8 = transparent;
	public Color colorO9 = transparent;

	public Color colorInnerO1 = transparent;
	public Color colorInnerO2 = transparent;
	public Color colorInnerO3 = transparent;
	public Color colorInnerO4 = transparent;
	public Color colorInnerO5 = transparent;
	public Color colorInnerO6 = transparent;
	public Color colorInnerO7 = transparent;
	public Color colorInnerO8 = transparent;
	public Color colorInnerO9 = transparent;

	public int verticalOffset = 140;
	public int horizontalOffset = 150;
	
	public GamePieces() // constructor - sets up the class
	{
		setBackground(Color.WHITE);
		setVisible(true);
	}

	public void drawX(Graphics window) {
		
		createX(0, 0, colorX1, window);
		createX(0, 1, colorX2, window);
		createX(0, 2, colorX3, window);
		createX(1, 0, colorX4, window);
		createX(1, 1, colorX5, window);
		createX(1, 2, colorX6, window);
		createX(2, 0, colorX7, window);
		createX(2, 1, colorX8, window);
		createX(2, 2, colorX9, window);
	}
	
	public void createX(int row, int col, Color color, Graphics window) {

		int horiz = horizontalOffset * col;
		int vert = verticalOffset * row;
		
        int [] x = { 190 + horiz, 200 + horiz, 125 + horiz, 115 + horiz };
        int [] y = { 110 + vert, 120 + vert, 195 + vert, 185 + vert };
        int [] x2 = { 125 + horiz, 200 + horiz, 190 + horiz, 115 + horiz };
        int [] y2 = { 110 + vert, 185 + vert, 195 + vert, 120 + vert };
	       
        // number of vertices 
        int numberofpoints = 4; 
	  
        // set the color of line drawn to blue 
        window.setColor(color);   

        // draw the polygon using drawPolygon 
        // function using object of polygon class 
        window.fillPolygon(x, y, numberofpoints); 		
        window.fillPolygon(x2, y2, numberofpoints);
	}

	public void drawO(Graphics window) {

		createO(0, 0, colorO1, colorInnerO1, window);		
		createO(0, 1, colorO2, colorInnerO2, window);		
		createO(0, 2, colorO3, colorInnerO3, window);		
		createO(1, 0, colorO4, colorInnerO4, window);		
		createO(1, 1, colorO5, colorInnerO5, window);		
		createO(1, 2, colorO6, colorInnerO6, window);		
		createO(2, 0, colorO7, colorInnerO7, window);		
		createO(2, 1, colorO8, colorInnerO8, window);		
		createO(2, 2, colorO9, colorInnerO9, window);		
	}

	public void createO(int row, int col, Color outterColor, Color innerColor, Graphics window) {

		window.setColor(outterColor);
		window.fillOval(120 + (horizontalOffset * col), 110 + (verticalOffset * row), 80, 80);
		window.setColor(innerColor);
		window.fillOval(130  + (horizontalOffset * col), 120 + (verticalOffset * row), 60, 60);
	}
	
	public void set9PiecesTransparent() {
		colorX9 = transparent;
		colorO9 = transparent;
		colorInnerO9 = transparent;
	}

	public void setO9PieceVisible() {
		colorO9 = Color.RED;
		colorInnerO9 = Color.WHITE;
	}

	public void setX9PieceVisible() {
		colorX9 = Color.RED;
	}
}