package projectStackCalculator;

import java.util.LinkedList;

public class StackLL implements StackIntrfc {
	//LinkedList as the basis of the stack
	LinkedList<Double> calculator = new LinkedList<Double>();
	//add items to the stack
	public void push(double d) {
		calculator.addFirst(d);
	}
	//remove items from stack
	public double pop() {
		double l = calculator.getFirst();
		calculator.removeFirst();
		return l;
	}
	//view the firt item in stack without removing it
	public double peek() {
		
		return calculator.getFirst();
	}
	//view size of stack
	public int size() {
		
		return calculator.size();
	}
	//clear stack
	public void clear() {
		calculator.clear();
	}
}
