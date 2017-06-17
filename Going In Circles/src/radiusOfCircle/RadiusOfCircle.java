package radiusOfCircle;
import java.util.*;
public class RadiusOfCircle 
{
	public static void main(String args[])
	{
		Scanner kbReader = new Scanner(System.in); //Accept keyboard input
		System.out.println("What is the area of the circle?"); //Take input from the user
		double area = kbReader.nextDouble(); // Save input as area
		double r = Math.sqrt(area / Math.PI); // Find r
		System.out.println("The radius is " + r); //Print the result for radius
	}
}

