package squareAndRectangle;
import java.util.*;
import java.awt.Rectangle;
public class Square extends Rectangle 
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Square()
	{
		Scanner kbReader = new Scanner(System.in);
		System.out.println("What is the x coordinate of the center of the Square?");
		int x = kbReader.nextInt();
		System.out.println("What is the y coordinate of the center of the Square?");
		super.setLocation(x, kbReader.nextInt());
		System.out.println("What is the side length?");
		int side = kbReader.nextInt();
		super.setSize(side, side);
		System.out.println(super.toString());
		kbReader.close();
	}
	public int getArea()
	{
		int area = super.height * super.height;
		return area;
	}
}