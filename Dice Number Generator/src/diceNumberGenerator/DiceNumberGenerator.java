package diceNumberGenerator;

import java.util.*;

public class DiceNumberGenerator {
	public static void main(String[] args) {
		int roll[] = new int[1000]; // array with the rolls
		int one = 0, two = 0, three = 0, four = 0, five = 0, six = 0;
		for (int z = 0; z < roll.length; z++) {
			roll[z] = (int) Math.ceil(Math.random() * 6); // random number from
															// 1 to 6
			if (roll[z] == 1)
				one++;
			else if (roll[z] == 2)
				two++;
			else if (roll[z] == 3)
				three++;
			else if (roll[z] == 4)
				four++;
			else if (roll[z] == 5)
				five++;
			else if (roll[z] == 6)
				six++;
		}
		// output
		System.out.println("|Roll Number |Frequency |\n|____________|__________|");
		System.out.println(
				"|One         | " + one + "      |" + "\n|Two         | " + two + "      |" + "\n|Three       | " +	three + "      |" + "\n|Four        | " + four + "      |" + "\n|Five        | " + five + "      |" + "\n|Six         | " + six + "      |\n|____________|__________|");
	}
}