package whoIsNext;

public interface Queue {
	boolean isEmpty( ); //returns true if nothing in the queue
	void enqueue(Object obj ); //places object obj at the back of the queue
	Object dequeue( ); //removes and returns object at front of the list
	Object peekFront( ); //returns object at the front of the list
}
