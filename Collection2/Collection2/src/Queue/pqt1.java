package Queue;

import java.util.PriorityQueue;
import java.util.TreeSet;
public class pqt1
{

	public static void main(String[] args) 
	{
		TreeSet<String> eu = new TreeSet<>();
		eu.add("A");  
		eu.add("B");  
		eu.add("C");  
		eu.add("D");  
		eu.add("E");  
		
		eu.forEach(e->
				{
			          System.out.println(e);
		           });
		PriorityQueue<String> al = new PriorityQueue<>();
		
		al.add("Amit");  
		al.add("Vijay");  
		al.add("Karan");  
		al.add("Jai");  
		al.add("Rahul"); 
		al.addAll(eu);
		System.out.println(al);
		//eu.remove("E");
		//System.out.println(eu.removeIf(str -> str.contains("E")));
		al.removeAll(eu);
		System.out.println(al);
		System.out.println(eu);
		
		System.out.println(eu.contains("E"));
		
		
		
	}

}
