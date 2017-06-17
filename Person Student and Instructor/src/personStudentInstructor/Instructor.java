package personStudentInstructor;
public class Instructor extends Person{
	public Instructor(String nm, int y, double s)
	{
		super(nm, y);
		salary = s;
	}
	public String toString()
	{
		return "Instructor[name=" + super.name + ",birthYear=" + super.birthYear + ",salary=" + salary + "]";
	}
	public double salary;
}
