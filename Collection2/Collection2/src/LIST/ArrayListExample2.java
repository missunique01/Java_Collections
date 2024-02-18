package LIST;
import java.util.*;
public class ArrayListExample2 {

	public static void main(String[] args)
	{
		ArrayList<String> al=new ArrayList<>();  
		al.add("a");
		al.add("b");
		al.add("c");
		al.add(1, "abc");
		System.out.println(al);
		al.set(2, "g");
		System.out.println(al);
		ArrayList<String> al2=new ArrayList<>(); 
		al2.add("XXX");
		al2.add("YYY");
		System.out.println(al2);
		al2.addAll(al);
		System.out.println(al2);
		System.out.println(al2.get(5));
		al2.removeAll(al);
		System.out.println(al2);
		System.out.println(al);
		System.out.println(al.remove(1));
		System.out.println(al);
		System.out.println(al.remove("g"));
		//al.removeIf(re->re.contains(c));
		System.out.println(al.removeIf(re->re.contains("c")));
		System.out.println(al);
		System.out.println(al.isEmpty());
		al.clear();
	
		System.out.println(al);
		System.out.println(al.isEmpty());
		
		
		
		ArrayList<String> ap=new ArrayList<String>();  
		  ap.add("Ravi");  
		  ap.add("Vijay");  
		  al.add("Ajay");  
		  ArrayList<String> ap2=new ArrayList<String>();  
		  ap2.add("Ravi");  
		  ap2.add("Hanumat");  
		  System.out.println(ap2); 
		  al.retainAll(al2);  
		  
		  System.out.println("iterating the elements after retaining the elements of al2");  
		  Iterator<String> ita=ap.iterator();  
		  while(ita.hasNext()){  
		   System.out.println(ita.next());  
		  }  

	}

}
