package fullName;
import java.util.*;
public class FullName 
{
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in); //Accept keyboard input
		System.out.println("What is yout first name?"); //Take first name input from the user
		String first = kbReader.nextLine(); //Save input as first name
		System.out.println("What is yout last name?"); //Take last name input from the user
		String last = kbReader.nextLine(); //Save input as last name
		System.out.println("Your full name is " + first + " " + last + ".");
	}
}
