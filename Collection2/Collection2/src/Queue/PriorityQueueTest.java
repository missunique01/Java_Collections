package Queue;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Deque;
public class PriorityQueueTest 
{

	public static void main(String[] args) 
	{
		//Queue<Object> pq = new PriorityQueue<>();
		Deque<String> pq = new ArrayDeque<>();
		//Add objects to the PriorityQueue .
		pq.offer("p7");
		pq.add("P1");
		pq.add("P2");
		pq.add("P3");
		pq.offer("p6");
		
		pq.push("xxxxx");
		System.out.println(pq);
	/*	//Print the PriorityQueue object.
		for(Object qu:pq)
		{
			System.out.println(qu);
		}
		System.out.println(pq);
		//Print the PriorityQueue elements using iterator.
		Iterator<String> it1 = pq.iterator();
		while(it1.hasNext())
		{
			System.out.println(it1.next());
		}
		
		
		//Print the head element of the PriorityQueue
		System.out.println(pq.peek());
		System.out.println(pq.element());
		System.out.println("-----------------------------------------------------");
		
		//Remove the head element of the PriorityQueue 
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq);
		
		//Print the PriorityQueue object.
		
		//Print the PriorityQueue elements using iterator.
*/
	}

}
