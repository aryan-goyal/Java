package investmentViewer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddInterestListener implements ActionListener {
	public void actionPerformed(ActionEvent event) {
		// add interest  
		// The listener method accesses the account variable
		// from the surrounding block
		double interest = InvestmentViewer1.account.getBalance() * InvestmentViewer1.INTEREST_RATE / 100;
		InvestmentViewer1.account.deposit(interest);
		System.out.println("balance: " + InvestmentViewer1.account.getBalance());
	}
}