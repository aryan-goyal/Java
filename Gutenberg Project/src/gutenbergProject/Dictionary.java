package gutenbergProject;
import java.util.*;
import java.io.*;
public class Dictionary 
{
	public static void main(String args[]) throws IOException
	{
		Scanner sf = new Scanner(new File("H:\\Desktop\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\The Battle of Gettysburg 1863.in.txt"));
		FileWriter fw = new FileWriter("H:\\Desktop\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\dictionary.out.txt");
		PrintWriter output = new PrintWriter(fw);
		int maxIndx = 0; //number of words in the array
		int numOfWords = 0; //number of words in the dictionary 
		ArrayList<String> words = new ArrayList(); //arrayList with all of the words
		ArrayList<String> dictionary = new ArrayList(); //arrayList for comparing the dictionary words
		while(sf.hasNext()) //add the words to the arrayList 
		{
			words.add(sf.next().toString());
			maxIndx++;
		}
		int loopCounter = 0; 
		while(maxIndx > loopCounter) //loop through all of the words in the array
		{
			if(words.get(loopCounter).toString().length()>=3 && Character.isLowerCase(words.get(loopCounter).toString().charAt(0)))
			{
				int x = -1;
				while(x < dictionary.size())
				{
					if(!(dictionary.contains(words.get(loopCounter).toString())))
					{
						dictionary.add(words.get(loopCounter));
						output.println(words.get(loopCounter));

						numOfWords++;
						
					}
					x++;
				}
			}
			loopCounter++;
		}
		System.out.println("There are " + numOfWords + " words in the dictionary.");
		sf.close();	//close the file opened up
		fw.close(); //close the file writer so it can be written to the disk
		
	}
}