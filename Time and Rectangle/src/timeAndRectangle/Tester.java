package timeAndRectangle;
import java.util.*;
import java.awt.*;
public class Tester {
	public static void main(String args[])
	{
		Date now = new Date();
		
		long currentTime = now.getTime();
		Rectangle a = new Rectangle();
		Rectangle b = new Rectangle();
		//int count is used to move one of the rectangles twice as fast as the other, count switches between 1 and 0
		int count = 0;
		while(true)
		{
			if(CurrentTime.getCurrentTime() >= currentTime)
			{
				//move rectangle a
				System.out.println(CurrentTime.time());
				a.x++;
				System.out.println(a.toString());
				
				//move rectangle b
				if (count != 1)
				{
					b.x++;
				}
				System.out.println(b.toString());
				//1000 ms = 1s added
				currentTime = CurrentTime.getCurrentTime() + 1000;
				count = 1 - count;
				System.out.println("");
			}
		}
	}
}
