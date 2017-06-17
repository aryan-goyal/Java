
import java.awt.BorderLayout;
import java.awt.EventQueue;
 
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Toolkit;
import javax.swing.JScrollPane;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JScrollBar;
import javax.swing.ImageIcon;
import javax.swing.ScrollPaneConstants;
 
public class Main extends JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3703408939428397567L;
	public static Main frame = new Main();
	public static JLabel picLabel = new JLabel("");
	public static JButton btnEnter;
	private JPanel contentPane;
	public static JTextField txtBeginTyping;
	public static JTextArea print;
	private static JScrollPane scrollPane;
	public static String bot;
	public static Jason j = new Jason();
	public static String lastUpdate;
	public static JTextArea txtrInfoMoodNeutral;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) throws IOException {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
					//j.bob();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
 
	/**
	 * Create the frame.
	 * 
	 * @throws IOException
	 */
	public Main() {
 
		setResizable(false);
		setTitle("J.A.S.O.N.");
		setIconImage(
				Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/chatBot/mainResources/JASON logo.png")));
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 800);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(240, 240, 240));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
 
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 582, 49);
		titlePanel.setBackground(new Color(89, 89, 89));
		contentPane.add(titlePanel);
 
		JLabel lblA = new JLabel("Java Automatized Semantic Operating Network");
		lblA.setForeground(Color.WHITE);
		lblA.setFont(new Font("Tahoma", Font.BOLD, 24));
		lblA.setHorizontalAlignment(SwingConstants.CENTER);
		titlePanel.add(lblA);
 
		JPanel picturePanel = new JPanel();
		picturePanel.setBounds(0, 58, 181, 179);
		picturePanel.setBackground(new Color(240, 240, 240));
		contentPane.add(picturePanel);
		picturePanel.setLayout(null);
 
		picLabel = new JLabel("");
		//picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1neutral.png")));
		picLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		picLabel.setHorizontalAlignment(SwingConstants.LEFT);
		picLabel.setBounds(0, 0, 181, 179);
		picturePanel.add(picLabel);
 
		JPanel linePanel = new JPanel();
		linePanel.setBounds(0, 48, 582, 10);
		linePanel.setBackground(Color.BLACK);
		contentPane.add(linePanel);
 
		JPanel linePanel_1 = new JPanel();
		linePanel_1.setBounds(0, 237, 582, 10);
		linePanel_1.setBackground(Color.BLACK);
		contentPane.add(linePanel_1);
 
		JPanel linePanel_2 = new JPanel();
		linePanel_2.setBounds(0, 655, 582, 10);
		linePanel_2.setBackground(Color.BLACK);
		contentPane.add(linePanel_2);
		
		print = new JTextArea("");
		print.setFont(new Font("Monospaced", Font.BOLD, 18));
		print.setEditable(false);
		print.setColumns(52);
		print.setRows(16);
		print.setForeground(Color.DARK_GRAY);
		print.setBackground(new Color(240, 240, 240));
		print.setWrapStyleWord(true);
		print.setLineWrap(true);
 
		print.setText(
				"RobABankStudios presents...\r\n\r\nJ.A.S.O.N.\r\n\r\nJason: Hello! I am Java Automatized Semantic Operating Network. But you can call me Jason.");
 
		JScrollPane scrollPane_1 = new JScrollPane(print);
		scrollPane_1.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		btnEnter = new JButton("Enter");
		btnEnter.setBounds(512, 665, 70, 92);
		btnEnter.setMnemonic(KeyEvent.VK_ENTER);
		btnEnter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (arg0.getSource().equals(btnEnter)) 
				{
					String a = txtBeginTyping.getText();
					Main.printUpdate();
					j.respond(a);
 
				}
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Surprise1.png")));
                revalidate();
                repaint();
			}
		});
		contentPane.add(btnEnter);
 
		txtBeginTyping = new JTextField();
		txtBeginTyping.setBounds(0, 665, 514, 92);
		txtBeginTyping.setHorizontalAlignment(SwingConstants.LEFT);
		txtBeginTyping.setToolTipText("Begin typing...");
		txtBeginTyping.setFont(new Font("Tahoma", Font.PLAIN, 18));
		txtBeginTyping.setBackground(new Color(240, 240, 240));
		contentPane.add(txtBeginTyping);
		txtBeginTyping.setColumns(10);
 
		JPanel panel = new JPanel();
		panel.setBounds(181, 58, 10, 179);
		panel.setBackground(Color.BLACK);
		contentPane.add(panel);
 
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 246, 582, 408);
		contentPane.add(panel_1);
 
 
		panel_1.add(scrollPane_1);
 
		JPanel Inform = new JPanel();
		Inform.setBounds(192, 58, 390, 179);
		contentPane.add(Inform);
		Inform.setLayout(null);
 
		JTextArea txtrInfoMoodNeutral = new JTextArea();
		txtrInfoMoodNeutral.setFont(new Font("Monospaced", Font.BOLD, 15));
		txtrInfoMoodNeutral.setText(
				"Info\r\n\r\nMood: Neutral\r\n\r\nSystem Health: Normal\r\n\r\nJ.A.S.O.N. Triggered (Boolean): 0\r\n\r\n");
		txtrInfoMoodNeutral.setEditable(false);
		txtrInfoMoodNeutral.setBounds(12, 13, 366, 153);
		Inform.add(txtrInfoMoodNeutral);
	}
 
	public static void printUpdate() {
		String get = txtBeginTyping.getText();
		print.setText(print.getText() + "\n\nYou: " + get);
		txtBeginTyping.setText("");
	}
 
	public static void pictureUpdate() {
		
	}
 
	public static void botUpdate(String x) {
		bot = x;
		print.setText(print.getText() + "\n\nJason: " + bot.substring(2));
 
		switch(bot.substring(0,2)){
			case "++":
				txtrInfoMoodNeutral.setText(
						"Info\r\n\r\nMood: Excited\r\n\r\nSystem Health: Normal\r\n\r\nJ.A.S.O.N. Triggered (Boolean): 0\r\n\r\n");
				double a = Math.random()*10;
				if (a<5){
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Surprise1.png")));
				}
				else
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Surprise2.png")));
			case "+ ":
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Happiness.png")));
			case "= ":
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Neutral.png")));
			case "- ":
				double a1 = Math.random()*10;
				if (a1<5){
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Sadness.png")));
				}
				else
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Disgust.png")));
			case "--":
				double a2 = Math.random()*10;
				if (a2<5){
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Fear.png")));
				}
				else
				picLabel.setIcon(new ImageIcon(Main.class.getResource("/chatBot/mainResources/1Anger.png")));
			default:
		}
			picLabel.updateUI();
	}
}
 
 
