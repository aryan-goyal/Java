 package currencyConverter;
import java.util.*;
public class CurrencyConverter 
{
	public static void main(String Args[])
	{
		Scanner kbReader = new Scanner(System.in); //Accept keyboard input
		Scanner stringReader = new Scanner(System.in);
		System.out.println("What is the current euro and U.S. dollar exchange rate? (How many euros in one dollar?)"); //Prompt for the number of euros in one dollar.
		double rate = kbReader.nextDouble(); //Save input as exhange rate
		boolean done = false; //boolean to stop the loop
		while(!done)
		{
			System.out.println("Enter amount in USD? (Q to quit)");
			String input = stringReader.nextLine();
			if (input.equalsIgnoreCase("Q")) //when q is entered, set the value of the boolean to true, ending the loop
				done = true; 
			else
			{
				double x = Double.parseDouble(input);
				double euro = rate * x;
				System.out.print("Conversion is €" + euro + "\n");
			}
		}
	}
}
