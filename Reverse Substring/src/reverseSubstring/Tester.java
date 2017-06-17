package reverseSubstring;
import java.util.*;
public class Tester {
	public static void main(String[] args)
	   {
	      Sentence greeting = new Sentence("Hello!");
	      greeting.reverse(0,5);
	      System.out.println(greeting.getText());
	      System.out.println("Expected: !olleH");
	   }
}
