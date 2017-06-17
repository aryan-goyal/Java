package aTallTale;
 
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.imageio.ImageIO;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;
import javax.swing.JToggleButton;
 
public class NewGUI extends JFrame {
 
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	public static JLabel pictureLbl;
	public static JTextArea txtInventory;
	public static ImageIcon bush;
	public static JTextArea txtArea;
	public static JScrollPane scroll;
	public static StoryLines jason = new StoryLines();
	public static String[] choices = new String[6];
	public static boolean stop = true;
	public static String info;
	public static NewGUI frame;
 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					NewGUI frame = new NewGUI();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
					frame.setResizable(false);
 
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
	public NewGUI() throws IOException {
		setIconImage(Toolkit.getDefaultToolkit().getImage(NewGUI.class.getResource("/aTallTale/Grandmaster logo.png")));
 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 1000);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
 
		JPanel titlePanel = new JPanel();
		titlePanel.setBounds(0, 0, 1348, 50);
		titlePanel.setBackground(new Color(224, 255, 255));
		contentPane.add(titlePanel);
 
		JLabel lblNewLabel = new JLabel("The Legened of Meta");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		titlePanel.add(lblNewLabel);
 
		JPanel picturePanel = new JPanel();
		picturePanel.setBounds(230, 58, 896, 504);
		picturePanel.setBackground(new Color(224, 255, 255));
		contentPane.add(picturePanel);
		picturePanel.setLayout(null);
 
		pictureLbl = new JLabel("");
		pictureLbl.setBounds(12, 13, 872, 478);
		picturePanel.add(pictureLbl);
 
		BufferedImage bufImg = ImageIO.read(NewGUI.class.getResource("/aTallTale/aryana_goyande1.jpg"));
		pictureLbl.setIcon(new ImageIcon(bufImg));
 
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(0, 49, 1348, 10);
		panel_2.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_2);
 
		JPanel panel_3 = new JPanel();
		panel_3.setBounds(0, 562, 1348, 10);
		panel_3.setBackground(Color.BLACK);
		contentPane.add(panel_3);
 
		JPanel panel_4 = new JPanel();
		panel_4.setBounds(221, 58, 10, 504);
		panel_4.setBackground(new Color(0, 0, 0));
		contentPane.add(panel_4);
 
		JPanel panel_5 = new JPanel();
		panel_5.setBounds(1124, 58, 10, 504);
		panel_5.setBackground(Color.BLACK);
		contentPane.add(panel_5);
 
		JPanel panel_6 = new JPanel();
		panel_6.setBounds(0, 895, 1348, 58);
		contentPane.add(panel_6);
		panel_6.setLayout(null);
 
		JButton btnStart = new JButton("Start");
		btnStart.setForeground(Color.WHITE);
		btnStart.setBackground(Color.BLACK);
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (stop) {
					txtUpdate("\n" + jason.cap() + "\n");
					choices = jason.getchoice(choices);
					for (int b = 2; b < 6; b++) {
						if (choices[b] != null) {
							txtUpdate(b - 1 + ". " + choices[b]);
						}
					}
				}
				stop = false;
			}
		});
		btnStart.setBounds(10, 69, 197, 58);
		btnStart.setMnemonic('S');
		btnStart.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnStart);
 
		JPanel panel_9 = new JPanel();
		panel_9.setBounds(0, 886, 1348, 10);
		panel_9.setBackground(Color.BLACK);
		contentPane.add(panel_9);
 
		JPanel rightPanel = new JPanel();
		rightPanel.setBounds(1134, 58, 214, 504);
		rightPanel.setBackground(Color.WHITE);
		contentPane.add(rightPanel);
		rightPanel.setLayout(null);
 
		txtInventory = new JTextArea();
		txtInventory.setWrapStyleWord(true);
		txtInventory.setEditable(false);
		txtInventory.setFont(new Font("Monospaced", Font.BOLD, 18));
		txtInventory.setText("Endings Found:");
		txtInventory.setBackground(Color.WHITE);
		txtInventory.setBounds(12, 13, 190, 478);
		rightPanel.add(txtInventory);
 
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 572, 1348, 314);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
 
		txtArea = new JTextArea();
		txtArea.setEditable(false);
		txtArea.setBackground(new Color(224, 255, 255));
		txtArea.setFont(new Font("Monospaced", Font.BOLD, 20));
		txtArea.setText(
				"Covfefe Studios presents...\r\n\r\n                                             The Legened of Meta\r\nCaution: Press \"Start\" first");
		txtArea.setLineWrap(true);
		txtArea.setWrapStyleWord(true);
		txtArea.setRows(11);
		txtArea.setColumns(25);
 
		scroll = new JScrollPane(txtArea);
		scroll.setBounds(0, 0, 1348, 314);
		panel_1.add(scroll);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scroll.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setAutoscrolls(true);
 
		JButton btn1 = new JButton("1");
		btn1.setMnemonic('1');
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = 1;
				if (choices[input + 1] != null) {
					jason.nextscene(choices[input + 1]);
					choose();
				}
			}
		});
		btn1.setBounds(0, 0, 327, 58);
		btn1.setContentAreaFilled(false);
		panel_6.add(btn1);
 
		JButton btn2 = new JButton("2");
		btn2.setMnemonic('2');
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = 2;
				if (choices[input + 1] != null) {
					jason.nextscene(choices[input + 1]);
					choose();
				}
			}
		});
		btn2.setBounds(337, 0, 332, 58);
		btn2.setContentAreaFilled(false);
		panel_6.add(btn2);
 
		JButton btn3 = new JButton("3");
		btn3.setMnemonic('3');
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = 3;
				if (choices[input + 1] != null) {
					jason.nextscene(choices[input + 1]);
					choose();
				}
			}
		});
		btn3.setBounds(679, 0, 332, 58);
		btn3.setContentAreaFilled(false);
		panel_6.add(btn3);
 
		JButton btn4 = new JButton("4");
		btn4.setMnemonic('4');
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 40));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int input = 4;
				if (choices[input + 1] != null) {
					jason.nextscene(choices[input + 1]);
					choose();
				}
			}
		});
		btn4.setBounds(1021, 0, 327, 58);
		btn4.setContentAreaFilled(false);
		panel_6.add(btn4);
 
		JPanel panel_7 = new JPanel();
		panel_7.setBackground(Color.BLACK);
		panel_7.setBounds(327, 0, 10, 58);
		panel_6.add(panel_7);
 
		JPanel panel_8 = new JPanel();
		panel_8.setBackground(Color.BLACK);
		panel_8.setBounds(669, 0, 10, 58);
		panel_6.add(panel_8);
 
		JPanel panel_10 = new JPanel();
		panel_10.setBackground(Color.BLACK);
		panel_10.setBounds(1011, 0, 10, 58);
		panel_6.add(panel_10);
 
		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 137, 221, 10);
		contentPane.add(panel);
 
		JPanel panel_11 = new JPanel();
		panel_11.setBackground(Color.BLACK);
		panel_11.setBounds(0, 231, 221, 10);
		contentPane.add(panel_11);
 
		JPanel slidingPanel = new JPanel();
		slidingPanel.setBackground(Color.WHITE);
		slidingPanel.setBounds(-221, 241, 221, 321);
		contentPane.add(slidingPanel);
		slidingPanel.setLayout(null);
 
		JButton btnAbout = new JButton("About");
		btnAbout.setForeground(Color.WHITE);
		btnAbout.setBackground(Color.BLACK);
		btnAbout.setMnemonic('R');
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 30));
		btnAbout.setBounds(12, 13, 197, 58);
		slidingPanel.add(btnAbout);
 
		// when the About button is pressed in the menu panel, bring up About
		// dialog
		btnAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				About.dialog.setVisible(true);
			}
		});
 
		JPanel panel_13 = new JPanel();
		panel_13.setBackground(Color.BLACK);
		panel_13.setBounds(0, 84, 221, 10);
		slidingPanel.add(panel_13);
 
		JButton btnCheatCodes = new JButton("Cheat Codes");
		btnCheatCodes.setForeground(Color.WHITE);
		btnCheatCodes.setBackground(Color.BLACK);
		btnCheatCodes.setMnemonic('R');
		btnCheatCodes.setFont(new Font("Tahoma", Font.PLAIN, 28));
		btnCheatCodes.setBounds(12, 107, 197, 58);
		slidingPanel.add(btnCheatCodes);
 
		btnCheatCodes.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				CheatCodes.dialog.setVisible(true);
				;
			}
		});
 
		JPanel panel_14 = new JPanel();
		panel_14.setBackground(Color.BLACK);
		panel_14.setBounds(0, 178, 221, 10);
		slidingPanel.add(panel_14);
 
		JToggleButton tglbtnMenu = new JToggleButton("Menu");
		tglbtnMenu.setForeground(Color.WHITE);
		tglbtnMenu.setFont(new Font("Tahoma", Font.PLAIN, 30));
		tglbtnMenu.setBackground(Color.BLACK);
		tglbtnMenu.setBounds(10, 160, 199, 58);
		contentPane.add(tglbtnMenu);
 
		// menu toggle button action
		tglbtnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JToggleButton) e.getSource()).setEnabled(true);
				if ((slidingPanel.getX() + slidingPanel.getWidth()) < 220) {
					new Timer(1, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							slidingPanel.setLocation(slidingPanel.getX() + 5, 241);
							if (slidingPanel.getX() + slidingPanel.getWidth() == 220) {
								((Timer) e.getSource()).stop();
							}
						}
					}).start();
				} else {
					new Timer(1, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							slidingPanel.setLocation(slidingPanel.getX() - 5, 241);
							if (slidingPanel.getX() + slidingPanel.getWidth() == -220) {
								((Timer) e.getSource()).stop();
							}
						}
					}).start();
				}
			}
		});
	}
 
	public static void choose() {
		choices[2] = null;
		choices[3] = null;
		choices[4] = null;
		choices[5] = null;
		choices = jason.getchoice(choices);
		txtUpdate("\n" + jason.cap() + "\n");
		for (int b = 2; b < 6; b++) {
			if (choices[b] != null) {
				txtUpdate(b - 1 + ". " + choices[b]);
			}
		}
 
		try {
			BufferedImage bufImg = ImageIO.read(NewGUI.class.getResource(jason.image()));
			pictureLbl.setIcon(new ImageIcon(bufImg));
		} catch (IOException ex) {
			txtUpdate("Unable to read image file");
		}
	}
 
	public static void txtUpdate(String t) {
		txtArea.setText(txtArea.getText() + "\n" + t);
	}
	
	public static void txtInfo(String i)
	{
		txtInventory.setText(txtArea.getText() + "\n#" + i + "of 8");
	}
}
