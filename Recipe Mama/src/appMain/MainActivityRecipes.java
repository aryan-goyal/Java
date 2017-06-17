package appMain;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import java.awt.Toolkit;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.Timer;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;
import javax.swing.JInternalFrame;
import javax.swing.JTextArea;

public class MainActivityRecipes extends JFrame {
	public static MainActivityRecipes frame = new MainActivityRecipes();
	public static JInternalFrame internalFrameDiplayRecipe;
	private final JPanel contentPanel = new JPanel();
	public static JPanel panel;
	public static JLabel lblRecipeName;
	public static JLabel lblPicture;
	public static JLabel lblServes;
	public static JLabel lblCookTime;
	public static JLabel lblCourse;
	public static JLabel lblCuisine;
	public static JTextArea textAreaIngredientsDirections;
	public static JButton btnBack;
	public static JButton btnForward;
	public static JLabel lblRecipePicture5;
	public static JLabel lblRecipePicture6;
	public static JLabel lblRecipePicture7;
	public static JLabel lblRecipePicture8;
	public static JButton btnRecipe5;
	public static JButton btnRecipe6;
	public static JButton btnRecipe7;
	public static JButton btnRecipe8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setResizable(false);
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public MainActivityRecipes() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(MainActivityRecipes.class.getResource("/miscellaneousResources/Icon_1.png")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1366, 768);
		getContentPane().setLayout(null);

		internalFrameDiplayRecipe = new JInternalFrame("");
		internalFrameDiplayRecipe.getContentPane().setBackground(new Color(62, 62, 63));
		internalFrameDiplayRecipe.setBorder(null);
		internalFrameDiplayRecipe.setBounds(0, 104, 1348, 617);
		getContentPane().add(internalFrameDiplayRecipe);
		internalFrameDiplayRecipe.getContentPane().setLayout(null);

		JPanel titlePanel = new JPanel();
		titlePanel.setBackground(Color.BLACK);
		titlePanel.setBounds(0, 0, 1348, 36);
		internalFrameDiplayRecipe.getContentPane().add(titlePanel);
		titlePanel.setLayout(null);

		lblRecipeName = new JLabel("RecipeName");
		lblRecipeName.setBounds(10, 0, 1328, 36);
		titlePanel.add(lblRecipeName);
		lblRecipeName.setBackground(Color.BLACK);
		lblRecipeName.setForeground(new Color(251, 200, 200));
		lblRecipeName.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipeName.setFont(new Font("Tahoma", Font.PLAIN, 20));

		lblPicture = new JLabel("");
		lblPicture.setHorizontalAlignment(SwingConstants.CENTER);
		lblPicture.setBounds(218, 54, 261, 216);
		internalFrameDiplayRecipe.getContentPane().add(lblPicture);

		lblServes = new JLabel("Serves:");
		lblServes.setForeground(new Color(251, 200, 200));
		lblServes.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblServes.setBounds(51, 324, 428, 26);
		internalFrameDiplayRecipe.getContentPane().add(lblServes);

		lblCookTime = new JLabel("Cook Time:");
		lblCookTime.setForeground(new Color(251, 200, 200));
		lblCookTime.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCookTime.setBounds(51, 361, 428, 26);
		internalFrameDiplayRecipe.getContentPane().add(lblCookTime);

		lblCourse = new JLabel("Course:");
		lblCourse.setForeground(new Color(251, 200, 200));
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCourse.setBounds(51, 398, 428, 26);
		internalFrameDiplayRecipe.getContentPane().add(lblCourse);

		lblCuisine = new JLabel("Cuisine:");
		lblCuisine.setForeground(new Color(251, 200, 200));
		lblCuisine.setFont(new Font("Tahoma", Font.PLAIN, 16));
		lblCuisine.setBounds(51, 435, 428, 26);
		internalFrameDiplayRecipe.getContentPane().add(lblCuisine);

		textAreaIngredientsDirections = new JTextArea();
		textAreaIngredientsDirections.setFont(new Font("Monospaced", Font.PLAIN, 16));
		textAreaIngredientsDirections.setForeground(Color.PINK);
		textAreaIngredientsDirections.setBackground(Color.BLACK);
		textAreaIngredientsDirections.setLineWrap(true);
		internalFrameDiplayRecipe.setVisible(false);

		JScrollPane scroll = new JScrollPane(textAreaIngredientsDirections, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scroll.setBounds(670, 32, 668, 547);
		internalFrameDiplayRecipe.getContentPane().add(scroll);

		panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBounds(0, 0, 1348, 721);
		getContentPane().add(panel);
		panel.setLayout(null);

		JPanel TitlePane = new JPanel();
		TitlePane.setBackground(Color.BLACK);
		TitlePane.setBounds(0, 0, 1368, 52);
		panel.add(TitlePane);
		TitlePane.setLayout(null);

		JLabel lblTitle = new JLabel("Recipe Mama");
		lblTitle.setForeground(new Color(251, 200, 200));
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 36));
		lblTitle.setBounds(550, 5, 253, 44);
		TitlePane.add(lblTitle);

		JPanel Menu = new JPanel();
		Menu.setLayout(null);
		Menu.setBackground(new Color(62, 62, 63));
		Menu.setBounds(0, 52, 1366, 52);
		panel.add(Menu);

		btnBack = new JButton("");
		btnBack.setEnabled(false);
		btnBack.setIcon(new ImageIcon(MainActivityRecipes.class.getResource("/miscellaneousResources/back.png")));
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnBack.setForeground(Color.BLACK);
		btnBack.setToolTipText("Back");
		btnBack.setBounds(12, 12, 106, 29);
		Menu.add(btnBack);

		btnForward = new JButton("");
		btnForward.setEnabled(false);
		btnForward.setIcon(new ImageIcon(MainActivityRecipes.class.getResource("/miscellaneousResources/forward.png")));
		btnForward.setForeground(Color.BLACK);
		btnForward.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnForward.setBounds(130, 12, 106, 29);
		Menu.add(btnForward);

		JToggleButton tglbtnMenu = new JToggleButton("Menu");
		tglbtnMenu.setFont(new Font("Tahoma", Font.PLAIN, 16));
		tglbtnMenu.setBounds(248, 12, 106, 29);
		Menu.add(tglbtnMenu);

		JLabel Welcome = new JLabel("Welcome!");
		if (!User.registeredUsers.isEmpty() && !User.registeredUsers.get(0).username.equals("")) {
			Welcome.setText("Welcome " + User.registeredUsers.get(0).username + "!");
		}

		Welcome.setHorizontalAlignment(SwingConstants.RIGHT);
		Welcome.setForeground(new Color(251, 200, 200));
		Welcome.setFont(new Font("Tahoma", Font.BOLD, 25));
		Welcome.setBounds(1090, 4, 253, 44);
		Menu.add(Welcome);

		JPanel slidingPanel = new JPanel();
		slidingPanel.setBackground(new Color(251, 200, 200));
		slidingPanel.setBounds(-238, 103, 238, 618);
		panel.add(slidingPanel);
		slidingPanel.setLayout(null);

		JButton btnAddNewRecipe = new JButton("Add New Recipe");
		btnAddNewRecipe.setBounds(22, 15, 200, 29);
		btnAddNewRecipe.setFont(new Font("Tahoma", Font.PLAIN, 16));
		slidingPanel.add(btnAddNewRecipe);

		JButton btnAbout = new JButton("About");
		btnAbout.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAbout.setBounds(22, 50, 200, 29);
		slidingPanel.add(btnAbout);

		JPanel Recipe1 = new JPanel();
		Recipe1.setBackground(new Color(251, 200, 200));
		Recipe1.setBounds(0, 104, 337, 308);
		panel.add(Recipe1);
		Recipe1.setLayout(null);

		JButton btnRecipe1 = new JButton("");
		btnRecipe1.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe1.setBounds(12, 264, 313, 44);
		Recipe1.add(btnRecipe1);

		JLabel lblRecipePicture1 = new JLabel("");

		lblRecipePicture1.setHorizontalAlignment(SwingConstants.CENTER);

		lblRecipePicture1.setBounds(12, 13, 313, 238);
		Recipe1.add(lblRecipePicture1);

		JPanel Recipe2 = new JPanel();
		Recipe2.setBackground(Color.PINK);
		Recipe2.setBounds(337, 103, 337, 308);
		panel.add(Recipe2);
		Recipe2.setLayout(null);

		JButton btnRecipe2 = new JButton("");
		btnRecipe2.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe2.setBounds(12, 264, 313, 44);
		Recipe2.add(btnRecipe2);

		JLabel lblRecipePicture2 = new JLabel("");
		lblRecipePicture2.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture2.setBounds(12, 13, 313, 238);
		Recipe2.add(lblRecipePicture2);

		JPanel Recipe3 = new JPanel();
		Recipe3.setBackground(new Color(251, 200, 200));
		Recipe3.setBounds(671, 103, 337, 308);
		panel.add(Recipe3);
		Recipe3.setLayout(null);

		JButton btnRecipe3 = new JButton("");
		btnRecipe3.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe3.setBounds(12, 264, 313, 44);
		Recipe3.add(btnRecipe3);

		JLabel lblRecipePicture3 = new JLabel("");
		lblRecipePicture3.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture3.setBounds(12, 13, 313, 238);
		Recipe3.add(lblRecipePicture3);

		JPanel Recipe4 = new JPanel();
		Recipe4.setBackground(Color.PINK);
		Recipe4.setBounds(1008, 103, 337, 308);
		panel.add(Recipe4);
		Recipe4.setLayout(null);

		JButton btnRecipe4 = new JButton("");
		btnRecipe4.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe4.setBounds(12, 264, 313, 44);
		Recipe4.add(btnRecipe4);

		JLabel lblRecipePicture4 = new JLabel("");
		lblRecipePicture4.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture4.setBounds(12, 13, 313, 238);
		Recipe4.add(lblRecipePicture4);

		JPanel Recipe5 = new JPanel();
		Recipe5.setBackground(Color.PINK);
		Recipe5.setBounds(0, 411, 337, 310);
		panel.add(Recipe5);
		Recipe5.setLayout(null);

		btnRecipe5 = new JButton("");
		btnRecipe5.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe5.setBounds(12, 266, 313, 44);
		Recipe5.add(btnRecipe5);

		lblRecipePicture5 = new JLabel("");
		lblRecipePicture5.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture5.setBounds(12, 13, 313, 238);
		Recipe5.add(lblRecipePicture5);

		JPanel Recipe6 = new JPanel();
		Recipe6.setBackground(new Color(251, 200, 200));
		Recipe6.setBounds(337, 411, 337, 310);
		panel.add(Recipe6);
		Recipe6.setLayout(null);

		btnRecipe6 = new JButton("");
		btnRecipe6.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe6.setBounds(12, 266, 313, 44);
		Recipe6.add(btnRecipe6);

		lblRecipePicture6 = new JLabel("");
		lblRecipePicture6.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture6.setBounds(12, 15, 313, 238);
		Recipe6.add(lblRecipePicture6);

		JPanel Recipe7 = new JPanel();
		Recipe7.setBackground(Color.PINK);
		Recipe7.setBounds(671, 411, 337, 310);
		panel.add(Recipe7);
		Recipe7.setLayout(null);

		btnRecipe7 = new JButton("");
		btnRecipe7.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe7.setBounds(12, 266, 313, 44);
		Recipe7.add(btnRecipe7);

		lblRecipePicture7 = new JLabel("");
		lblRecipePicture7.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture7.setBounds(12, 15, 313, 238);
		Recipe7.add(lblRecipePicture7);

		JPanel Recipe8 = new JPanel();
		Recipe8.setBackground(new Color(251, 200, 200));
		Recipe8.setBounds(1008, 411, 337, 310);
		panel.add(Recipe8);
		Recipe8.setLayout(null);

		btnRecipe8 = new JButton("");
		btnRecipe8.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnRecipe8.setBounds(12, 266, 313, 44);
		Recipe8.add(btnRecipe8);

		lblRecipePicture8 = new JLabel("");
		lblRecipePicture8.setHorizontalAlignment(SwingConstants.CENTER);
		lblRecipePicture8.setBounds(12, 15, 313, 238);
		Recipe8.add(lblRecipePicture8);

		// add four default recipes to test

		// Add recipes to recipe array for retrieval
		Recipe.recipes.add(new Recipe("Pumpkin Chocolate Chip Pancake", 6, 20.0, "Breakfast", "American",
				"/recipeResources/pumpkinChocolateChipPancakes.jpg",
				"src/recipeResources/pumpkinChocolateChipPancakes.txt"));
		Recipe.recipes.add(new Recipe("Flammkuchen - Pizza from Alsace", 4, 15.0, "Lunch", "French",
				"/recipeResources/flammkuchenPizzaFromAlsace.png",
				"src/recipeResources/flammkuchenPizzaFromAlsace.txt"));
		Recipe.recipes.add(new Recipe("Masoor Dal", 6, 35.0, "Dinner", "Indian", "/recipeResources/masoorDal.png",
				"src/recipeResources/masoorDal.txt"));
		Recipe.recipes.add(new Recipe("Ultimate Double Chocolate Chip Cookies", 36, 10.0, "Desert", "Other",
				"/recipeResources/ultimateDoubleChocolateChipCookies.jpg",
				"src/recipeResources/ultimateDoubleChocolateChipCookies.txt"));

		// Add recipes to GUI
		lblRecipePicture1.setIcon(
				new ImageIcon(MainActivityRecipes.class.getResource(Recipe.recipes.get(0).pictureResourcePath)));
		btnRecipe1.setText(Recipe.recipes.get(0).name);

		lblRecipePicture2.setIcon(
				new ImageIcon(MainActivityRecipes.class.getResource(Recipe.recipes.get(1).pictureResourcePath)));
		btnRecipe2.setText(Recipe.recipes.get(1).name);

		lblRecipePicture3.setIcon(
				new ImageIcon(MainActivityRecipes.class.getResource(Recipe.recipes.get(2).pictureResourcePath)));
		btnRecipe3.setText(Recipe.recipes.get(2).name);

		lblRecipePicture4.setIcon(
				new ImageIcon(MainActivityRecipes.class.getResource(Recipe.recipes.get(3).pictureResourcePath)));
		btnRecipe4.setText(Recipe.recipes.get(3).name);

		// add the recipe buttons to a group
		ButtonGroup selectRecipeGroup = new ButtonGroup();
		selectRecipeGroup.add(btnRecipe1);
		selectRecipeGroup.add(btnRecipe2);
		selectRecipeGroup.add(btnRecipe3);
		selectRecipeGroup.add(btnRecipe4);
		selectRecipeGroup.add(btnRecipe5);
		selectRecipeGroup.add(btnRecipe6);
		selectRecipeGroup.add(btnRecipe7);
		selectRecipeGroup.add(btnRecipe8);

		// menu toggle button action
		tglbtnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				((JToggleButton) e.getSource()).setEnabled(true);
				if ((slidingPanel.getX() + slidingPanel.getWidth()) < 238) {
					new Timer(1, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							slidingPanel.setLocation(slidingPanel.getX() + 7, 103);
							if (slidingPanel.getX() + slidingPanel.getWidth() == 238) {
								((Timer) e.getSource()).stop();
							}
						}
					}).start();
				} else {
					new Timer(1, new ActionListener() {
						public void actionPerformed(ActionEvent e) {
							slidingPanel.setLocation(slidingPanel.getX() - 7, 103);
							if (slidingPanel.getX() + slidingPanel.getWidth() == -238) {
								((Timer) e.getSource()).stop();
							}
						}
					}).start();
				}
			}
		});

		// when the About button is pressed in the menu panel, bring up About
		// dialog
		btnAbout.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				About.dialog.setVisible(true);
				;
			}
		});

		// when the first recipe is clicked
		btnRecipe1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe.recipes.get(0).displayRecipe();
			}
		});

		// when the second recipe is clicked
		btnRecipe2.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe.recipes.get(1).displayRecipe();
			}
		});

		// when the third recipe is clicked
		btnRecipe3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Recipe.recipes.get(2).displayRecipe();
			}
		});

		// when the fourth recipe is clicked
		btnRecipe4.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!Recipe.recipes.get(3).name.equals("")) {
					Recipe.recipes.get(3).displayRecipe();
				}
			}
		});

		// when the fifth recipe is clicked
		btnRecipe5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!Recipe.recipes.get(4).name.equals("")) {
					Recipe.recipes.get(4).displayNewRecipe();
				}
			}
		});
		
		// when the sixth recipe is clicked
		btnRecipe6.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!Recipe.recipes.get(5).name.equals("")) {
					Recipe.recipes.get(5).displayNewRecipe();
				}
			}
		});
		
		// when the seventh recipe is clicked
		btnRecipe7.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!Recipe.recipes.get(6).name.equals("")) {
					Recipe.recipes.get(6).displayNewRecipe();
				}
			}
		});
		
		// when the eight recipe is clicked
		btnRecipe8.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (!Recipe.recipes.get(7).name.equals("")) {
					Recipe.recipes.get(7).displayNewRecipe();
				}
			}
		});

		// back button, change visibility of internal frame
		btnBack.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if (btnBack.isEnabled() == true)
					btnBack.setEnabled(false);
				if (btnForward.isEnabled() == false) {
					btnForward.setEnabled(true);
					internalFrameDiplayRecipe.setVisible(false);
				}

			}
		});

		// forward button to recall to last recipe
		btnForward.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {

				if (btnBack.isEnabled() == false)
					btnBack.setEnabled(true);
				if (btnForward.isEnabled() == true) {
					btnForward.setEnabled(false);
					internalFrameDiplayRecipe.setVisible(true);
				}
			}
		});
		
		// when AddNewRecipe button is pressed
		btnAddNewRecipe.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				AddNewRecipe.frame.setVisible(true);
			}
		});
	}
}