package myChar;
import java.util.*;
public class MyChar 
{
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in); //take input from keyboard
		int choice = kbReader.nextInt();
		int speed = choice; 
		switch(speed)
		{
			case 75:
				System.out.println("Exceeding the limit");
				break;
			case 70:
			case 69:
				System.out.println("Getting close");
				break;
			case 65:
				System.out.println("Crusing");
				break;
			default:
				System.out.println("Very slow");
		}
		kbReader.close();
	}
}
