package overDrawnAtTheBank;
import java.util.*;
public class Tester {
	public static void main(String[] args)
	{
		Scanner kbReader = new Scanner(System.in);
		BankAccount myAccount = new BankAccount("Bill Bob Joe", 1000);
		boolean mainLoop = true;
		boolean z = true;
		while(mainLoop)
		{
			if (z == false)
				z = true;
			while(z)
			{
				System.out.println("What would you like to do?");
				System.out.println("1: Deposit");
				System.out.println("2: Withdraw");
				System.out.println("3: Exit");
				int x = kbReader.nextInt();
				switch(x)
				{
				case 1:
					System.out.println("Type in the amount you would like to deposit.");
					myAccount.deposit(kbReader.nextDouble());
					System.out.println("The account balance is $" + myAccount.balance);
					break;
				case 2:
					System.out.println("Type in the amount you would like to withdraw.");
					myAccount.withdraw(kbReader.nextDouble());
					System.out.println("The account balance is $" + myAccount.balance);
					break;
				case 3:
					mainLoop = false;
					z = false;
					break;
				}
			}
			System.out.println("The " + myAccount.name + " account balance is, $" + myAccount.balance);
		}
		kbReader.close();
	}
}
