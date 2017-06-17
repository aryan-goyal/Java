package linkedList;
import java.util.*;
public class Linked {

	public static void main(String[] args)
	{
		//create a linked list and populate it
		LinkedList<String> staff = new LinkedList<>();
		staff.addFirst("Tom");
		staff.addFirst("Romeo");
		staff.addFirst("Harry");
		staff.addFirst("Dick");
		
		//print original list
		System.out.println("Original:");
		System.out.println(staff);
		//reverse
		reverse(staff);
		//print final list
		System.out.println("Reversed:");
		System.out.println(staff);
	}
	
	public static void reverse(LinkedList<String> staff)
	{
		//code to simply reverse the order of the list
		LinkedList<String> reverse = new LinkedList<>();
		int len = staff.size();
		for(int x =0;x < len;x++)
		{
			reverse.addLast(staff.getLast());
			staff.removeLast();
		}
		staff.addAll(reverse);
	}
}