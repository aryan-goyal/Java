package password;

import java.util.*;

public class Password {
	public static void main(String args[]) {
		Scanner kbReader = new Scanner(System.in); // take input from keyboard
		System.out.print("Enter your password: "); // Prompt for user to enter
													// password
		String password = kbReader.nextLine();
		if (password.equals("XRay")) { // if else command to check for password
			System.out.println("Password entered successfully.");
		} else {
			System.out.println("Incorrect Password.");
		}
		kbReader.close();
	}
}
