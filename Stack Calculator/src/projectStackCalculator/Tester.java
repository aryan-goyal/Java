package projectStackCalculator;

import java.util.Scanner;

public class Tester {
	public static void main(String Args[]) {
		Scanner sc = new Scanner(System.in);

		StackLL calc = new StackLL();

		// doubles used during subtraction and division
		double last;
		double beforeLast;

		System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit: ");
		String ans = sc.next();
		while (!ans.equalsIgnoreCase("Q")) {
			//add the next doubles into the stack
			if (!ans.equals("+") && !ans.equals("-") && !ans.equals("*") && !ans.equals("/")) {
				calc.push(Double.parseDouble(ans));
			}
			//add the previous numbers by popping both and pushing the sum
			if (ans.equals("+")) {
				calc.push(calc.pop() + calc.pop());
			//Subtract the previous two number by pop and push the difference 
			} else if (ans.equals("-")) {
				last = calc.pop();
				beforeLast = calc.pop();
				calc.push(beforeLast - last);
			//Multiply last two popped numbers and push the product
			} else if (ans.equals("*")) {
				calc.push(calc.pop() * calc.pop());
			//Divide last two numbers and push the quotient 
			} else if (ans.equals("/")) {
				last = calc.pop();
				beforeLast = calc.pop();
				calc.push(beforeLast / last);
			}
			System.out.print("Enter number, math operation(+,-,*, or /), or Q to quit: ");
			ans = sc.next();
		}
		sc.close();
		System.out.println("The answer is " + calc.pop());
	}
}