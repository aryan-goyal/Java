package brighterDemo;
import java.awt.Color;
public class BrighterDemo 
{
	public static void main(String[] Args)
	{
		Color newColor = new Color (50, 100, 150);
		newColor = newColor.brighter();
		System.out.print(newColor);
	}
}
