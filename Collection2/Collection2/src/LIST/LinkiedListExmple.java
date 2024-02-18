package LIST;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkiedListExmple {

	public static void main(String[] args)
	{
		LinkedList<Object> lst = new LinkedList<>();
		
		lst.add("Amani");
		lst.add("Prabhjot");
		lst.add("Nidhi");
		lst.add("Vandana");
		lst.add("Poonam");
		//Size of the LinkedList object.
		System.out.println(lst.size());
		//Print the LinkedList object.
		for(Object LnlSt:lst)
		{
			System.out.println(LnlSt);
		}
		//Print the LinkedList elements using iterator.
		ListIterator<Object> itr1 = lst.listIterator();
		System.out.println("---------------------FORWARD----------------------");
		while(itr1.hasNext())
		{
		
			System.out.println(itr1.next());
		}
		System.out.println("---------------------backward----------------------");
		while(itr1.hasPrevious())
		{
			System.out.println(itr1.previous());
		}
		//Add an object at the specific position.
		lst.add(1,"vISHNU");
		System.out.println(lst);
		//Remove a element from a specific position
		lst.remove(1);
		System.out.println(lst);
		//Remove last element.
		lst.removeLast();
		System.out.println(lst);
		LinkedList<Object> lst2 = new LinkedList<>();
		
		lst2.add("A");  
		lst2.add("B");  
		lst2.add("C");  
		System.out.println(lst2);
		

	}

}
