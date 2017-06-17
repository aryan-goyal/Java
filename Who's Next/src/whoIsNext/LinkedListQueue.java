package whoIsNext;

import java.util.*; //necessary for LinkedList class

public class LinkedListQueue implements Queue {
	public LinkedListQueue() // constructor
	{
		lst = new LinkedList();
	}

	public void enqueue(Object obj) {
		lst.addLast(obj);
	}

	public Object dequeue() {
		return lst.removeFirst();
	}

	public Object peekFront() {
		return lst.getFirst();
	}

	public boolean isEmpty() {
		return lst.isEmpty();
	}

	private LinkedList lst; // state variable
}
