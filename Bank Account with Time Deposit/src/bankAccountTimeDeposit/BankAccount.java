package bankAccountTimeDeposit;
public class BankAccount 
{
	//regular BankAccount Class with balance, deposit, and withdraw
	public BankAccount(double amt)
	{
		balance = amt;
	}
	public double getBalance()
	{
		return balance;
	}
	public void deposit(double dp)
	{
		balance = balance + dp;
	}
	public void withdraw(double wd)
	{
		balance = balance - wd;
	}
	public double balance;
}

