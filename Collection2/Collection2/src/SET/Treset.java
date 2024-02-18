package SET;

import java.util.TreeSet;

public class Treset 
{

	public static void main(String[] args)
	{
		TreeSet<Integer> set = new TreeSet<>();  
		 set.add(35); 
         set.add(10);  
         set.add(9);  
         set.add(30);  
         set.add(43);  
     //    System.out.println("Lowest Value: "+set.pollFirst());  
      //   System.out.println("Highest Value: "+set.pollLast());  
         System.out.println( set.first());

	}

}
