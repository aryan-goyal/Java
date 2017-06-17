package appMain;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import org.eclipse.wb.swing.FocusTraversalOnArray;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.ImageIcon;

public class LoginScreen extends JDialog {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	public JTextField usernameField;
	public JPasswordField passwordField;
	public static LoginScreen loginFrame = new LoginScreen();
	public static Dimension screen = Toolkit.getDefaultToolkit().getScreenSize();

	/**
	 * Launch the application.
	 */
	// start main thread and frame
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				try {
					loginFrame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
					loginFrame.setResizable(false);
					int x = (int) ((screen.getWidth() - 720) / 2);
					int y = (int) ((screen.getHeight() - 480) / 2);
					loginFrame.setLocation(x, y);
					loginFrame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the dialog.
	 */
	public LoginScreen() {
		// GUI elements
		setTitle("Recipie Mama\r\n");
		setFont(new Font("Dialog", Font.PLAIN, 12));
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(LoginScreen.class.getResource("/miscellaneousResources/Icon_1.png")));
		setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 698, 483);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBackground(new Color(62, 62, 63));
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);

		JLabel lblNewLabel = new JLabel("Username\r\n");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(214, 306, 111, 28);
		lblNewLabel.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblNewLabel);

		JLabel lblPassword = new JLabel("Password");
		lblPassword.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPassword.setBounds(214, 341, 111, 28);
		lblPassword.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblPassword);

		JLabel lblNewLabel_1 = new JLabel("Welcome to Recipie Mama. \r\n");

		lblNewLabel_1.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_1.setLabelFor(this);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblNewLabel_1.setForeground(new Color(240, 241, 241));
		lblNewLabel_1.setBounds(186, 13, 336, 36);
		contentPanel.add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("The only source for all your great recipies. \r\n");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel_2.setBounds(178, 38, 344, 36);
		lblNewLabel_2.setForeground(new Color(240, 241, 241));
		contentPanel.add(lblNewLabel_2);

		usernameField = new JTextField();
		usernameField.setBounds(334, 311, 158, 22);
		contentPanel.add(usernameField);
		usernameField.setColumns(10);

		passwordField = new JPasswordField();
		passwordField.setBounds(334, 346, 158, 22);
		contentPanel.add(passwordField);

		JButton loginButton = new JButton("Login\r\n");
		loginButton.setBounds(368, 381, 97, 25);
		contentPanel.add(loginButton);

		JButton registerButton = new JButton("Register");
		registerButton.setBounds(228, 382, 97, 25);
		contentPanel.add(registerButton);

		JLabel lblNewLabel_4 = new JLabel("");
		lblNewLabel_4
				.setIcon(new ImageIcon(LoginScreen.class.getResource("/miscellaneousResources/Icon_Login_Screen.png")));
		lblNewLabel_4.setBounds(246, 74, 210, 219);
		contentPanel.add(lblNewLabel_4);

		JLabel lblUsernameOrPasswordIncorrect = new JLabel("Incorrect username or password");
		lblUsernameOrPasswordIncorrect.setVisible(false);
		;
		lblUsernameOrPasswordIncorrect.setForeground(new Color(240, 241, 241));
		lblUsernameOrPasswordIncorrect.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblUsernameOrPasswordIncorrect.setBounds(238, 400, 210, 36);
		contentPanel.add(lblUsernameOrPasswordIncorrect);
		setFocusTraversalPolicy(new FocusTraversalOnArray(new Component[] { getContentPane(), contentPanel }));
		setLocationRelativeTo(null);

		// when login button is pressed
		loginButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (User.registeredUsers.size() > 0) {
					for (int x = 0; x < User.registeredUsers.size(); x++) {
						if (User.registeredUsers.get(x).checkLoginInfo() == true) {
							loginFrame.dispose();
							MainActivityRecipes.frame.setVisible(true);
						} else {
							lblUsernameOrPasswordIncorrect.setVisible(true);
						}
					}
				}
				else
				{
					lblUsernameOrPasswordIncorrect.setVisible(true);
				}
			}
		});

		// when the register button is pressed
		registerButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				loginFrame.setVisible(false);
				RegisterScreen.registerFrame.setVisible(true);
			}
		});
	}
}