package bigBucks;
import java.text.*;
import java.util.*;
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
				aryList.add(new BankAccount(name, amount));
			}
		}while(!name.equalsIgnoreCase("exit"));
		
		//Search aryList and print out the name and amount of the largest bank account
		BankAccount ba = aryList.get(0);
		double maxBalance = ba.balance;
		String maxName = ba.name;
		for(int j = 1;j < aryList.size();j++)
		{
			if(aryList.get(j).balance >= maxBalance)
			{
				maxBalance = aryList.get(j).balance;
				maxName = aryList.get(j).name;
			}
		}
		System.out.println(" ");
		System.out.println("The account with the largest balance belongs to " + maxName + ".");
		System.out.println("The amount is $" + formatter.format(maxBalance) + ".");
	}
}
