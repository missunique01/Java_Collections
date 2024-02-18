package LIST;

import java.util.List;  
import java.util.ArrayList; 
public class ArrayList1{

	public static void main(String[] args) 
	{
		List<Object> list = new ArrayList<>();
		list.add("Mango");
		list.add("Apple");
		list.add("Ornge");
		list.add("Pineapple");
		System.out.println(list);
		//ITERATING the LIST
		
		for( Object fruit:list)
		{
			System.out.println(fruit);
		}
		

	}

}
