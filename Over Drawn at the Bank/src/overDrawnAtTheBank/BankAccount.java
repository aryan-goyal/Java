package overDrawnAtTheBank;
public class BankAccount {
	public BankAccount(String n, double b)
	{
		name = n;
		balance = b;
	}
	public void deposit(double d)
	{
		balance = balance + d;
	}
	public void withdraw(double w)
	{
		balance = balance - w;
	}
	public String name;
	public double balance;
}
