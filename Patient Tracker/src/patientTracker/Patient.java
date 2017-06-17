package patientTracker;
public class Patient 
{
	public Patient(String n, String d, int y, int g)
	{
		name = n;
		disease = d;
		yearOfBirth = y;
		gender = g;
	}
	public String name()
	{
		return name;
	}
	public String disease()
	{
		return disease;
	}
	public int yearOfBirth()
	{
		return yearOfBirth;
	}
	public int gender()
	{
		return gender;
	}
	public String name;
	public String disease;
	public int yearOfBirth;
	public int gender;
}
