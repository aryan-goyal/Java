package robAGasStation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {
	//Class to set the value of choice when one of the JButtons is clicked
	@Override
	public void actionPerformed(ActionEvent event) {
		if (event.getSource() == Main.b1) {
			Main.choice = 1;
		} else if (event.getSource().equals(Main.b2)) {
			Main.choice = 2;
		} else if (event.getSource().equals(Main.b3)) {
			Main.choice = 3;
		} else if (event.getSource().equals(Main.b4)) {
			Main.choice = 4;
		} else if (event.getSource().equals(Main.b5)) {
			Main.choice = 5;
		}
	}
}