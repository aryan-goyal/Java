package exceptionHandlingAndDataStructures;
import java.util.*;
public class Seating {
	static Boolean outOfBounds(int num, int bounds)
	{
		Boolean x = (num <= bounds);
		if(!x) //make sure seat picked is in array
		{
			try
			{
				IllegalArgumentException e = new IllegalArgumentException("Please select a number under " + bounds);
				throw e;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e);
			}
		}
	return x;
	}
	static int input() 
	{
		Scanner kbReader = new Scanner(System.in);
		int a = 0;
		try
		{
			a = kbReader.nextInt();
		}
		catch(RuntimeException u)
		{
			System.out.println(u + " The input must be a valid number.");
		}
		return a;
	}
	public static void main(String argh[])
	{
		//create 5x5 array
		int seats[][] = new int[5][5];
		boolean exit = false;
		while(!exit) //print 2d array
		{
			
			for(int row = 0;row < seats.length;row++)
			{
				for(int col = 0;col < seats[row].length;col++)
				{
					System.out.print(seats[row][col] + "\t");
				}
				System.out.println("");
			}
			//get input for row and column
			System.out.println("Type \"Exit\" to exit.");
			System.out.print("Input Row:");
			int r = (input() - 1);
			System.out.print("Input Column:");
			int c = (input() - 1);
			//compare to see if the seat is out of bounds or if the seat is already full.
			if(outOfBounds(r,seats.length)&&outOfBounds(c,seats.length))
			{
				if((seats[r][c] == 0))
					seats[r][c] = 1; 
				else
				{
					try
					{
						IllegalArgumentException b = new IllegalArgumentException("This seat is already booked.");
						throw b;
					}
					catch(IllegalArgumentException b)
					{
						System.out.println(b);
					}
				}
			}
		}
	}
}