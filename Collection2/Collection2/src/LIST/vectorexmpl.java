package LIST;

import java.util.Vector;
import java.util.LinkedList;
import java.util.List;

public class vectorexmpl
{

	public static void main(String[] args) 
	{
		Vector<Object> vc = new Vector<>();
		LinkedList<String> ll=new LinkedList<>();  
		vc.add("A");  
		vc.add("B");  
		vc.add("C");  
		vc.add("D");  
		vc.add("E");  
		vc.add("F");  
		vc.add("G");  
		vc.add("E");  
		vc.add("F");  
		vc.add("H");  
		vc.add("Banana");
		vc.add("Apple");
		vc.add("mango");
		vc.add("Pinaple");

        System.out.println(vc.size());
       
        System.out.println(vc.capacity());
        vc.set(5, "Rohit4");
        System.out.println(vc.size());
        System.out.println(vc);
	}

}
