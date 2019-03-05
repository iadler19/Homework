import javax.swing.JComponent;
import javax.swing.JFrame;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

public class WalkingMan extends JComponent {

private Ellipse2D.Double head;
private Rectangle leftArm, rightArm, leftLeg, rightLeg, body; 


 public WalkingMan(int x, int y)
 {
	 this.setLocation(x, y);
	 this.setSize(31, 56);
	  head = new Ellipse2D.Double(10, 0 ,10 ,10);
	  body = new Rectangle(10, 10, 10, 30);
	  leftArm = new Rectangle(0, 10, 10, 10);
	  rightArm = new Rectangle(20, 10, 10, 10);
	  leftLeg = new Rectangle(2, 40, 8, 12);
	  rightLeg = new Rectangle(20, 40, 8, 12);
	  
	}
 
 public void paintComponent(Graphics g)
 {
	 Graphics2D g2 = (Graphics2D) g;
	 
	 g2.draw(body);
	 g2.draw(head);
	 g2.draw(leftArm);
	 g2.draw(leftLeg);
	 g2.draw(rightArm);
	 g2.draw(rightLeg);
	 
	 g2.fill(body);
	 g2.fill(head);
	 g2.fill(leftArm);
	 g2.fill(leftLeg);
	 g2.fill(rightArm);
	 g2.fill(rightLeg);
 }
 

}



