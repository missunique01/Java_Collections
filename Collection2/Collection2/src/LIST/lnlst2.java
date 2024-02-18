package LIST;

import java.util.Iterator;
import java.util.LinkedList;

public class lnlst2 {

	public static void main(String[] args) 
	{
		LinkedList<String> ll=new LinkedList<>();  
		  ll.add("A");  
          ll.add("B");  
          ll.add("C");  
          ll.add("D");  
          ll.add("E");  
          ll.add("F");  
          ll.add("G");  
          ll.add("E");  
          ll.add("F");  
          ll.add("H");  
          System.out.println(ll);

          //Removing specific element from arraylist  
           ll.remove("F");
           System.out.println(ll);
         //Removing element on the basis of specific position  
           ll.remove(4);
           System.out.println(ll);
           
           LinkedList<String> ll2=new LinkedList<>();  
 		  ll2.add("A");  
           ll2.add("Z");  
       //    Adding new elements to Linkedlist  
           ll.addAll(ll2);
           System.out.println(ll);
           System.out.println(ll2);
       //    Adding new elements to arraylist  
           ll.removeAll(ll2);
           System.out.println(ll);
           System.out.println(ll2);
           //Removing first element from the list 
           ll.removeFirst();
           ll.removeFirstOccurrence("C");
           System.out.println(ll);
           //Removing last  element from the list 
           ll.removeLast();
           ll.removeLastOccurrence("F");
           System.out.println(ll);
            
           //Removing all the elements available in the list    
        //   ll.clear();
          // System.out.println(ll);
           
           //Reversing the List
           Iterator<String> it2 = ll.descendingIterator();
           while(it2.hasNext())
           {
        	   System.out.println(it2.next());
           }
	} 

}
