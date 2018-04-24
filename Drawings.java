import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Drawings extends JPanel
{
	public static boolean Star = false;
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);
    int w = getWidth();
    int h = getHeight();
    if(Star) {
    g.fillRoundRect(w/4+1, h/4+1, w/2, h/2,w/3,h/3);
    g.setColor(Color.WHITE);
    
    g.fillOval(w/4+1, h/4+1, w/4, h/4);

    
    g.fillOval(w/2, h/4+1, w/4, h/4);
    
    
    g.fillOval(w/4+1, h/2, w/4, h/4);
    
    
    g.fillOval(w/2, h/2, w/4, h/4);
    
    }
    else {
    	int[] x = {w/4,w/2,w/2+w/4,w/2};
    	int[] y = {h/2,h/4,h/2,h/2+h/4};
    	g.fillPolygon(x, y, 4);    	
    }
    
    
    
    
    
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Drawings");
    window.setBounds(100, 100, 300, 300);

    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    JPanel canvas = new Drawings();
    canvas.setBackground(Color.WHITE);
    
    JButton J = new JButton();
    J.addActionListener(new ActionListener() {

		@Override
		public void actionPerformed(ActionEvent arg0) {
			if(Star) {
				Star = false;
				System.out.println("Star: " + Star);
				
				canvas.repaint();
				
			}
			else {
				Star = true;
				System.out.println("Star: " + Star);
				canvas.repaint();
			}
		}
    	
    });
    canvas.add(J);
    window.getContentPane().add(canvas);
    window.setVisible(true);
  }
}

