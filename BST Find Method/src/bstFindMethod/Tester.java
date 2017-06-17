package bstFindMethod;

public class Tester {
	public static void main(String args[]) {
		// the first integer in the tree is used to create the object
		BST bstObj = new BST(50);
		bstObj.addNode(56);
		bstObj.addNode(52);
		bstObj.addNode(25);
		bstObj.addNode(74);
		bstObj.addNode(54);

		// testing the find method
		System.out.println(bstObj.find(74)); // This is one it will find…prints
												// a true
		System.out.println(bstObj.find(13)); // This is one it won't find…prints
												// a false
	}
}