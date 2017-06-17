package bigJava;

import java.util.*;

public class ListTester {
	public static void main(String[] args) {
		LinkedList names = new LinkedList();
		
		names.addFirst("Tom");
		names.addFirst("Romeo");
		names.addFirst("Harry");
		names.addFirst("Dick");

		System.out.println(names.size());
		System.out.println("Expected: 4");
	}
}