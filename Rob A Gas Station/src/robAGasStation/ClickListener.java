package robAGasStation;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClickListener implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent arg0) {
		if (arg0.getSource().equals(RobAGasStation.b1)) {
			RobAGasStation.choice = 1;
		} else if (arg0.getSource().equals(RobAGasStation.b2)) {
			RobAGasStation.choice = 2;
		} else if (arg0.getSource().equals(RobAGasStation.b3)) {
			RobAGasStation.choice = 3;
		} else if (arg0.getSource().equals(RobAGasStation.b4)) {
			RobAGasStation.choice = 4;
		} else {
			RobAGasStation.choice = 0;
		}
	}
}