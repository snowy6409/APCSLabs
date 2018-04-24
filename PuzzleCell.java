/**
 * Represents a panel for one cell in the Puzzle program.
 */

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Font;
import javax.swing.JPanel;

public class PuzzleCell extends JPanel
{
  private int pieceNumber;
  private boolean picked;

  public PuzzleCell(int k)
  {
    pieceNumber = k;
    picked = false;
  }

  public int getPieceNumber()
  {
    return pieceNumber;
  }

  public void setPieceNumber(int k)
  {
    pieceNumber = k;
  }

  public void setPicked(boolean state)
  {
    picked = state;
  }

  public void paintComponent(Graphics g)
  {
	  super.paintComponent(g);
    if(picked) {
    	setBackground(Color.YELLOW);
    }
    else {
    	setBackground(Color.WHITE);
    }
    
    switch(pieceNumber) {
    
    case 0:   g.translate(this.getWidth(), this.getHeight());
    	break;
    case 1:    g.translate(0, 0);
    	break;
    case 2:    g.translate(-this.getWidth(), 0);
    	break;
    case 3:   g.translate(this.getWidth()-this.getWidth()*3, this.getHeight() -this.getHeight()*1);
    	break;
    case 4: g.translate(0, -this.getHeight());
    	break;
    case 5:    g.translate(this.getWidth()-this.getWidth()*2, this.getHeight() -this.getHeight()*2);
    	break;
    case 6:    g.translate(this.getWidth()-this.getWidth()*3, this.getHeight() -this.getHeight()*2);
    	break;
    case 7:    g.translate(0, -this.getHeight()*2);
    	break;
    case 8:    g.translate(-this.getWidth(), -this.getHeight()*2);
    	break;
    case 9:    g.translate(-this.getWidth()*2, -this.getHeight()*2);
    	break;
    
    
    
    
    
    }
    drawPuzzle(g);
	  
	  
	  
  }

  private void drawPuzzle(Graphics g)
  {
    int width = 3 * getWidth() + 3;   // width of the picture
    int height = 3 * getHeight() + 3; // height of the picture

    int x, y, row, col, k = 1;

    g.setColor(Color.blue);
    g.setFont(new Font("Serif", Font.PLAIN, height / 12));
    for (row = 0; row < 3; row++)
    {
      for (col = 0; col < 3; col++)
      {
        x = width/6 + col * width / 3;
        y = height/6 + row * height / 3;
        g.drawString(String.valueOf(k), x, y);
        k++;
      }
    }
    g.setColor(Color.red);
    g.drawOval(width / 9, height / 9, 7 * width / 9, 7 * height / 9);
  }
}
