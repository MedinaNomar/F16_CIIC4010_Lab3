import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;
import java.awt.geom.Point2D;

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
//                        g.setColor(Color.red);
//                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                        //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                        
//                        //Draw an inner border
//                        g.setColor(Color.red);
//                        g.drawRect(x1 + 5, y1 + 5, width - 11, height - 11);
//                        
//                        //Diagonal line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        //Another one: diagonal line
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1 + width, x2, y2 - width);
//                        
//                        //And another one (oval)
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval((width - 55)/2 , (height - 55)/2, 55, 55);
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Rectangle
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, 300, 200);
                                      
                        //Stripe1
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 , y1 + 40, 300, 40);
                        
                        //Stripe2
                        g.setColor(Color.WHITE);
                        g.fillRect(x1 , y1 + 120, 300, 40);
                        
                        
                        //Triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1 );
                        p3.addPoint(x1 + 150, y1 + 100 );
                        p3.addPoint(x1, y1 + 200);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        //Star
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
			}
}