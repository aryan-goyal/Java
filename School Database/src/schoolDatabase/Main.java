package schoolDatabase;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		// static data for staff, students, teachers
		School.staff.add(new Person("Joe Meranaga", 1978, "Male"));
		School.staff.add(new Person("Bill O'Brien", 1988, "Male"));
		School.staff.add(new Person("Jill Jones", 1992, "Female"));
		School.schoolCourses.add(new Course("Math 30-4", 201));
		School.schoolCourses.get(0).courseTeacher.add(new Teacher("Mr. Potter", 1977, "Male", "Math 30-4"));
		School.schoolCourses.get(0).courseList.add(new Student("Billy Bob Joe", 1999, "Male", 12, 67.0));
		School.schoolCourses.get(0).courseList.add(new Student("The Rock", 1998, "Male", 12, 79.0));
		School.schoolCourses.get(0).courseList.add(new Student("One-Chainz", 1999, "Male", 12, 86.0));
		School.schoolCourses.add(new Course("Physical Education 30-3", 1));
		School.schoolCourses.get(1).courseTeacher
				.add(new Teacher("Ms. Watson", 1990, "Female", "Physical Education 30-3"));
		School.schoolCourses.get(1).courseList.add(new Student("Speedy Gonzales", 2000, "Male", 12, 55.0));
		School.schoolCourses.get(1).courseList.add(new Student("Linda DeWitt", 1999, "Female", 12, 56.0));
		School.schoolCourses.get(1).courseList.add(new Student("Alejandro Peña", 1999, "Male", 12, 57.0));

		// main code
		Scanner kbReaderString = new Scanner(System.in);
		Scanner kbReaderInt = new Scanner(System.in);
		System.out.print("School Name for the databse you would like to edit: ");
		School.name = kbReaderString.nextLine();
		while (true) {
			System.out.println("\n____________________________________________________________________\n" + School.name
					+ "\nMain Menu:\n1. Courses\n2. Staff Directory");
			switch (kbReaderInt.nextInt()) {
			case 1: // Courses
				System.out.println(
						"\nCourse Options:\n1. View Student Info or Update marks \n2. Attendance\n3. Add Course\n4. Add Student to Course\n5. Add Teacher to Course\n6. Class Average");
				switch (kbReaderInt.nextInt()) {
				case 1:// View Student Info or Update marks
					School.selectCourse();
					break;
				case 2:// do attendance
					School.attendance();
					break;
				case 3:// add Course
					System.out.print("Subject: ");
					String subject = kbReaderString.nextLine();
					System.out.print("Room Number: ");
					int roomNum = kbReaderInt.nextInt();
					School.addCourse(subject, roomNum);
					break;
				case 4:// add Student to course
					School.addStudent();
					break;
				case 5:// add teacher to course
					School.addTeacher();
					break;
				case 6:// Class Average
					School.getClassAverage();
					break;
				}
				break;
			case 2: // staff directory from the persons class (Teachers are not
					// part of the genereal staff, so not included in this list)
				School.selectStaff();
				break;
			default:// if anything else do nothing
			}
		}
	}
}