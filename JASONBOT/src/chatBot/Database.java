package chatBot;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Database {

	Parser parser = new Parser();
	ArrayList<Entry> database = new ArrayList<Entry>();
	int key = 0;
	@SuppressWarnings("resource")
	
	public void convert (String origin, String Destination) throws IOException{
		Scanner filescanner =  new Scanner(new File(origin));
		PrintWriter writer = new PrintWriter(Destination, "UTF-8");
		while (filescanner.hasNext()){
			String tempLine = filescanner.nextLine();
			writer.println("$$$---$$$");
			writer.println(tempLine);
			writer.println(parser.annotate(tempLine).toString());
			System.out.println("Converting line "+key+"...");
			key++;
		}
		writer.close();
	}
	public Database(){
		
	}
	public Database(String source){
		URL url = getClass().getResource("movie_corpus.txt");
		File file = new File(url.getPath());
		Scanner filescanner = null;
		try {
			filescanner = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		key = 0;
		while (filescanner.hasNext()){
			String tempLine = "Blank";
			String annot = "Blank";
			if (filescanner.hasNext()){
			String buffer = filescanner.nextLine();}
			if (filescanner.hasNext()){
			tempLine = filescanner.nextLine();}
			if (filescanner.hasNext()){			annot = filescanner.nextLine();}
			Entry tempEntry = new Entry(tempLine,key,annot);
			database.add(tempEntry);
			System.out.println("Loading line "+key+"...");
			key++;
		}
		System.out.println("(Ready!)");
		filescanner.close();
	}


public String Random(){
	int a = (int) Math.round(Math.random()*(database.size()-1));
	return database.get(a).getSentiment()+database.get(a).rootSentence;
	}

public String getResponse(String utterance) throws IOException{
	HashMap<String, ArrayList<String>> processedUtterance = parser.annotate(utterance);
	int highest = 1;
	int highestScore = 10;
	int secondHighest = 2;
	int secondScore = 10;
	int thirdHighest = 3;
	int thirdScore = 10;
		for(Entry a : database){
			int matchscore = a.getMatchScore(processedUtterance);
			if (matchscore >= thirdScore){
				thirdHighest = a.key;
				thirdScore = matchscore;
			}
			if (matchscore >= secondScore){
				thirdHighest = secondHighest;
				thirdScore = secondScore;
				secondHighest = a.key;
				secondScore = matchscore;
			}
			if (matchscore >= highestScore){
				secondHighest = highest;
				secondScore = highestScore;
				highest = a.key;
				highestScore = matchscore;
			}
		}
	int scoreSum = highestScore+secondScore+thirdScore;
	int die = (int) Math.round((Math.random())*scoreSum);
	//System.out.println(highest+ " " + highestScore);
	Entry response = null;
		if(highest+1>=database.size()){
			highest = 0;
		}
		if (die<=highestScore){
			response = database.get(highest-1);
		}
		else if (die<=highestScore+secondScore){
			response = database.get(secondHighest-1);
		}
		else{
			response = database.get(thirdHighest-1);
		}

		return response.getSentiment()+response.rootSentence;
	}
}
