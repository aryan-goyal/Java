package patientTracker;

import java.util.*;

public class PatientTrackerMain {
	public static void main(String Args[]) {
		boolean loop = true;
		boolean Start = false;
		boolean userNameBoolean = true;
		boolean topLoop = true;
		Scanner kbReader = new Scanner(System.in);
		Scanner pass = new Scanner(System.in);
		Patient[] patientsArray = new Patient[50];// array to store patients
		patientsArray[0] = new Patient("Billy-Bob Joe", "Dysania", 1999, 1);
		patientsArray[1] = new Patient("The Rock", "Malaria", 2000, 1);
		patientsArray[2] = new Patient("One-Chainz", "Type-8 Diabetes", 1987, 2);
		patientsArray[3] = new Patient("Speedy Gonzales", "Eye cancer", 1972, 1);
		patientsArray[4] = new Patient("Alejandro Peña", "Indeterminable Cancer", 1967, 1);
		while (topLoop) {
			if (userNameBoolean == false)
				;
			userNameBoolean = true;
			while (userNameBoolean) {
				System.out.print("Enter Username: "); // Prompt for user to
														// enter username
				String userName = pass.next();
				System.out.print("Enter pin: ");// Prompt user to enter password
				int password = pass.nextInt();
				if (userName.equals("Dr.Bob") && password == 1375) // correct
																	// password
				{
					Start = true;
					System.out.println("Password entered successfully.");
				} else {// passowrd mismatch
					userNameBoolean = false;
					System.out.println("Username and password mismatch");
				}
				while (Start) // loop in which the code runs forever
				{
					if (loop == false)
						;
					loop = true;
					System.out.println("Select one of the following:(Type \"exit\" to come back to this menu.)");
					System.out.println("1: View Patient");
					System.out.println("2: Add Patient");
					System.out.println("3. Remove patient");
					int numOfPatients = 0; // number of patients at begainning
											// for the loop
					for (int i = 0; i < patientsArray.length; i++)// loop to
																	// count the
																	// number of
																	// spots in
																	// the array
																	// that are
																	// not null.
					{
						if (patientsArray[i] != null)
							numOfPatients++;
					}
					while (loop) // loop to reset code
					{
						String initialInput = kbReader.nextLine();
						if (initialInput.equalsIgnoreCase("Exit"))// if exit is
																	// typed
																	// then
																	// close the
																	// while
																	// loop and
																	// reset the
																	// code.
						{
							loop = false;
						} else {
							int x = Integer.parseInt(initialInput);
							switch (x) {
							case 1: // to view a patient
								System.out
										.println("There are currently " + numOfPatients + " patients at the facility.");
								System.out.println("Select the number of the patient you would like to view?");
								for (int i = 0; i < patientsArray.length; i++) {// print
																				// all
																				// of
																				// the
																				// patients
																				// in
																				// the
																				// array
									if (patientsArray[i] != null)
										System.out.println(i + 1 + ". " + patientsArray[i].name());
								}
								String checkExit = kbReader.nextLine();
								if (checkExit.equalsIgnoreCase("Exit")) {// if
																			// exit
																			// is
																			// typed
																			// then
																			// close
																			// the
																			// while
																			// loop
																			// and
																			// reset
																			// the
																			// code.
									loop = false;
								} else {
									int patientNum = Integer.parseInt(checkExit);
									System.out.println("Name: " + patientsArray[patientNum - 1].name());
									System.out.println("Year of Birth: " + patientsArray[patientNum - 1].yearOfBirth());
									if (patientsArray[patientNum - 1].gender() == 1) {
										System.out.println("Gender: Male");
									} else if (patientsArray[patientNum - 1].gender() == 2) {
										System.out.println("Gender: Female");
									} else if (patientsArray[patientNum - 1].gender() == 3) {
										System.out.println("Gender: Other");
									}
									System.out.println(
											"Reason for being admitted: " + patientsArray[patientNum - 1].disease());
								}
								break;
							case 2: // to add a patient
								System.out.println("What is the patient's first name?");
								String newFirstName = kbReader.nextLine();
								System.out.println("What is the patient's last name?");
								String newLastName = kbReader.nextLine();
								System.out.println("What is the patient's year of birth? (something like 1999)");
								int newYearOfBirth = Integer.parseInt(kbReader.nextLine());
								System.out.println("Gender: (Select one of the following.)");// choose
																								// gender
								System.out.println("1. Male");
								System.out.println("2. Female");
								System.out.println("3. Other");
								int newGender = Integer.parseInt(kbReader.nextLine());
								System.out.println("Reason for being admitted?");
								String newDisease = kbReader.nextLine();
								String fullname = newFirstName + " " + newLastName; // collate
																					// name
								patientsArray[numOfPatients] = new Patient(fullname, newDisease, newYearOfBirth,
										newGender);
								System.out.println("Patient has been added.");// patient
																				// has
																				// been
																				// successfully
																				// added
								loop = false;
								break;
							case 3: // remove a patient
								System.out.println("Which patient would you like to remove? (Type in the number)");
								for (int i = 0; i < patientsArray.length; i++) {// print
																				// out
																				// all
																				// of
																				// the
																				// patients
																				// on
																				// the
																				// screen
									if (patientsArray[i] != null)
										System.out.println(i + 1 + ". " + patientsArray[i].name());
								}
								String checkExit1 = kbReader.nextLine();
								if (checkExit1.equalsIgnoreCase("Exit"))// if
																		// exit
																		// is
																		// typed
																		// then
																		// close
																		// the
																		// while
																		// loop
																		// and
																		// reset
																		// the
																		// code.
								{
									loop = false;
								} else // remove patient
								{
									int patientRemove = Integer.parseInt(checkExit1);
									patientsArray[patientRemove - 1] = null;
									System.out.println("Patient has been removed.");
								}
								loop = false;
								break;
							default: // can only view, add, or remove patients
								System.out.println("Please type in only 1, 2, or 3.");
							}
						}
					}
				}
			}
		}
		kbReader.close();
		pass.close();
	}
}