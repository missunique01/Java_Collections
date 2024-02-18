package LIST;

import java.util.*;

public class ListIteratorExample {

	public static void main(String[] args) 
	{
		List<Object> li = new ArrayList<>();
		li.add("Amit");    
		li.add("Vijay");    
		li.add("Kumar");    
		li.add(1,"Sachin");  
		System.out.println(li.size());
		
		ListIterator<Object> itr = li.listIterator();
         System.out.println("Printitng on Forward direction");
         while(itr.hasNext())
         {
        	 System.out.println("Index:- "+itr.nextIndex()+"  Value= "+itr.next());
         }
         System.out.println("Printitng on Backward direction");
         while(itr.hasPrevious())
         {
        	 System.out.println("Index:- "+itr.previousIndex()+"  Value= "+itr.previous());
         }
	}

}
