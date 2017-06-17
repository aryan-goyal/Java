package appMain;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextPane;
import java.awt.Toolkit;

public class About extends JDialog {

	private final JPanel contentPanel = new JPanel();
	public static About dialog = new About();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog.setResizable(false);
			dialog.setLocationRelativeTo(null);
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public About() {
		//Build GUI
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(About.class.getResource("/miscellaneousResources/Icon_1.png")));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 556, 300);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(62, 62, 63));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		{
			JLabel lblRecipeMama = new JLabel("Recipe Mama");
			lblRecipeMama.setForeground(new Color(240, 241, 241));
			lblRecipeMama.setFont(new Font("Tahoma", Font.BOLD, 24));
			lblRecipeMama.setBounds(177, 13, 172, 29);
			contentPanel.add(lblRecipeMama);
		}

		JTextPane txtpnDevelopedByAryan = new JTextPane();
		txtpnDevelopedByAryan.setForeground(new Color(240, 241, 241));
		txtpnDevelopedByAryan.setBackground(new Color(62, 62, 63));
		txtpnDevelopedByAryan.setFont(new Font("Tahoma", Font.PLAIN, 16));
		txtpnDevelopedByAryan.setText(
				"Developed By: Aryan Goyal\r\n\r\nVersion: 1.0.2\r\n\r\nLast Updated: 02/24/2017\r\n\r\nRecipies and Images retrieved from OpenEats 2 http://www.openeats.org/");
		txtpnDevelopedByAryan.setBounds(0, 55, 556, 143);
		contentPanel.add(txtpnDevelopedByAryan);

		JButton btnClose = new JButton("Close");
		btnClose.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnClose.setBounds(208, 215, 97, 25);
		contentPanel.add(btnClose);

		// when the close button is pressed, close dialog box
		btnClose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				dialog.dispose();
			}
		});
	}
}