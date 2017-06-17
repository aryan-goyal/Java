package bankAccountTimeDeposit;
public class BankAccountTester 
{
	public static void main(String args[])
	{
		//Begin a new timeDepositAcount with initial balance of $50, interest of 10%, and 3 month deposit penalty period
		TimeDepositAccount myAccount = new TimeDepositAccount(50, 10, 3);
		//deposit $50
		myAccount.deposit(50);
		//add interest for 2 months
		myAccount.addInterest();
		myAccount.addInterest();
		//withdraw $30, (1 month still left for penalty)
		myAccount.withdraw(30);
		//Print result and expected result
		System.out.println("myAccount Final Balance: $" + myAccount.getBalance());
		System.out.println("myAccount Expected Balance: $71.00");
	}
}
