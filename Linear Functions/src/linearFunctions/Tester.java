package linearFunctions;
import java.util.*;
public class Tester {
	private static Scanner kbReader;
	public static void main(String args[])
	{
		kbReader = new Scanner(System.in);
		//get slope
		System.out.print("What is the slope of your line? ");
		double slope1 = kbReader.nextDouble();
		//get y-Intercept
		System.out.print("What is the y-intercept of your line? ");
		double yIntercept = kbReader.nextDouble();
		//create line
		LinearFunction line1 = new LinearFunction(slope1, yIntercept);
		//print properties of the line
		System.out.println("\nSlope of this line is: " + line1.getSlope());
		System.out.println("Y-intercept of this line is: " + line1.getYIntercept());
		System.out.println("Root of this line is: " + line1.getRoot());
		//operations for the line
		System.out.print("\nWhat is an x value for which you wish to solve for y? ");
		double xValue = kbReader.nextDouble();
		System.out.println("The y value corresponding to x = " + xValue + " is " + line1.getYValue(xValue));
		
		System.out.print("\nWhat is a y value for which you wish to solve for x? ");
		double yValue = kbReader.nextDouble();
		System.out.print("The x value corresponding to y = " + yValue + " is " + line1.getXValue(yValue));
	}
}
