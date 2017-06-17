package findSubstring;

public class Tester {
	public static void main(String[] args) {
		Sentence s = new Sentence("Mississippi!");
		Boolean c = s.find("sip");
		System.out.println(c);
		System.out.println("Expected: true");
	}
}
