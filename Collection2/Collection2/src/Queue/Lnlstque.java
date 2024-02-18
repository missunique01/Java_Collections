package Queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
public class Lnlstque
{

	public static void main(String[] args) 
	{
		ArrayDeque<String> lst = new ArrayDeque<>();
		//LinkedList<String> lst = new LinkedList<>();

		
		 
		//Add objects to the HashSet.
		lst.add("Amani");
		lst.add("Prabhjot");
		lst.add("Nidhi");
		lst.add("Vandana");
		lst.add("Poonam");
		
		System.out.println(lst);
		//addition
		lst.offer("Prabhjot");
		lst.offerFirst("roy");
		lst.offerLast(null);
		
		lst.offerLast("fox");
		lst.addFirst("1st");
		lst.addLast("Last");
		System.out.println(lst);
		
		lst.poll();
		lst.pollFirst();
		lst.pollLast();
		lst.peekFirst();
		lst.peekLast();
		lst.poll();
		System.out.println(lst);
		
		//retrival
		System.out.println(lst.getFirst());
		System.out.println(lst.getLast());
	
		
	
	}

}
