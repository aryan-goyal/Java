package schoolDatabase;
import java.util.*;
import java.text.DecimalFormat;
public class Course {
	Scanner kbReaderInt2 = new Scanner(System.in);
	Scanner kbReaderString2 = new Scanner(System.in);
	DecimalFormat decFor = new DecimalFormat("0.00");
	public Course(String sub, int room)
	{
		Subject = sub;
		roomNumber = room;
	}
	//add teacher to course
	public boolean addTeacher()
	{
		System.out.print("Teacher Name: ");
		String nameTea = kbReaderString2.nextLine();
		System.out.print("Year of Birth: ");
		int yearTea = kbReaderInt2.nextInt();
		System.out.print("Gender: ");
		String genderTea = kbReaderString2.next();
		System.out.print("Subjects Currently Teaching: ");
		String subjectsTeaching = kbReaderString2.next();
		courseTeacher.add(new Teacher(nameTea, yearTea, genderTea, subjectsTeaching));
		System.out.println("Teacher Successfully Added.");
		return true;
	}
	//add student to course
	public Boolean addStudent()
	{
		System.out.println("\nStudent Name: ");
		String nameStu = kbReaderString2.next();
		System.out.println("Year of Birth: ");
		int yearStu = kbReaderInt2.nextInt();
		System.out.println("Gender: ");
		String genderStu = kbReaderString2.next();
		System.out.println("Grade: ");
		int gradeStu = kbReaderString2.nextInt();
		courseList.add(new Student(nameStu, yearStu, genderStu, gradeStu, 0));
		System.out.println("Student Successfully Added.");
		return true;
	}
	//display list of all students in class and select student
	public void selectStudent()
	{
		System.out.println("\n1. Update Mark\n2. Print Report");
		switch(kbReaderInt2.nextInt())
		{
		case 1:
		{
			System.out.println("\nStudents:");
			for(int x = 0;x < courseList.size();x++)
			{
				System.out.println((x+1) + ". " + courseList.get(x).name);
			}
			System.out.print("Select a student: ");
			courseList.get(kbReaderInt2.nextInt()-1).updatetMark();
			break;
		}
		case 2:
			System.out.println("\nStudents:");
			for(int x = 0;x < courseList.size();x++)
			{
				System.out.println((x+1) + ". " + courseList.get(x).name);
			}
			System.out.print("Select a student: ");
			System.out.println(courseList.get(kbReaderInt2.nextInt()-1).printReport());
			break;
		}
	}
	//retrieve subject of course
	public String getSubject()
	{
		return Subject;
	}
	//retrieve subject
	public int getRoom()
	{
		return roomNumber;
	}
	//retrieve teacher name for course
	public String getTeacher()
	{
		return courseTeacher.get(0).name;
	}
	//allows the user to complete attendance for the course
	public Boolean attendance()
	{
		Boolean exit = true;
		for (int x = 0;x < courseList.size();x++)
			if (courseList.get(x).attendance())
			{
				exit = false;
			}
			else
			{
				exit = false;
			}
		return exit;
	}
	//gives course average
	public String getAverage()
	{
		double sum = 0;
		for(int x = 0;x <courseList.size(); x++)
		{
			sum = sum + courseList.get(x).mark;
		}
		return decFor.format(sum/courseList.size());
	}
	ArrayList<Teacher> courseTeacher = new ArrayList<Teacher>();
	ArrayList<Student> courseList = new ArrayList<Student>();
	public int roomNumber;
	public String Subject;
}