package reverseSubstring;

public class Sentence {
	private String text;
	private char[] reverse;
	/**
	 * Creates a Sentence object.
	 * 
	 * @param aText
	 *            the text of this sentence.
	 */
	public Sentence(String aText) {
		text = aText;
		reverse = text.toCharArray();
	}

	/**
	 * Reverses this sentence.
	 */
	public void reverse() {
		reverse(0, text.length() - 1);
	}

	/**
	 * Helper method to reverse a part of the sentence.
	 * 
	 * @param start
	 *            the first index to include in the reversal
	 * @param end
	 *            the last index to include in the reversal
	 * @return 
	 */
	void reverse(int start, int end) {
		if(start >= end)
		{
			return;
		}
		else
		{
			char initial = reverse[start];
			reverse[start] = reverse[end];
			reverse[end] = initial;
			start++;
			end--;
			reverse(start, end);
		}
	}

	/**
	 * Gets the sentence text.
	 * 
	 * @return the sentence text
	 */
	public char[] getText() {
		return reverse;
	}
}
