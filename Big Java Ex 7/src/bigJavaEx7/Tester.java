package bigJavaEx7;
public class Tester {
	public static void main(String args[])
	{
		//initiate objects
		Purse a = new Purse();
		Purse b = new Purse();
		//add coins
		a.addCoin("Quarter");
		a.addCoin("Dime");
		a.addCoin("Nickel");
		a.addCoin("Dime");
		
		b.addCoin("Dime");
		b.addCoin("Nickel");
		
		System.out.println("Ex 7.1");
		a.listCoins();
		
		System.out.println("\n\nEx 7.2");
		a.reverse();
		
		System.out.println("\n\nEx 7.3");
		a.addCoin(b.transfer());
		a.listCoins();
	}
}
