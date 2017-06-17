package personStudentInstructor;
public class Person 
{
	public Person(String nm, int y)
	{
		name = nm;
		birthYear = y;
	}
	public String toString()
	{
		return "Person[name=" + name + ",birthYear=" + birthYear + "]";
	}
	public String name;
    public int birthYear;
}