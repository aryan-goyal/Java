package diceRoll;
import java.util.*;
public class Tester {
	private static Scanner kbReader;

	public static void main(String args[])
	{
		kbReader = new Scanner(System.in);
		
		ArrayList<Die> rolls = new ArrayList();
		int index = 0;
		while(true)
		{
			System.out.print("Number of sides of the dice:");
			int side1 = kbReader.nextInt();
			rolls.add(index, new Die(side1));
			
			DataSet.add(rolls.get(index).getMeasure());
			System.out.println("The dice rolled a " + rolls.get(index).getMeasure());
			
			index++;
			DataSet.count = index;
			System.out.println("The average of the rolls is " + DataSet.getAverage());
			System.out.println("\t");
		}
	}
}
