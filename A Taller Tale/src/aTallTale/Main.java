package aTallTale;
 
import java.util.Scanner;
 
public class Main {
	public static void main(String arg[]) {
		StoryLines jason = new StoryLines();
		Scanner sc = new Scanner(System.in);
		while (true) {
			String[] choices = new String[6];
			choices = jason.getchoice(choices);
			System.out.println(jason.image());
			System.out.println(jason.cap());
			for (int b = 2; b < 6; b++) {
				System.out.println(b - 1 + ". " + choices[b]);
			}
			System.out.println("Enter your choice:");
			int input = sc.nextInt();
			jason.nextscene(choices[input + 1]);
		}
	}
}
