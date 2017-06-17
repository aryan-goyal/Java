package aTallTale;
 
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.EmptyBorder;
 
public class CheatCodes extends JDialog {
 
	private final JPanel contentPanel = new JPanel();
	public static CheatCodes dialog = new CheatCodes();
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
			dialog.setLocationRelativeTo(NewGUI.frame);
			dialog.setResizable(false);
			dialog.setAlwaysOnTop(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
 
	/**
	 * Create the dialog.
	 */
	public CheatCodes() {
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(CheatCodes.class.getResource("/aTallTale/Grandmaster logo.png")));
		setForeground(Color.BLACK);
		setBackground(Color.WHITE);
		setBounds(100, 100, 545, 385);
		getContentPane().setLayout(null);
		contentPanel.setBounds(0, 0, 527, 338);
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel);
		contentPanel.setLayout(null);
		{
			JPanel panel = new JPanel();
			panel.setBackground(Color.BLACK);
			panel.setBounds(0, 283, 527, 10);
			contentPanel.add(panel);
		}
		{
			JButton cancelButton = new JButton("Close");
			cancelButton.setBounds(0, 293, 527, 45);
			contentPanel.add(cancelButton);
			cancelButton.setForeground(Color.BLACK);
			cancelButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
			cancelButton.setBackground(new Color(240, 240, 240));
			cancelButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					dialog.dispose();
				}
			});
			cancelButton.setActionCommand("Cancel");
		}
		{
			JPanel panel = new JPanel();
			panel.setBackground(new Color(224, 255, 255));
			panel.setBounds(0, 0, 527, 283);
			contentPanel.add(panel);
			panel.setLayout(null);
 
			JTextArea txtr = new JTextArea();
			txtr.setEditable(false);
			txtr.setLineWrap(true);
			txtr.setWrapStyleWord(true);
			txtr.setFont(new Font("Monospaced", Font.BOLD, 30));
			txtr.setText("\"There are no elevators to success. You have to take the stairs.\" - Anonymous");
			txtr.setBounds(12, 13, 503, 257);
			txtr.setColumns(10);
			panel.add(txtr);
		}
		{
			JPanel buttonPane = new JPanel();
			buttonPane.setBounds(0, 338, 527, 0);
			getContentPane().add(buttonPane);
			buttonPane.setLayout(new GridLayout(0, 1, 0, 0));
		}
	}
}
