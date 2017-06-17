package personStudentInstructor;
public class Tester {
	public static void main(String args[])
	{	
		//create Person Billy and use toString method
		Person Jack = new Person("Billy", 1999);
		System.out.println(Jack.toString());
		//create Student Bob and use toString method
		Student Bob = new Student("Bob", 2000, "Bagpiping");
		System.out.println(Bob.toString());
		//create Instructor Joe and use toString method
		Instructor Joe = new Instructor("Joe", 2001, 1000000.70 - 0.01);
		System.out.println(Joe.toString());
	}
}