package collectionassignment;
import java.util.*;
public class SearchColor 
{
	public static void main(String args[])
	{
		List<String> list=new ArrayList<String>();
		list.add("Black");
		list.add("White");
		list.add("Purple");
		list.add("Red");
		list.add("Yellow");
		
		if (list.contains("White"))
		{
			System.out.println("found the searching element");
		}
		else
		{
			System.out.println("there is no element");
		}
	}

}
