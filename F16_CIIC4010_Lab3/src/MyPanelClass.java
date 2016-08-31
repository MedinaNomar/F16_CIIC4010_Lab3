import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.blue);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                          //Draw a border
                        g.setColor(Color.YELLOW);
                        g.drawRect(x1, y1, width, height);
                        
                        //Draw an inner border
                        g.setColor(Color.red);
                        g.drawRect(x1 + 5, y1 + 5, width - 11, height - 11);
                        
                        //Diagonal line
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1, x2, y2);
                        
                        g.setColor(Color.WHITE);
                        g.drawLine(x1, y1 + width, x2, y2 - width);
                        
                        //Another diagonal line
                        g.setColor(Color.LIGHT_GRAY);
                        g.drawOval(x1, y1, 55, 55);
            }
}