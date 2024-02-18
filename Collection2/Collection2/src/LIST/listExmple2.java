package LIST;
import java.util.List;
import java.util.ArrayList;

public class listExmple2 {

	public static void main(String[] args)
	{
		List<String> l1 = new ArrayList<>();
		
		l1.add("Mango");
		l1.add("Apple");
		l1.add("Ornge");
		l1.add("Pineapple");
	//Accessing the elements from list
		System.out.println(l1.get(0));
		System.out.println(l1.get(3));
	    l1.set(3, "Grapes");
	     System.out.println(l1.get(3));
	}

}
