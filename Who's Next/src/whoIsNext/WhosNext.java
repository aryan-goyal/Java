package whoIsNext;

import java.io.*; //necessary for File and IOException
import java.util.*; //necessary for StringTokenizer and Scanner
import java.text.*; //necessary for NumberFormat

public class WhosNext {
	public static void main(String args[]) throws IOException {
		Scanner sf = new Scanner(
				new File("U:\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\Customers.dat.txt"));
		LinkedListQueue q = new LinkedListQueue();
		while (sf.hasNext()) {
			q.enqueue(sf.nextLine());
		}
		sf.close();

		// Initialize some variables
		int TotalWaitTime = 0;
		Scanner sc = new Scanner((String) q.peekFront());
		int firstCustArrivalTime = sc.nextInt();
		int nextAvailTimeA = firstCustArrivalTime;
		int nextAvailTimeB = firstCustArrivalTime;

		while (!q.isEmpty()) {
			// get customers data
			sc = new Scanner((String) q.peekFront());
			int custArrivalTime = sc.nextInt();
			int custHelpTime = sc.nextInt();
			q.dequeue();

			// Get time this customer's help begins (the time he is dequeued)
			int dequeueTime = 0;
			if (nextAvailTimeA <= nextAvailTimeB) // decide which rep to use
			{
				dequeueTime = custArrivalTime + custHelpTime;
				if (custArrivalTime >= nextAvailTimeA) {
					nextAvailTimeA = custArrivalTime;
				}
				nextAvailTimeA += custHelpTime;
			} else {
				dequeueTime = custArrivalTime + custHelpTime;
				if (custArrivalTime >= nextAvailTimeB) {
					nextAvailTimeB = custArrivalTime;
				}
				nextAvailTimeB += custHelpTime;
			}
			// calculate thisWaitTime based on dequeueTime and custArrivalTime
			int thisWaitTime = dequeueTime - custHelpTime;
			TotalWaitTime += thisWaitTime;
		}
		sc.close();
		System.out.println(TotalWaitTime);
	}
}