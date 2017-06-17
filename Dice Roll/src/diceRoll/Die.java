package diceRoll;
import java.util.*;
public class Die implements Measurable{
	public Die(int s)
	{
		sides  = s;
		generator = new Random();
		
		cast();
	}
	public int cast()
	{
		response = 1 + generator.nextInt(sides);
		return response;
	}
	public double getMeasure()
	{
		return response;
	}
	private Random generator;
	private int sides;
	public int response;
}
