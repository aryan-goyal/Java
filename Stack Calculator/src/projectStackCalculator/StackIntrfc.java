package projectStackCalculator;

public interface StackIntrfc {
	void push(double d); //place d on top of the stack
	double pop(); //return top item in the stack and then remove from the stack
	double peek(); //return the top item in the stack and leave the stack intact
	int size(); //return the size (depth) of the stack
	void clear(); //remove all of the items from the stack
}
