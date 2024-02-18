package SET;

import java.util.*;
import java.util.TreeSet;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;

public class Hst {

	public static void main(String[] args) 
	{
		TreeSet<String> Hst = new TreeSet<>();
  


		Hst.add("Roxy");
		Hst.add("Sunil");
		Hst.add("Sandy");
		Hst.add("Munish");
		Hst.add("Pardeep");
	
		 System.out.println(Hst.descendingSet()+"Desending");	
	
    HashSet<String> Hst2 = new HashSet<>();       
    Hst2.add("A");  
    Hst2.add("B");  
    Hst2.add("C");  
    Hst2.add("D");  
     
  Hst.addAll(Hst2);
    System.out.println(Hst);
     //Retriving data by For each
    Hst.forEach(p->System.out.println(p));
 
     System.out.println("---------------------------------------------------");
     
     //Removal
     Hst.remove("A");
    
    
 System.out.println(Hst);
 
 System.out.println(Hst2.removeIf(s->s.contains("D")));
         Hst.removeAll(Hst2);
         System.out.println(Hst);
         Hst.clear();
         System.out.println(Hst); 
	}

}
