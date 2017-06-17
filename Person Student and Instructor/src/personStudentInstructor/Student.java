package personStudentInstructor;
public class Student extends Person 
{
	public Student(String nm, int y, String m)
	{
		super(nm, y);
		major = m;
	}
	public String toString()
	{
		return "Student[name=" + super.name + ",birthYear=" + super.birthYear + ",major=" + major + "]";
	}
	public String major;
}