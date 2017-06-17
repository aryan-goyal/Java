package radioButtons;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {

		if (Main.button1.isSelected()) {
			Main.center.setBackground(Color.RED);
		} else if (Main.button2.isSelected()) {
			Main.center.setBackground(Color.GREEN);
		} else if (Main.button3.isSelected()) {
			Main.center.setBackground(Color.BLUE);
		}
	}
}
