package LIST;
import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArraytoListExample
{

	public static void main(String[] args)
	{
		// Creating Array
		String[]Arr= {"Java","SQL","PHP","C++","Phyton",};
		System.out.println(Arr);   //[Ljava.lang.String;@515f550a
		
		//Converting ARAAY TO LIST VArrays.toString(array)
		System.out.println("Printing  Array "+Arrays.toString(Arr));  
		
		List<Object> list = new ArrayList<>();
		//Here we are adding the array to list
		for(Object lang :Arr)
		{
			list.add(lang);
			
		}
		
		System.out.println("Printing  List"+list);
	}

}
