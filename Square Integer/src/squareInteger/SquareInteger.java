package squareInteger;
import java.util.*;
public class SquareInteger 
{
	public static void main(String Args[])
	{
		Scanner kbReader = new Scanner(System.in); 
		
		boolean done = false;
		do
		{
			System.out.println("What is the integer?");
			int x = kbReader.nextInt();
			if (x == 0)
			{
				done = true;
			}
			else 
			{
				int r = x * x;
				System.out.println(r);
			}
		}
		while(true);
	}
}
