package robAGasStation;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.*;
import javax.swing.text.DefaultCaret;

public class Main {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 600;
	private static final int FRAME_WIDTH2 = 300;
	private static final int FRAME_HEIGHT2 = 600;
	public static JButton b1;
	public static JButton b2;
	public static JButton b3;
	public static JButton b4;
	public static JButton b5;
	public static JTextArea print;
	public static int choice;
	public static int timeNumber;
	public static void main(String Args[]) throws IOException {
		//GUI
		JFrame f1 = new JFrame("                                                         Escape the Prison!");
		JFrame f2 = new JFrame("Instructions");
		JPanel p2 = new JPanel();
		JTextArea instruct = new JTextArea();

		print = new JTextArea("RobABankStudios presents...");
		print.setForeground(Color.GREEN);
		print.setBackground(Color.BLACK);
		print.setWrapStyleWord(true);
		print.setEditable(false);
		print.setLineWrap(true);

		JScrollPane scroll = new JScrollPane(print, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		f1.add(scroll);
		f1.add(p2, BorderLayout.SOUTH);

		f2.add(instruct);

		JLabel title1 = new JLabel(
				"                                                                 The Choice is Yours!");
		title1.setForeground(Color.GREEN);

		p2.add(title1);

		instruct.setText(
				"Caution:\nThe following video game had been approved for NEWBS AND PROS ALIKE. No animals, students, or prisoners were harmed in the making of this video game."
						+ "\n\nInstructions:\n\nGreen Text = Player is Alive\nYellow Text = Player is Performing Task\nRed Text = Player is Dead ");
		instruct.setForeground(Color.GREEN);
		instruct.setWrapStyleWord(true);
		instruct.setEditable(false);
		instruct.setLineWrap(true);
		
		//Main JButton in the game
		b1 = new JButton("                          ");
		p2.add(b1);

		b2 = new JButton("                          ");
		p2.add(b2);

		b3 = new JButton("                          ");
		p2.add(b3);

		b4 = new JButton("                          ");
		p2.add(b4);

		b5 = new JButton("                          ");
		p2.add(b5);

		ActionListener listener = new ClickListener();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		b5.addActionListener(listener);

		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setBackground(Color.BLACK);

		instruct.setBackground(Color.BLACK);

		f1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		f1.setResizable(false);
		f1.setLocationRelativeTo(null);

		f2.setSize(FRAME_WIDTH2, FRAME_HEIGHT2);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f2.setVisible(true);
		f2.setResizable(false);
		f2.setLocation(f1.getX() + f1.getWidth(), f1.getY());

		wait(3);

		output("\nEscape the Prison.");

		wait(2);

		print.setForeground(Color.GREEN);
		output("\nCome on hit the \"Play!\" button already!");

		Main.b1.setText("         Play!        ");
		Main.b2.setText("         Play!        ");
		Main.b3.setText("         Play!        ");
		Main.b4.setText("         Play!        ");
		Main.b5.setText("                          ");

		boolean quick = true;
		while (quick) {
			System.out.println("");
			if (choice == 1 || choice == 2 || choice == 3 || choice == 4) {
				output("\nThe man is locked in \"Queen E. Penitentiary\", serving a 3 year sentence for plagiarizing on his computer science project. "
						+ "This is his first day of his sentence and he has no apparent memory of his past. "
						+ "Whether he dies in the proccess or takes a painful path to liberation, the choice is up to you. ");
				wait(8);
				quick = false;
			}
		}
	Story.InitiateRoleplay();
	}
	//method to output text on to JScroolPanel
	public static void output(String n) {
		print.setText(print.getText() + "\n" + n);
		DefaultCaret caret = (DefaultCaret)print.getCaret();
		caret.setUpdatePolicy(DefaultCaret.ALWAYS_UPDATE);
	}
	
	//method to delay the appearance of text on screen
	public static void wait(int x) {
		try {
			Thread.sleep(1000 * x);
		} catch (InterruptedException ex) {
			// do nothing
		}
	}
	
	//Timer
	public static void time() throws InterruptedException{
		try{
			IllegalArgumentException e = new IllegalArgumentException();
			Thread.sleep(1000);
		}catch(IllegalArgumentException e)
		{
			e.printStackTrace();
		}
		timeNumber += 1;
	}
}