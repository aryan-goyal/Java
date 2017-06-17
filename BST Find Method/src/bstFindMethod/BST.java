package bstFindMethod;

public class BST {
	public BST(int i) // constructor: Root node added at the time of creation of
						// the tree
	{
		rootNode = new BstNode(i);
	}

	public void addNode(int i) {
		BstNode currentNode = rootNode;
		boolean finished = false;
		do {
			BstNode curLeftNode = currentNode.leftNode;
			BstNode curRightNode = currentNode.rightNode;
			int curIntData = currentNode.intData;
			if (i > curIntData) // look down the right branch
			{
				if (curRightNode == null) { // create a new node referenced with
											// currentNode.rightNode
					currentNode.rightNode = new BstNode(i);
					finished = true;
				} else // keep looking by assigning a new current node one level
						// down
				{
					currentNode = currentNode.rightNode;
				}
			} else // look down the left branch
			{
				if (curLeftNode == null) { // create a new node referenced with
											// currentNode.leftNode
					currentNode.leftNode = new BstNode(i);
					finished = true;
				} else { // keep looking by assigning a new current node one
							// level down

					currentNode = currentNode.leftNode;
				}
			}
		} while (!finished);
	}

	public boolean find(int i) {
		if (i == rootNode.intData) {
			System.out.println("Bob");
			return true; // since the data is in the array, print true
		} else {
			if (i > rootNode.intData && rootNode.rightNode != null) {
				System.out.println("Bob");
				rootNode = rootNode.rightNode; // make rootNode the rightNode
				return find(i);// run through recursion to again check left or
				// right
			} else if (i < rootNode.intData && rootNode.leftNode != null) {
				System.out.println("Bob");
				rootNode = rootNode.leftNode; // make rootNode the leftNode
				return find(i);// run through recursion to again check left or
				// right
			}
			return false;// if the number is not in the array, then return false
		}
	}

	BstNode rootNode;
}