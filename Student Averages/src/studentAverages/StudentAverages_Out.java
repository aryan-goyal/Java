package studentAverages;
import java.io.*;
import java.util.*;
public class StudentAverages_Out 
{
	public static void main(String Args[]) throws IOException
	{
		Scanner sf = new Scanner(new File("H:\\Desktop\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\StudentScores.in.txt"));
		FileWriter fw = new FileWriter("H:\\Desktop\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\StudentScores.out.txt");
		PrintWriter output = new PrintWriter(fw);
		int maxIndx = -1; //when we increment the first index is 0
		String text[] = new String[100]; //just to be safe we have more than we need
		while(sf.hasNext())
		{
			maxIndx++;
			text[maxIndx] = sf.nextLine();
		}
		double sum = 0;
		int i = 0;
		int count = 0;
		String name = "";
		for(int j=0;j <= maxIndx;j++)
		{
			Scanner sc = new Scanner(text[j]);
			sum = 0;//set the initial sum to 0
			count = 0;
			name = "";
			i = 0;
			name = sc.next();
			while(sc.hasNextInt())
			{
				i = sc.nextInt();
				sum = sum + i;
				count++;
			}
			output.println(name + ", average = " + Math.round(sum / count));
			sc.close();
		}
		sf.close();	//close the file opened up
		fw.close(); //close the file writer so it can be written to the disk
	}
}