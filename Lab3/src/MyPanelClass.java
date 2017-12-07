

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
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
                      //  g.setColor(Color.BLACK);
                    //    g.fillRect(x1, y1, width +1, height+1);
             
                         g.setColor(Color.RED);
                        g.fillRect(x1, y1, width+1, height+1);
                        
                     //   g.setColor(Color.YELLOW);
                       // g.drawRect(x1, y1, width, height);
                        
                        //Draw a border
                  //      g.setColor(Color.RED);
                    //    g.drawRect(x1+20, y1+20, width-40, height-40);
                        
                     //    g.setColor(Color.WHITE);
                       // g.drawLine(x1, y1, x2, y2);
                        
                     //   g.setColor(Color.WHITE);
                      //  g.drawLine(x2, y1, x1, y2);
                        
                        
                     //   g.setColor(Color.LIGHT_GRAY);
                     //   g.fillOval(x2/3, y2/4 , 55, 55);
                        
             
                        g.setColor(Color.WHITE);
                        g.fillRect(0, this.getHeight()/5, this.getWidth(), ((this.getHeight())/5));
                        g.setColor(Color.WHITE);
                        g.fillRect(0, (3*this.getHeight()/5), this.getWidth(), (this.getHeight()/5));
                    
                        Polygon p1 = new Polygon();
                        p1.addPoint( 0, 0);
                        p1.addPoint(x2/2, y2/2);
                        p1.addPoint(0, y2);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p1);
                        g.drawPolygon(p1);
                  
                        Polygon p4 = new Polygon();
                        p4.addPoint(this.getWidth()/12, 11*this.getHeight()/24);
                        p4.addPoint(11*this.getWidth()/78, 11*this.getHeight()/24);
                        p4.addPoint(this.getWidth()/6, 8*this.getHeight()/24);
                        p4.addPoint(14*this.getWidth()/72, 11*this.getHeight()/24);
                        p4.addPoint(18*this.getWidth()/72, 11*this.getHeight()/24);
                        p4.addPoint(15*this.getWidth()/72, 13*this.getHeight()/24);
                        p4.addPoint(16*this.getWidth()/72,  16*this.getHeight()/24);
                        p4.addPoint(this.getWidth()/6, 14*this.getHeight()/24);
                        p4.addPoint(8*this.getWidth()/72,  16*this.getHeight()/24);
                        p4.addPoint(10*this.getWidth()/80, 13*this.getHeight()/24);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        g.drawPolygon(p4);
             
                        
            }
}
