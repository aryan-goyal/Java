package bigJavaP16dot21;

/**
 * A node of a tree stores a data item and references to the child nodes to the
 * left and to the right.
 */
public class Node {
	public Comparable data;
	public Node left;
	public Node right;

	/**
	 * Inserts a new node as a descendant of this node.
	 * 
	 * @param newNode
	 *            the node to insert
	 */
	public void addNode(Node newNode) {
		int comp = newNode.data.compareTo(data);
		if (comp < 0) {
			if (left == null)
				left = newNode;
			else
				left.addNode(newNode);
		}
		if (comp > 0) {
			if (right == null)
				right = newNode;
			else
				right.addNode(newNode);
		}
	}

	/**
	 * Prints this node and all of its descendants in sorted order.
	 */
	public void printNodes(int state) {// see which state the counter in on
		for (int x = 0; x < state; x++) {
			System.out.printf("     ");//print space for the state the counter is in
		}
		System.out.printf("+---%s\n", data); //print data along with appropriate formatting
		if (left != null) { //recursion for left node
			left.printNodes(state + 1);
		}
		if (right != null) { //recursion for right node
			right.printNodes(state + 1);
		}
	}
}