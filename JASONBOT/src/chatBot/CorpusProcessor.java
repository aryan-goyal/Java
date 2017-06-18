package chatBot;

import java.io.IOException;

public class CorpusProcessor {

	public static void main(String[] args) throws IOException{
		Database g = new Database();
		g.convert("C:\\Users\\RoyCh\\Desktop\\jokes.txt", "C:\\Users\\RoyCh\\Desktop\\jokesp.txt");
	}
}
