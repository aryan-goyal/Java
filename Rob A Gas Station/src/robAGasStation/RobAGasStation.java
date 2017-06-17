package robAGasStation;

import java.awt.*;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.*;

public class RobAGasStation {
	private static final int FRAME_WIDTH = 500;
	private static final int FRAME_HEIGHT = 600;
	public static JButton b1;
	public static JButton b2;
	public static JButton b3;
	public static JButton b4;
	public static JTextArea print;
	public static int choice;d

	public static void main(String Args[]) throws IOException {

		JFrame f1 = new JFrame("Escape the Prison!");
		JPanel p2 = new JPanel();

		print = new JTextArea("");
		print.setForeground(Color.GREEN);
		print.setBackground(Color.BLACK);
		print.setWrapStyleWord(true);
		print.setEditable(false);
		print.setLineWrap(true);

		JScrollPane scroll = new JScrollPane(print, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		f1.add(scroll);
		f1.add(p2, BorderLayout.SOUTH);

		JLabel title = new JLabel(
				"                                                                 The Choice is Yours!");
		title.setForeground(Color.GREEN);
		p2.add(title);

		b1 = new JButton("Play!");
		p2.add(b1);

		b2 = new JButton("Play!");
		p2.add(b2);

		b3 = new JButton("Play!");
		p2.add(b3);

		b4 = new JButton("Play!");
		p2.add(b4);

		ActionListener listener = new ClickListener();
		b1.addActionListener(listener);
		b2.addActionListener(listener);
		b3.addActionListener(listener);
		b4.addActionListener(listener);
		
		p2.setLayout(new BoxLayout(p2, BoxLayout.Y_AXIS));
		p2.setBackground(Color.BLACK);

		f1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f1.setVisible(true);
		f1.setResizable(false);

		print.setText("RobABankStudios presents...");

		try {

			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			// do nothing
		}
		print.setForeground(Color.RED);
		print.setText(print.getText() + " \n\nEscape the Prison.");
		
		try {

			Thread.sleep(3000);
		} catch (InterruptedException ex) {
			// do nothing
		}
		print.setForeground(Color.GREEN);
		print.setText(print.getText() + " \n\nCome on hit the \"Play!\" button already!");
		
		Story newStory = new Story();
		Story.InitiateRoleplay();
	}
}