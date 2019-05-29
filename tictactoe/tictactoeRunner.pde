package methods;

import java.awt.Color;
import java.awt.Graphics;

import javax.swing.Frame;
import javax.swing.Panel;

public class tictactoeRunner 
{
  public tictactoeRunner()
  {
    tictactoe t = new tictactoe();
    t.playGame();
  }

  public static void main( String args[] )
  {
    tictactoeRunner run = new tictactoeRunner();
  }
}
