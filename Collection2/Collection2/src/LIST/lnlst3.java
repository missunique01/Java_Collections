package LIST;
import java.util.Iterator;
import java.util.LinkedList;
public class lnlst3
{

	public static void main(String[] args) 
	{
		 LinkedList<String> fruits = new LinkedList<>();
		 
		 fruits.add("Banana");
	     fruits.add("Apple");
	     fruits.add("mango");
	     fruits.add("Pinaple");
	     
	  // Getting the first element in the LinkedList using getFirst()
	    
	     System.out.println(fruits.getFirst());
	   // Getting the last element in the LinkedList using getFirst()

	     System.out.println(fruits.getLast());
	
	     fruits.set(2, "ORANGE");
	     System.out.println(fruits);
	    

	}

}
