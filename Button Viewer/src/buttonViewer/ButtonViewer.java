package buttonViewer;

import java.awt.Color;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ButtonViewer {
	private static final int FRAME_WIDTH = 100;
	private static final int FRAME_HEIGHT = 120;

	public static void main(String[] args) {
		JFrame frame = new JFrame();
		JPanel pane = new JPanel();
		JButton button1 = new JButton("Button A");
		frame.add(pane);
		pane.add(button1);
		
		JButton button2 = new JButton("Button B");
		pane.add(button2);

		ActionListener listener1 = new ClickListener();
		button1.addActionListener(listener1);
		button2.addActionListener(listener1);

		frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		pane.setBackground(Color.GREEN);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
	}
}
