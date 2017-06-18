package chatBot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Entry {
	public String rootSentence;
	public int key;
	String annot;
	
	public Entry(String a, int b, String annotations){ 
		rootSentence = a;
		key = b;
		annot = annotations;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public int getMatchScore(HashMap<String, ArrayList<String>> processedUtterance) {
		Iterator it = processedUtterance.entrySet().iterator();
	    int MatchScore = 0;
	    while (it.hasNext()) {
	        Map.Entry pair = (Map.Entry)it.next();
	        ArrayList<String> tempArray = (ArrayList<String>) pair.getValue();
	        for (String s: tempArray){
	        	if (annot.contains(s)){
	        		switch((String) pair.getKey()){
	        		case "NN":
	        		case "NNS":
	        		case "NNP":
	        		case "NNPS":
	        		case "FW":
	        			MatchScore += 20;
	        		case "WP":
	        		case "WP$":
	        		case "WRB":
	        		case "WDT":
	        			MatchScore += 10;
	        		case "VB":
	        		case "VBD":
	        		case "VBG":
	        		case "VBN":
	        		case "VBP":
	        		case "VBZ":
	        		case "UH":
	        			MatchScore += 10;
	        		case ".":
	        			MatchScore += 2;
	        		case "JJ":
	        		case "JJR":
	        		case "JJS":
	        		case "CD":
	        			MatchScore += 5;
	        		case "PRP":
	        		case "TO":
	        		case "PDT":
	        		case "IN":
	        			MatchScore += 2;
	        		case "RB":
	        		case "RBR":
	        		case "RBS":
	        			MatchScore += 5;
	        		case "Sentiment":
	        			MatchScore += 5;
	        		default:
	        		}
	        		break;
	        	}
	        }
	        //it.remove(); avoids a ConcurrentModificationException
	    }
	   return MatchScore;
	}
	
	public String getSentiment(){
		if (annot.contains("Very positive"))
			return "++";
		else if (annot.contains("Positive"))
			return "+ ";
		else if (annot.contains("Negative"))
			return "- ";
		else if (annot.contains("Very negative"))
			return "--";
		else{
			return "= ";
		}
	}
	
}
