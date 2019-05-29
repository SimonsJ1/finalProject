package methods;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.;

public class Board extends {
  public Board 
  {
    setBackground(Color.WHITE);
    setVisible(true);
  }
  
  public void resetBoard(Graphics window){
  }
  
  public void drawBoard(Graphics window){
    window.setColor(Color.BLUE);
    window.drawString("1", 200, 120);
    window.drawString("2", 360, 120);
    window.drawString("3", 510, 120);
    window.drawString("4", 200, 250);
    window.drawString("5", 360, 250);
    window.drawString("6", 510, 250);
    window.drawString("7", 200, 390);
    window.drawString("8", 360, 390);
    window.drawString("9", 510, 390);
    
    window.setColor(Color.YELLOW);
    window.fillRect(220,100, 20, 400);
    window.fillRect(380,100, 20, 400);
    window.fillRect(90,210, 440, 20);
    window.fillRect(90, 350, 440, 20);
