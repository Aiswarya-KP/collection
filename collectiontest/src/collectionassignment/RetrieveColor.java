package collectionassignment;

import java.util.ArrayList;
import java.util.List;

public class RetrieveColor 
{
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Purple");
		list.add("Red");
		list.add("Yellow");
		System.out.println(list);
		
		String element=list.get(0);
		System.out.println("first element: "+element);
		 element=list.get(1);
		 System.out.println("second element: "+element); 
		 element=list.get(3);
		 System.out.println("third element: "+element); 
		
		
}
}