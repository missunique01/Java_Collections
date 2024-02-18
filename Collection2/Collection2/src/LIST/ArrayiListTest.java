package LIST;
import java.util.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayiListTest {

	public static void main(String[] args)
	{
		List<Object> al = new ArrayList<>();
		al.add("Amani");
		al.add("Prabhjot");
		al.add("Nidhi");
		al.add("Vandana");
		al.add("Poonam");
		//Size of the ArrayList object.
		System.out.println(al.size());  
		
		
		//Print the ArrayList object
		System.out.println(al);
		//Print the ArrayList elements using iterator.
		Iterator<Object> Itre1 = al.iterator();
		while(Itre1.hasNext())
		{
			System.out.println(Itre1.next());
		}
		//Add an object at the specific position
		al.add(3, "Rohit");
		al.set(2, "Jagu");
		System.out.println(al);
		//Remove a element from a specific position.
		al.remove(0);
		//Size of the ArrayList object
		System.out.println(al.size());   
		//Print the ArrayList object.
		System.out.println(al);
		//Print the ArrayList elements using iterator.
       ListIterator<Object> itr2 = al.listIterator();
       while (itr2.hasPrevious())
       {
    	   System.out.println(itr2.previous());
       }
    	   
       ArrayList<Object> al2 = new ArrayList<>();
       al2.add(1);
       al2.add(2);
       al2.add(3);
       al2.add("A");
       al2.add("5");
       System.out.println(al2);
       
       System.out.println("Traversing list using forEach() method:");
       al2.forEach(a->
       {
    	   System.out.println(a);
       });
       System.out.println("Traversing list using forEach() Loop:");
       for( Object print:al2)
       {
    	   System.out.println(print);
    	   
       }
       
	}

}
