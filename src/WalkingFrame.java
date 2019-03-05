import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;

public class WalkingFrame extends JFrame 

{
	
	public WalkingFrame()
	{
			setBounds(300,200,500,500);
			setLayout(null);
	
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	WalkingMan man = new WalkingMan(10, 20);
		add(man);
		addKeyListener(new KeyListener()
		{
				public void keyPressed(KeyEvent e)
				{
					 int key = e.getKeyCode();

					    if (key == KeyEvent.VK_LEFT) {
					    	man.setLocation(man.getX()-10, man.getY());
					        
					    }

					    if (key == KeyEvent.VK_RIGHT) {
					    	man.setLocation(man.getX()+10, man.getY());
					        
					    }

					    if (key == KeyEvent.VK_UP) {
					    	man.setLocation(man.getX(), man.getY()-10);
					    }

					    if (key == KeyEvent.VK_DOWN) {
					    	man.setLocation(man.getX(), man.getY()+10);
					    }
		            
		        }
				public void keyReleased(KeyEvent e)
				{
					
				}
				public void keyTyped(KeyEvent e)
				{
					
				}
			;});
			
	}
		{
		
		setVisible(true);
	}



public static void main(String[] args)

{
	new WalkingFrame();
}
}
