package LIST;
import java.util.*;
public class Sorting 
{

	public static void main(String[] args) 
	{
		 List<String> l1=new ArrayList<>();  
		 l1.add("Bat");
		 l1.add("xerox");
		 l1.add("e");
		 l1.add("Family");
		 l1.add("i");
		 l1.add("Temperature");
		 l1.add("f");
	
		 System.out.println(l1);   //maintains Insertion Order output
		 
		 Collections.sort(l1);
		 for(String sort1:l1)
		 {
			 System.out.println(sort1);
		 }
		 //Sorting the Integers 
		 
	List<Integer> l2 = new ArrayList<>();
		 
	l2.add(1);
	l2.add(9);
	l2.add(21);  
	l2.add(11);  
	l2.add(51);  
	l2.add(146);  
		 
	System.out.println(l2);
	Collections.sort(l2);
	
	 for(Integer sort2:l2)
	 {
		 System.out.println(sort2);
	 }
	}

}
