package schoolDatabase;
import java.util.*;
public class School 
{
	//The School course contains all of the classrooms
	//initiate a new course and add it to the database
	public static void addCourse(String sub, int room)
	{
		schoolCourses.add(new Course(sub, room));
	}
	//all user to select course from a list of all courses
	public static void selectCourse()
	{
		System.out.println("\nCourses:");
		for(int x = 0;x < schoolCourses.size();x++)
		{
			System.out.println((x+1) + ". " + schoolCourses.get(x).getSubject());
		}
		System.out.print("Select Course: ");
		schoolCourses.get(kbReaderInt1.nextInt() - 1).selectStudent();
	}
	//prints info for staff
	public static void selectStaff()
	{
		for(int x = 0;x < staff.size();x++)
		{
			System.out.println((x+1) + ". " + staff.get(x).name);
		}
		System.out.print("Select a student: ");
		System.out.println(staff.get(kbReaderInt1.nextInt()-1).printInfo());
	}
	//add a student to any one of the courses
	public static void addStudent()
	{
		if (schoolCourses.size() == 0)
		{
			System.out.println("There is no course to put the student into.");
		}
		else
		{
			for(int x = 0;x < schoolCourses.size();x++)
			{
				System.out.println((x+1) + ". " + schoolCourses.get(x).getSubject());
			}
			System.out.print("Select Course: ");
			schoolCourses.get(kbReaderInt1.nextInt() - 1).addStudent();
		}
	}
	//add a teacher to a class
	public static void addTeacher()
	{
		if (schoolCourses.size() == 0)
		{
			System.out.println("There is no course to put the teacher into.");
		}
		else
		{
			for(int x = 0;x < schoolCourses.size();x++)
			{
				System.out.println((x+1) + ". " + schoolCourses.get(x).getSubject());
			}
			System.out.print("Select Course: ");
			schoolCourses.get(kbReaderInt1.nextInt() - 1).addTeacher();
		}
	}
	//do the attendance for the course
	public static void attendance()
	{
		for (int x = 0;x < schoolCourses.size();x++)
		{
			schoolCourses.get(x).attendance();
		}
	}
	//getting class average
	public static void  getClassAverage()
	{
		for(int x = 0;x < schoolCourses.size();x++)
		{
			System.out.println((x+1) + ". " + schoolCourses.get(x).getSubject());
		}
		System.out.print("Select Course: ");
		int input = kbReaderInt1.nextInt();
		System.out.println("The average for " + schoolCourses.get(input-1).getSubject() + " is "+ schoolCourses.get(input -1).getAverage() + "%.");
	}	
	static ArrayList<Course> schoolCourses = new ArrayList<Course>();
	static ArrayList<Person> staff = new ArrayList<Person>();
	static Scanner kbReaderInt1 = new Scanner(System.in);
	static Scanner kbReaderString1 = new Scanner(System.in);
	static String name;
}
