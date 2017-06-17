package appMain;

import java.util.ArrayList;
import javax.swing.ImageIcon;
import java.io.*;

public class Recipe {
	public Recipe(String nm, int ser, double cookTime, String cour, String cous, String picResource,
			String textResrouce) {
		name = nm;
		serves = ser;
		cookingTime = cookTime;
		course = cour;
		cuisine = cous;
		pictureResourcePath = picResource;
		textFileRecipeResource = textResrouce;
	}

	// display recipe in the internal Frame when the viewRecipe buttons are
	// clicked
	public void displayRecipe() {
		MainActivityRecipes.lblRecipeName.setText(name);
		MainActivityRecipes.lblCookTime.setText("Cook Time: " + cookingTime);
		MainActivityRecipes.lblServes.setText("Serves: " + serves);
		MainActivityRecipes.lblCourse.setText("Course: " + course);
		MainActivityRecipes.lblCuisine.setText("Cuisine: " + cuisine);
		MainActivityRecipes.lblPicture.setIcon(new ImageIcon(Recipe.class.getResource(pictureResourcePath)));
		MainActivityRecipes.internalFrameDiplayRecipe.setVisible(true);
		MainActivityRecipes.btnBack.setEnabled(true);
		MainActivityRecipes.btnForward.setEnabled(false);
		MainActivityRecipes.textAreaIngredientsDirections.setText(null);

		// read from file and add recipe to textArea
		String nextLine = null;
		try {
			// FileReader and BufferReader to read recipe files
			FileReader fR = new FileReader(new File(textFileRecipeResource));
			BufferedReader bR = new BufferedReader(fR);
			while ((nextLine = bR.readLine()) != null) {
				MainActivityRecipes.textAreaIngredientsDirections
						.setText(MainActivityRecipes.textAreaIngredientsDirections.getText() + "\n" + nextLine);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file.");
		} catch (IOException e) {
			System.out.println("Cannot read file.");
		}
	}

	//correct path for picture and txt file when new recipe is added
	public void displayNewRecipe(){
		MainActivityRecipes.lblRecipeName.setText(name);
		MainActivityRecipes.lblCookTime.setText("Cook Time: " + cookingTime);
		MainActivityRecipes.lblServes.setText("Serves: " + serves);
		MainActivityRecipes.lblCourse.setText("Course: " + course);
		MainActivityRecipes.lblCuisine.setText("Cuisine: " + cuisine);
		MainActivityRecipes.lblPicture.setIcon(new ImageIcon(pictureResourcePath));
		MainActivityRecipes.internalFrameDiplayRecipe.setVisible(true);
		MainActivityRecipes.btnBack.setEnabled(true);
		MainActivityRecipes.btnForward.setEnabled(false);
		MainActivityRecipes.textAreaIngredientsDirections.setText(null);

		// read from file and add recipe to textArea
		String nextLine = null;
		try {
			// FileReader and BufferReader to read recipe files
			FileReader fR = new FileReader(new File(textFileRecipeResource));
			BufferedReader bR = new BufferedReader(fR);
			while ((nextLine = bR.readLine()) != null) {
				MainActivityRecipes.textAreaIngredientsDirections
						.setText(MainActivityRecipes.textAreaIngredientsDirections.getText() + "\n" + nextLine);
			}
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file.");
		} catch (IOException e) {
			System.out.println("Cannot read file.");
		}
	}
	
	public static ArrayList<Recipe> recipes = new ArrayList<Recipe>();
	public String name;
	public int serves;
	public double cookingTime;
	public String course;
	public String cuisine;
	public String pictureResourcePath;
	public String textFileRecipeResource;
}