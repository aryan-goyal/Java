package schoolDatabase;

public class Teacher extends Person 
{
	public Teacher(String nm, int y, String gend, String sub)
	{
		super(nm, y, gend);
		subjects = sub;
	}
	//print information of teacher
	public String printInfo()
	{
		return "\n____________________________________________________________________"
				+ "\nName: " + super.name + "\nYear of Birth: " + super.birthYear + "\nAge: " + super.currentAge + "\nGender: " + super.gender + "\nSubjects Currently Teaching: " + subjects;
	}
	public String subjects;
}
