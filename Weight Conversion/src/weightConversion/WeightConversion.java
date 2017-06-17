package weightConversion;

import java.util.*;

public class WeightConversion {
	public static void main(String[] args) {
		Scanner kbReader = new Scanner(System.in); // take input from keyboard
		System.out.print("What is your weight on Earth? "); // Prompt user to
															// input his weight
															// on Earth
		int weight = kbReader.nextInt();
		// Prompt user to select the conversion for the planet
		System.out.println("1. Voltar\n2. Krypton\n3. Fertos\n4. Servontos\n\nSelection? ");
		
		int choice = kbReader.nextInt();
		switch (choice) {
		case 1: // weight on Voltar
			System.out.println("Your weight on Voltar would be " + weight * 0.091);
			break;
		case 2: // weight on Krypton
			System.out.println("Your weight on Krypton would be " + weight * 0.720);
			break;
		case 3: // weight on Fertos
			System.out.println("Your weight on Fertos would be " + weight * 0.865);
			break;
		case 4: // weight on Servontos
			System.out.println("Your weight on Servontos would be " + weight * 4.612);
			break;
		}
		kbReader.close();
	}
}