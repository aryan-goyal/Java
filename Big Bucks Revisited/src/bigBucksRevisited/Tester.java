package bigBucksRevisited;
import java.util.*;
import java.text.*;
public class Tester 
{
	public static void main(String args[])
	{
		NumberFormat formatter = NumberFormat.getNumberInstance();
		formatter.setMinimumIntegerDigits(2);
		formatter.setMinimumFractionDigits(2);
		String name;
		//Initiate ArryList object 
		ArrayList<BankAccount> aryList = new ArrayList<BankAccount>();
		ListIterator iter = aryList.listIterator();
		do
		{
			Scanner kbReader = new Scanner(System.in);
			System.out.print("Please enter the name to whom the account belongs.(\"Exit\" to abort)");
			
			name = kbReader.nextLine();
			
			if(!name.equalsIgnoreCase("exit")){
				System.out.print("Please enter the amount of the deposit.");
				double amount = kbReader.nextDouble();
				System.out.println(" ");
				//add the account to the aryList
				iter.add(new BankAccount(name, amount));
			}
		}while(!name.equalsIgnoreCase("exit"));
		
		//Search aryList and print out the name and amount of the largest bank account
		BankAccount ba = (BankAccount) iter.previous();
		double maxBalance = ba.balance;
		String maxName = ba.name;
		while(iter.hasPrevious())
		{
			int x = iter.previousIndex();
			if(aryList.get(x).balance >= maxBalance)
			{
				maxBalance = aryList.get(x).balance;
				maxName = aryList.get(x).name;
			}
			iter.previous();
		}
		System.out.println(" ");
		System.out.println("The account with the largest balance belongs to " + maxName + ".");
		System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
	}
}