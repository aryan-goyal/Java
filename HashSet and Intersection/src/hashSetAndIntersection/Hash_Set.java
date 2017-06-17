package hashSetAndIntersection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Hash_Set {
	public static void main(String Args[])
	{
		//first set
		Set s1 = new HashSet( ); //Create s1
		s1.add("Bill");
		s1.add("Larry");
		s1.add("Adolph");
		s1.add("Regina");
		s1.add("Susie");
		
		//second set
		Set s2 = new HashSet( ); //Create s2
		s2.add("Larry");
		s2.add("Jack");
		s2.add("Alice");
		s2.add("June");
		s2.add("Benny");
		s2.add("Susie");
				
		//build intersection set and check for intersection
		s1.retainAll(s2);
		
		//Print the intersection set
		Iterator iter1 = s1.iterator();
		while(iter1.hasNext())
		{
			System.out.println(iter1.next());
		}
	}
}