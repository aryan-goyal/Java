package diceRoll;
public class DataSet {
	public DataSet()
	{
		sum = 0;
		count = 0;
		maximum = (Double) null;
	}
	public static void add(double x)
	{
		sum = sum + x;
		if (count ==0|| maximum < x)
			maximum = x;
			count++;
	}
	public static double getAverage()
	{
		if (count == 0) return 0;
		else return sum / count;
	}
	public static double getMaximum()
	{
		return maximum;
	}
	private static double sum;
	public static int count;
	private static double maximum;
}
