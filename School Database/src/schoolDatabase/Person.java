package schoolDatabase;
import java.util.Calendar;
public class Person 
{
	//persons includes staff that are not teachers or students
	public Person(String nm, int y, String gend)
	{
		name = nm;
		birthYear = y;
		gender = gend;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		currentAge = year - birthYear;
	}
	//print info for person
	public String printInfo()
	{
		return "____________________________________________________________________________"
				+ "\nName: " + name + "\nYear of Birth: " + birthYear + "\nAge: " + currentAge + "\nGender: " + gender;
	}
	public String gender;
	public String name;
    public int birthYear;
    public int currentAge;
}
