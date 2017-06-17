package robAGasStation;

import java.awt.Color;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Story {
	public static void InitiateRoleplay() throws IOException {
		boolean top = true;
		while (top) {
			boolean shutDown = true;
			Main.b5.setText("         ");
			while (shutDown) {
				Main.b1.setText("         Play!        "); 
				Main.b2.setText("         Play!        ");
				Main.b3.setText("         Play!        ");
				Main.b4.setText("         Play!        ");
				Main.b5.setText("                          ");
				Main.print.setForeground(Color.GREEN);
				System.out.println("");
				if (Main.choice == 1 || Main.choice == 2 || Main.choice == 3 || Main.choice == 4) {
					Main.choice = 0;
					blankButtons();
					Main.output("____________________________________________________________________");
					Main.output(
							"\n\nDerek: Where am I? My back aches from the hard bed with no pillow. Why are there bars on the windows accross from me? "
									+ "Am I in a prison? No...No...this can't be. God, why can't I remeber anything! I... must escape this prison.");
					waitStory(4);
					Main.output("\nNow, what should I do next? .");
					waitStory(3);
					Main.b1.setText("Use Rocket Launcher");
					Main.b2.setText("Use Laser");
					Main.b3.setText("Play Dead");
					Main.b4.setText("Use Drill");
					Main.b5.setText("              ");
					boolean two = true;
					while (two) {
						System.out.println("");
						if (Main.choice == 1) {

							Main.output(
									"\n____________________________________________________________________\nDerek: Thats it, a rocket launcher. Let me aim, fire!");
							Main.print.setForeground(Color.YELLOW);
							waitStory(3);
							Main.print.setForeground(Color.RED);
							Main.output(
									"\nImbecile. He held the rocket launcher backwards and blew yourslef to bits. How did you think that was ever going to work.");
							Story.restart();
							while (two) {
								System.out.print("");
								if (Main.choice == 5) {
									shutDown = false;
									two = false;
								}
							}
						} else if (Main.choice == 2) {
							blankButtons();
							Main.output(
									"\n____________________________________________________________________\nDerek: My physics teacher told me never to play with lasers. Here goes nothing.");
							Main.print.setForeground(Color.YELLOW);
							waitStory(3);
							Main.print.setForeground(Color.GREEN);
							Main.output(
									"\nHe melts the iron bars with his laser.\n\nDerek: Yeah! One step closer to being free.\n\nHe is now in the hallway where a guard is standing in front of an armory.");

							Main.choice = 0;
							Main.b1.setText("Run down hallway like Usain Bolt.");
							Main.b2.setText("Hit guard and take is uniform and gun.");
							Main.b3.setText("Sneak into armory when the guard looks the other way");
							Main.b4.setText("Casually walk out of the prison.");

							boolean three = true;
							while (three) {
								System.out.println("");
								if (Main.choice == 1) {
									blankButtons();
									Main.output(
											"\n____________________________________________________________________\n\n\nDerek: I'm runnin, I'm runnin, I'm runnin really mad."
													+ "\n\nHe is running through the hallway.");
									Main.print.setForeground(Color.YELLOW);
									waitStory(6);
									Main.print.setForeground(Color.RED);
									Main.output("\nBang em like Tupac. A guard saw him and shot him on sight.");
									Story.restart();
									while (two) {
										System.out.print("");
										if (Main.choice == 5) {
											shutDown = false;
											two = false;
											three = false;
										}
									}
								} else if (Main.choice == 2) {
									blankButtons();
									Main.output(
											"\n____________________________________________________________________\n\nDerek: I will go and grab his batton and hit him until he passes out. "
													+ "Then take his uniform and leave the prison.\n\nBam. Wack. Bam. Bam. Zonk. Wack. Wack. Zlop!");
									Main.print.setForeground(Color.YELLOW);
									waitStory(6);
									Main.print.setForeground(Color.RED);
									Main.output(
											"\nKO. Derek falls to the ground. Think next time before trying to take down an eight foot, armed guard");
									Story.restart();
									while (two) {
										System.out.print("");
										if (Main.choice == 5) {
											shutDown = false;
											two = false;
											three = false;
										}
									}
								} else if (Main.choice == 3) {
									Main.choice = 0;
									blankButtons();
									Main.output(
											"\n____________________________________________________________________\n\nDerek: Wait for it... wait for it....Now!"
													+ "\n\nHe sneaks into the armory while the guard is looking the other way.");
									waitStory(4);
									Main.b1.setText("Shotgun");
									Main.b2.setText("Batton");
									Main.b3.setText("Machine Gun");
									Main.b4.setText("Gernades");
									while (two) {
										System.out.println("");
										if (Main.choice == 1) {
											blankButtons();
											Main.output(
													"\nDererk: Yes, a shotgun. It's just the thing I need for close quarters.");
											waitStory(4);
											Main.output(
													"\nChick - Sick. Boom. Chick - Sick. Boom. Chick - Sick Boom. Chick - Sick Boom.");
											waitStory(4);
											Main.output("\nHe makes his way slowly but surely to the entrance.\n\nDerek: Finally I am free.");
											waitStory(4);
											win();
											Main.output("\nCONGRATULATIONS YOU WIN!\n\nRank Achieved: Shotgun Rambo");
											while (two) {
												System.out.print("");
												if (Main.choice == 5) {
													top = false;
													shutDown = false;
													two = false;
													three = false;
												}
											}
										} else if (Main.choice == 2) {
											blankButtons();
											Main.output(
													"\nDerek: What am I supposed to do with a batton. Seriously. Just think about it.");
											waitStory(3);
											Main.print.setForeground(Color.RED);
											Main.output("\nYou lose.");
											restart();
											while (two) {
												System.out.print("");
												if (Main.choice == 5) {
													shutDown = false;
													two = false;
													three = false;
												}
											}
										} else if (Main.choice == 3) {
											blankButtons();
											Main.output(
													"\nDerek: Yes, a machine gun. This will be just like the movies I used to watch.");
											waitStory(4);
											Main.print.setForeground(Color.YELLOW);
											Main.output(
													"\nHe goes into the hallway again. Hey you, Guard. Take some of this.");
											waitStory(3);
											Main.print.setForeground(Color.RED);
											Main.output("\nChig. Chig.\nGod damn it, I forgot the ammunition.");
											restart();
											while (two) {
												System.out.print("");
												if (Main.choice == 5) {
													shutDown = false;
													two = false;
													three = false;
												}
											}
										} else if (Main.choice == 4) {
											blankButtons();
											Main.output(
													"Derek: Yes, gernades. Just the small balls of fury I was looking for.");
											waitStory(6);
											Main.output(
													"He is walking down the hallway chucking gernades left and right, while singing the song"
															+ "\n\"I will catch a gernade for ya...I will put my head on a plate for ya...I will do anything for ya.\"");
											waitStory(6);
											Main.output(
													"Derek: This is amazing. A gernade for you and a gernade for you. Now lets blow this main prison door to kingdom come."
															+ "\nHe walks out of the prison looking all godly and glorious.");
											waitStory(3);
											win();
											Main.output("\nCONGRATULATIONS YOU WIN!\n\nRank Achieved: Shotgun Rambo");
											while (two) {
												System.out.print("");
												if (Main.choice == 5) {
													top = false;
													shutDown = false;
													two = false;
													three = false;
												}
											}
										}
									}
								} else if (Main.choice == 4) {
									blankButtons();
									Main.output(
											"\n____________________________________________________________________\n\n"
													+ "He is walking down the prison hallway. Derek: Hey fat guard, how you doin?");
									waitStory(3);
									Main.output(
											"\nFat Guard: Nothin, just another boring day guarding this lame prison.");
									waitStory(3);
									Main.output("\nHe continues walking and sees another guard.");
									waitStory(3);
									Main.output("\nDerek: Hey skinny my man, how is life?");
									waitStory(3);
									Main.output("\nSkinny Guard: My life, my life has not yet begun.");
									waitStory(3);
									Main.output("\nDerek: I feel you man. Let me know when it does");
									waitStory(3);
									Main.output(
											"\nHe walks to the back enterance which is left open and unattended. Derek walks out of the prison.");
									waitStory(3);
									win();
									Main.output("\nCONGRATULATIONS YOU WIN!\n\nRank Achieved: Good Samaritan");
									while (two) {
										System.out.print("");
										if (Main.choice == 5) {
											top = false;
											shutDown = false;
											two = false;
											three = false;
										}
									}
								}
							}
						} else if (Main.choice == 3) {
							Main.output(
									"\n____________________________________________________________________\nDerek: I am going to play dead. Then when they take me outisde this prison, "
											+ "I shall make my daring escape.\n\nHe is playing dead.");
							Main.print.setForeground(Color.YELLOW);
							waitStory(4);
							Main.print.setForeground(Color.RED);
							Main.output("\nGreat acting buddy. You got him buried!");
							Story.restart();
							while (two) {
								System.out.println("");
								if (Main.choice == 5) {
									shutDown = false;
									two = false;
								}
							}
						} else if (Main.choice == 4) {
							Main.output(
									"\n____________________________________________________________________\nDerek: Nice, I am going to drill my way out.\n\nDrilling");
							Main.print.setForeground(Color.YELLOW);
							waitStory(2);
							Main.print.setForeground(Color.RED);
							Main.output(
									"\nHe drilled through the floor and landed into another cell. Awesome! Now he can spend the rest of his life in maximum security.");
							Story.restart();
							while (two) {
								System.out.println("");
								if (Main.choice == 5) {
									shutDown = false;
									two = false;
								}
							}
						}
					}
				}
			}
		}
		//launch the messages to print to text
		printToTextFile();
	}

	// method to restart code
	public static void restart() {
		Main.b1.setText("                          ");
		Main.b2.setText("                          ");
		Main.b3.setText("                          ");
		Main.b4.setText("                          ");
		Main.b5.setText("Restart Game");
	}

	// method to blank buttons
	public static void blankButtons() {
		Main.b1.setText("                          ");
		Main.b2.setText("                          ");
		Main.b3.setText("                          ");
		Main.b4.setText("                          ");
		Main.b5.setText("                          ");
	}

	// method to delay the appearance of text on screen
	public static void waitStory(double x) {
		try {
			Thread.sleep((long) (1000 * x));
		} catch (InterruptedException ex) {
			// do nothing
		}
	}

	// method to print the text from the pane to a .txt file
	public static void printToTextFile() throws IOException {
		Main.b1.setText("            Yes           ");
		Main.b2.setText("            No            ");
		Main.b3.setText("                          ");
		Main.b4.setText("                          ");
		Main.b5.setText("                          ");
		String panelText = Main.print.getText();
		Main.output("\nWould you like to the save story to a text file?");
		boolean white = true;
		while (white) {
			System.out.println("");
			if (Main.choice == 1) {
				blankButtons();
				FileWriter fw = new FileWriter("D:\\Computer Science\\MyStory.out.txt");
				PrintWriter output = new PrintWriter(fw);
				output.println(panelText);
				fw.close();
				Main.output("\nSuccesfully Printed to file.");
				white = false;
			} else if (Main.choice == 1) {
				blankButtons();
				Main.output("File not Printed.");
				white = false;
			}
		}
	}
	//color changer when the user wins the game
	public static void win()
	{
		Main.print.setForeground(Color.BLUE);
		waitStory(0.5);
		Main.print.setForeground(Color.CYAN);
		waitStory(0.5);
		Main.print.setForeground(Color.MAGENTA);
		waitStory(0.5);
		Main.print.setForeground(Color.ORANGE);
		waitStory(0.5);
		Main.print.setForeground(Color.PINK);
		waitStory(0.5);
		Main.print.setForeground(Color.WHITE);
		waitStory(0.5);
		Main.print.setForeground(Color.GREEN);
	}
}