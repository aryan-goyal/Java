package bigJavaEx7;
import java.util.*;
public class Purse 
{
	public Purse()
	{
	}
	//add coins
	void addCoin(String coinName)
	{
		coins.add(coinName);
	}
	void addCoin(ArrayList<String> a)
	{
		for(int j =0;j < a.size();j++) coins.add(a.get(j));
	}
	//list coins
	void listCoins()
	{
		System.out.print("Purse[");
		for(int x = 0;x < coins.size();x++)
		{
			System.out.print(coins.get(x));
			if((x+1) != coins.size())
			{
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	//reverse coin order
	void reverse()
	{
		reverse.clear();
		for(int x = 0;x < coins.size(); x++ )
		{
			reverse.add(coins.get(coins.size() - x-1));
		}
		
		System.out.print("Purse[");
		for(int x = 0;x < reverse.size();x++)
		{
			System.out.print(reverse.get(x));
			if((x+1) != reverse.size())
			{
				System.out.print(",");
			}
		}
		System.out.print("]");
	}
	
	ArrayList<String> transfer()
	{
		return coins;
	}
	
	ArrayList<String>reverse = new ArrayList<String>();
	ArrayList<String>coins = new ArrayList<String>();
}
