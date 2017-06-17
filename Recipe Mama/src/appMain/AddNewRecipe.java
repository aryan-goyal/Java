package appMain;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.FileNameExtensionFilter;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;

public class AddNewRecipe extends JFrame {
	public static AddNewRecipe frame = new AddNewRecipe();;
	private JPanel contentPane;
	private JTextField recipeName;
	private JTextField serves;
	private JTextField cookingTime;
	private JTextField course;
	private JTextField cuisine;
	private JTextField picOfDish;
	private JTextField recipeTextFile;
	public static JButton btnAdd;
	public static int recipeNumber = 3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frame.setResizable(false);
					frame.setLocationRelativeTo(MainActivityRecipes.frame);
					frame.setVisible(false);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AddNewRecipe() {
		setIconImage(Toolkit.getDefaultToolkit()
				.getImage(AddNewRecipe.class.getResource("/miscellaneousResources/Icon_1.png")));
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 648, 480);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(62, 62, 63));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(0, 0, 624, 32);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblAddNewRecipe = new JLabel("Add New Recipe");
		lblAddNewRecipe.setForeground(new Color(251, 200, 200));
		lblAddNewRecipe.setBounds(0, 5, 624, 25);
		panel.add(lblAddNewRecipe);
		lblAddNewRecipe.setHorizontalAlignment(SwingConstants.CENTER);
		lblAddNewRecipe.setFont(new Font("Tahoma", Font.PLAIN, 20));

		JLabel lblRecipeName = new JLabel("Recipe Name:");
		lblRecipeName.setForeground(new Color(251, 200, 200));
		lblRecipeName.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRecipeName.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRecipeName.setBounds(123, 43, 115, 32);
		contentPane.add(lblRecipeName);

		JLabel lblServes = new JLabel("Serves:");
		lblServes.setHorizontalAlignment(SwingConstants.RIGHT);
		lblServes.setForeground(new Color(251, 200, 200));
		lblServes.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblServes.setBounds(123, 86, 115, 32);
		contentPane.add(lblServes);

		JLabel lblCookTime = new JLabel("Cooking Time:");
		lblCookTime.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCookTime.setForeground(new Color(251, 200, 200));
		lblCookTime.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCookTime.setBounds(94, 129, 144, 32);
		contentPane.add(lblCookTime);

		JLabel lblCourse = new JLabel("Course:");
		lblCourse.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCourse.setForeground(new Color(251, 200, 200));
		lblCourse.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCourse.setBounds(94, 172, 144, 32);
		contentPane.add(lblCourse);

		JLabel lblCuisine = new JLabel("Country of origin of cuisine:");
		lblCuisine.setHorizontalAlignment(SwingConstants.RIGHT);
		lblCuisine.setForeground(new Color(251, 200, 200));
		lblCuisine.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCuisine.setBounds(17, 215, 221, 32);
		contentPane.add(lblCuisine);

		JLabel lblPictureOfDish = new JLabel("Picture of dish:");
		lblPictureOfDish.setHorizontalAlignment(SwingConstants.RIGHT);
		lblPictureOfDish.setForeground(new Color(251, 200, 200));
		lblPictureOfDish.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblPictureOfDish.setBounds(71, 258, 167, 32);
		contentPane.add(lblPictureOfDish);

		JLabel lblRecipeTextFile = new JLabel("Recipe Text File:");
		lblRecipeTextFile.setHorizontalAlignment(SwingConstants.RIGHT);
		lblRecipeTextFile.setForeground(new Color(251, 200, 200));
		lblRecipeTextFile.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblRecipeTextFile.setBounds(51, 301, 187, 32);
		contentPane.add(lblRecipeTextFile);

		recipeName = new JTextField();
		recipeName.setBounds(273, 52, 204, 20);
		contentPane.add(recipeName);
		recipeName.setColumns(10);

		serves = new JTextField();
		serves.setColumns(10);
		serves.setBounds(273, 95, 204, 20);
		contentPane.add(serves);

		cookingTime = new JTextField();
		cookingTime.setColumns(10);
		cookingTime.setBounds(273, 138, 204, 20);
		contentPane.add(cookingTime);

		course = new JTextField();
		course.setColumns(10);
		course.setBounds(273, 181, 204, 20);
		contentPane.add(course);

		cuisine = new JTextField();
		cuisine.setColumns(10);
		cuisine.setBounds(273, 224, 204, 20);
		contentPane.add(cuisine);

		picOfDish = new JTextField();
		picOfDish.setColumns(10);
		picOfDish.setBounds(273, 267, 204, 20);
		contentPane.add(picOfDish);

		recipeTextFile = new JTextField();
		recipeTextFile.setColumns(10);
		recipeTextFile.setBounds(273, 310, 204, 20);
		contentPane.add(recipeTextFile);

		 btnAdd = new JButton("Add");
		btnAdd.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnAdd.setBounds(258, 371, 121, 32);
		contentPane.add(btnAdd);

		JButton btnPictureChooseFile = new JButton("Choose File");
		btnPictureChooseFile.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPictureChooseFile.setBounds(487, 264, 115, 23);
		contentPane.add(btnPictureChooseFile);

		JButton btnTextFileChoose = new JButton("Choose File");
		btnTextFileChoose.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnTextFileChoose.setBounds(487, 307, 115, 23);
		contentPane.add(btnTextFileChoose);

		// Choose file for picture of recipe
		btnPictureChooseFile.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("JPG, GIF, & PNG Images", "jpg", "gif",
						"png");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(getParent());
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					picOfDish.setText(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});

		// choose txt file for document
		btnTextFileChoose.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				JFileChooser chooser = new JFileChooser();
				FileNameExtensionFilter filter = new FileNameExtensionFilter("TXT Files", "txt");
				chooser.setFileFilter(filter);
				int returnVal = chooser.showOpenDialog(getParent());
				if (returnVal == JFileChooser.APPROVE_OPTION) {
					recipeTextFile.setText(chooser.getSelectedFile().getAbsolutePath());
				}
			}
		});
		
		// add recipe
		btnAdd.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				recipeNumber++;
				Recipe.recipes.add(new Recipe(recipeName.getText(), Integer.parseInt(serves.getText()),
						Double.parseDouble(cookingTime.getText()), course.getText(), cuisine.getText(),
						picOfDish.getText(), recipeTextFile.getText()));
				frame.dispose();
				MainActivityRecipes.btnRecipe5.setText(Recipe.recipes.get(4).name);
				MainActivityRecipes.lblRecipePicture5.setIcon(new ImageIcon(Recipe.recipes.get(4).pictureResourcePath));
			}
		});
	}
}