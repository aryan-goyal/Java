package findSubstring;

public class Sentence {
	public static String text;
	public static boolean b = false;

	public Sentence(String aText) {
		text = aText;
	}

	public static boolean find(String f) {
		String t = text;
		// control to stop iteration if the word if found
		if (b == false && 0 < t.length()) {
			if (t.contains(f))// checks to see if it contains the characters
				b = true;
			else {
				t = t.substring(1);
				find(f); // recursion implemented
			}
		}
		return b;
	}
}
