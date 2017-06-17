package radioButtons;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Main {
	private static final int FRAME_WIDTH = 200;
	private static final int FRAME_HEIGHT = 140;
	public static JPanel center = new JPanel();
	public static JRadioButton button1;
	public static JRadioButton button2;
	public static JRadioButton button3;

	public static void main(String[] args) {
		JPanel pane = new JPanel();
		JFrame frame = new JFrame();
		frame.add(center);
		frame.add(pane);

		button1 = new JRadioButton("Red");
		pane.add(button1);

		button2 = new JRadioButton("Green");
		pane.add(button2);

		button3 = new JRadioButton("Blue");
		pane.add(button3);

		ActionListener listener1 = new ClickListener();
		button1.addActionListener(listener1);
		button2.addActionListener(listener1);
		button3.addActionListener(listener1);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);

		pane.setLocation(0, 0);
		pane.setSize(50, 50);
		center.setLocation(65, 40);
		center.setSize(50, 50);
	}
}
