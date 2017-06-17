package schoolDatabase;
import java.util.*;
public class Student extends Person
{
	Scanner kbReaderInt3 = new Scanner(System.in);
	Scanner kbReaderDouble3 = new Scanner(System.in);
	public Student(String nm, int y, String gend, int g, double m)
	{
		super(nm, y, gend);
		currentGrade = g;
		mark = m;
	}
	//mark update
	public void updatetMark()
	{
		System.out.println("\nThe student's current mark is " + mark + "%.");
		System.out.print("Student's updated mark:");
		mark = kbReaderDouble3.nextDouble();
	}
	//attendance
	public boolean attendance()
	{
		System.out.println("\nIs " + name + " present today?\n1. Yes\n2. No\n3. Late");
		switch(kbReaderInt3.nextInt())
		{
		case 1:
			daysPresent++;
			return true;
		case 2:
			daysAbsent++;
			return true;
		case 3:
			daysPresent++;
			daysLate++;
			return true;
		default:
			try
			{
				IllegalArgumentException e = new IllegalArgumentException("Please only select one of the options listed above.");
				throw e;
			}
			catch(IllegalArgumentException e)
			{
				System.out.println(e);
			}
		}
		return true;
	}
	//print student report
	public String printReport()
	{
		return "\n________________________________________________"
				+ "\nName: " + super.name + "\nYear of Birth: " + super.birthYear + "\nAge: " + super.currentAge + "\nGender: " + super.gender + "\nGrade: " + currentGrade + "\nMark: " + mark + "\nDays Present: " + daysPresent + "\nDays Absent: " + daysAbsent + "\nDays Late: " + daysLate;
	}
	public int currentGrade;
	public double mark;
	public int daysPresent;
	public int daysAbsent;
	public int daysLate;
}
