package bigJavaP16dot19;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
A program for demonstrating the enhanced printing of the 
BinarySearchTree.
*/

public class Main {
	public static void main(String[] Args) throws FileNotFoundException {
		Scanner in = new Scanner(new File("D:\\Computer Science\\Blue Pelican Java Resource\\DataFiles\\BST.txt"));
		BinarySearchTree tree = new BinarySearchTree();
		while (in.hasNextLine())
			tree.add(in.nextLine());
		tree.print();
	}
}