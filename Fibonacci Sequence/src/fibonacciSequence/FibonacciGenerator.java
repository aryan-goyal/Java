package fibonacciSequence;
import java.util.*;
public class FibonacciGenerator 
{
	public static void main(String Args[])
	{
		boolean thisisthebestbooleanever = true;
		Scanner in = new Scanner(System.in);
		while (thisisthebestbooleanever = true)
		{
			System.out.println("Enter n:");
			int n = in.nextInt();
			int f1 = 1, f2 = 1, fn = 1;
			while (n>2)
			{
				fn = f1 + f2;
				f2 = f1;
				f1 = fn;
				n--;
		}
		System.out.println(fn);
		}
	}
}
