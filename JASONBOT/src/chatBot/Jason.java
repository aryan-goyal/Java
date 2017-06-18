package chatBot;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Jason {
	public Database jason = new Database("\\Chatbot\\resources\\movie_corpus.txt");
	public String g = "WTF";
	public Jason() {
		
			Main.botUpdate(jason.Random());
	}

	public void bob() throws IOException {
		boolean exit = false;
		while (!exit) {
			System.out.println();
			//String next = Main.lastUpdate;
			//System.out.println(Main.lastUpdate);
			//Main.botUpdate(jason.getResponse(next));

		}
		// parser.annotate("The study confirmed some bears are attracted to
		// grain, but railways aren’t generally considered a feasting ground.
		// Seventeen of 21 bears never used railways or used them less than 10
		// per cent of the days they were monitored.");
		// parser.annotate("The study confirmed some bears are attracted to
		// grain, but railways aren’t generally considered a feasting ground.
		// Seventeen of 21 bears never used railways or used them less than 10
		// per cent of the days they were monitored.");
	}
	public void respond (String a) {
		try {
			Main.botUpdate(jason.getResponse(a));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
