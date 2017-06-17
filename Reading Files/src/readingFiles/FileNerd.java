package readingFiles;
import java.util.*;
import java.io.*;
public class FileNerd 
{
	public static void main(String args[]) throws IOException
	{
		Scanner sf = new Scanner(new File("H:\\Desktop\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\NerdData.txt"));
		int maxIndx = -1; //when we increment the first index is 0
		String text[] = new String[100]; //just to be safe we have more than we need
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		sf.close();	//close the file opened up
		for(int j = 0;j <= maxIndx;j++)
		{
			String q = text[j];
			if(q.substring(0, 3).equals("The"))
				System.out.println(q);
		}
	}
}