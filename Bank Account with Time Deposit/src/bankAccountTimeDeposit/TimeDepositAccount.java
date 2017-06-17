package bankAccountTimeDeposit;
public class TimeDepositAccount extends BankAccount
{
	private double interestRate;
	private double numberOfMonths;
	public TimeDepositAccount(double amount, double rate, double month)
	{
		super(amount);
		interestRate = rate;
		numberOfMonths = month;
	}
	public void addInterest()
	{
		double interest = getBalance() * interestRate / 100;
		deposit(interest);
		numberOfMonths = numberOfMonths - 1;
	}
	public void withdraw(double w)
	{
		if(numberOfMonths > 0)
		{
			balance = balance - (w + 20);
		}
		else if(numberOfMonths <= 0)
		{
			balance = balance - w;
		}
	}
}
