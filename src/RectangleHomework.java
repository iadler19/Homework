import java.awt.Rectangle;

public class RectangleHomework 
{
public static void main(String[] args)
{
	Rectangle box = new Rectangle(5, 10, 20, 30);
	
	box.setLocation(10, 15);
	System.out.println("Expected x = 10");
	System.out.println("The real x = " + box.getX());
	System.out.println("Expected y = 15");
	System.out.println("The real y = " + box.getY());
}
}