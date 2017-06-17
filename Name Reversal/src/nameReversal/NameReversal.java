package nameReversal; 
import java.util.*;
public class NameReversal 
{
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in); //Accept keyboard input
		System.out.println("Please enter your name."); //Take first name input from the user
		String name = kbReader.nextLine(); //Save input as first name
		int nameLen = name.length();
		String revName ="";
		for (int x = nameLen - 1; x >=0; x--) //using a for loop to iterate through the all of the letters of the name
		{
			String letter = name.substring(x, x +1); //takes the letter starting from the back and stores it in the string 
			revName = revName + letter;
		}
			System.out.println(revName.toLowerCase()); //print put the reversed name in all lowercase
	}
}
