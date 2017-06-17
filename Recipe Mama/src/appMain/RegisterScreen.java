package appMain;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class RegisterScreen extends JFrame {
	private final JPanel contentPanel = new JPanel();
	private JTextField firstNameField;
	private JTextField lastNameField;
	private JTextField dateOfBirthField;
	public JTextField usernameField;
	private JTextField emailField;
	public static RegisterScreen registerFrame = new RegisterScreen();
	public int userNumber;
	public static JPasswordField passwordField;
	private JPasswordField reTypePasswordField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					registerFrame.setResizable(false);
					int x = (int) ((LoginScreen.screen.getWidth() - 720) / 2);
					int y = (int) ((LoginScreen.screen.getHeight() - 480) / 2);
					registerFrame.setLocation(x, y);
					registerFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RegisterScreen() {
		
		//Build GUI
		setTitle("Recipie Mama > Registration\r\n");
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit().getImage(LoginScreen.class.getResource("/miscellaneousResources/Icon_1.png")));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 720, 411);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(62, 62, 63));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblRegister.setBounds(302, 13, 104, 33);
		lblRegister.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblRegister);

		JLabel lblFirstName = new JLabel("First Name*");
		lblFirstName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblFirstName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblFirstName.setBounds(190, 65, 104, 22);
		lblFirstName.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblFirstName);

		JLabel lblLastName = new JLabel("Last Name*");
		lblLastName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblLastName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblLastName.setBounds(200, 100, 94, 22);
		lblLastName.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblLastName);

		JLabel birthYear = new JLabel("Year Of Birth*");
		birthYear.setHorizontalAlignment(SwingConstants.RIGHT);
		birthYear.setFont(new Font("Tahoma", Font.PLAIN, 18));
		birthYear.setBounds(171, 135, 123, 16);
		birthYear.setForeground(new Color(240, 241, 241));
		contentPanel.add(birthYear);

		JLabel lblUsername = new JLabel("Username*");
		lblUsername.setHorizontalAlignment(SwingConstants.RIGHT);
		lblUsername.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblUsername.setBounds(190, 205, 104, 22);
		lblUsername.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblUsername);

		JLabel lblPassword = new JLabel("Password*");
		lblPassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(200, 240, 94, 16);
		lblPassword.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblPassword);

		JLabel lblRetypePassword = new JLabel("Re-Type Password*");
		lblRetypePassword.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRetypePassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRetypePassword.setBounds(132, 275, 162, 16);
		lblRetypePassword.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblRetypePassword);

		firstNameField = new JTextField();
		firstNameField.setBounds(312, 67, 170, 22);
		contentPanel.add(firstNameField);
		firstNameField.setColumns(10);

		lastNameField = new JTextField();
		lastNameField.setBounds(312, 102, 170, 22);
		contentPanel.add(lastNameField);
		lastNameField.setColumns(10);

		dateOfBirthField = new JTextField();
		dateOfBirthField.setBounds(312, 134, 170, 22);
		contentPanel.add(dateOfBirthField);
		dateOfBirthField.setColumns(10);

		usernameField = new JTextField();
		usernameField.setBounds(312, 207, 170, 22);
		contentPanel.add(usernameField);
		usernameField.setColumns(10);

		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(287, 329, 97, 25);
		contentPanel.add(btnRegister);

		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.RIGHT);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblEmail.setBounds(132, 170, 162, 16);
		lblEmail.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblEmail);

		emailField = new JTextField();
		emailField.setBounds(312, 170, 170, 22);
		contentPanel.add(emailField);
		emailField.setColumns(10);

		JLabel lblIndicatesRequired_1 = new JLabel("* indicates required field");
		lblIndicatesRequired_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblIndicatesRequired_1.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblIndicatesRequired_1.setBounds(452, 70, 238, 16);
		lblIndicatesRequired_1.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblIndicatesRequired_1);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(312, 241, 170, 20);
		contentPanel.add(passwordField);
		
		reTypePasswordField = new JPasswordField();
		reTypePasswordField.setBounds(312, 274, 170, 22);
		contentPanel.add(reTypePasswordField);
		
		//when register button is pressed, check if all parameters are met
		btnRegister.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				int yOfBirth = Integer.parseInt(dateOfBirthField.getText());
				if (dateOfBirthField.getText().equals("")) {
					System.out.println("Must Enter Year of Birth");
				} else
					;
				{
					@SuppressWarnings("deprecation")
					User userNumber = new User(firstNameField.getText(), lastNameField.getText(), yOfBirth,
							emailField.getText(), usernameField.getText(), passwordField.getText());
					User.registeredUsers.add(userNumber);
					registerFrame.dispose();
					LoginScreen.loginFrame.setVisible(true);
				}
			}
		});
	}
}