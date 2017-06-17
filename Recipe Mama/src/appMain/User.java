package appMain;

import java.util.ArrayList;
import java.util.Calendar;

public class User{
	//user's values get stored into here when they register
	public User(String fNm, String lNm, int yOfB, String mail, String uname, String pass)
	{
		firstName = fNm;
		lastName = lNm;
		yearOfBirth = yOfB;
		email = mail;
		username = uname;
		password = pass;
		int year = Calendar.getInstance().get(Calendar.YEAR);
		currentAge = year - yearOfBirth;
	}
	//print user information
	public String printInfo()
	{
		return "____________________________________________________________________________"
				+ "\nName: " + (firstName + " " + lastName) + "\nYear of Birth: " + yearOfBirth + "\nAge: " + currentAge + "\nEmail: " + email + "\nUsername: " + username;
	}
	//check to see if the username matches the password
	public boolean checkLoginInfo()
	{
		if(username.equals(LoginScreen.loginFrame.usernameField.getText()))
				{
					if(password.equals(LoginScreen.loginFrame.passwordField.getText()))
					{
						return true;
					}
				}
		return false;
	}
	
	public static ArrayList<User> registeredUsers = new ArrayList<User>();
	private String firstName;
	private String lastName;
	private int yearOfBirth;
	private String email;
	public  String username;
	private String password;	
	private int currentAge;
}