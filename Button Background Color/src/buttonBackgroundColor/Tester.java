package buttonBackgroundColor;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Tester {
	private static final int FRAME_WIDTH = 190;
	private static final int FRAME_HEIGHT = 290;
	public static JPanel pane = new JPanel();
	public static ActionListener listener1 = new ClickListener();
	public static JButton button1;
	public static JButton button2;
	public static JButton button3;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		frame.add(pane);
		Icon Red = new ImageIcon(
				"C:\\Users\\aryan\\Documents\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\red.jpg");
		button1 = new JButton(Red);
		pane.add(button1);

		Icon Green = new ImageIcon(
				"C:\\Users\\aryan\\Documents\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\green.png");
		button2 = new JButton(Green);
		pane.add(button2);

		Icon Blue = new ImageIcon(
				"C:\\Users\\aryan\\Documents\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\blue.png");
		button3 = new JButton(Blue);
		pane.add(button3);

		button1.addActionListener(listener1);
		button2.addActionListener(listener1);
		button3.addActionListener(listener1);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
