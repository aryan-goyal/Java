package buttonBackgroundColor;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

	public void actionPerformed(ActionEvent event) {

		if (event.getSource() == Tester.button1) {
			Tester.pane.setBackground(Color.RED);
		} else if (event.getSource() == Tester.button2) {
			Tester.pane.setBackground(Color.GREEN);
		} else if (event.getSource() == Tester.button3) {
			Tester.pane.setBackground(Color.BLUE);
		}
	}
}
