package tester;

import java.util.*;

public class Tester {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in); // Accept keyboard input
		System.out.print("Enter an integer "); // Ask the user to enter an
												// integer
		int i = kbReader.nextInt();
		if (i % 2 == 0) { // test to see if the integer is even
			System.out.println("The integer " + i + " is even.");
		} else { // if the integer is odd
			System.out.println("The integer " + i + " is odd.");
		}
	}
}