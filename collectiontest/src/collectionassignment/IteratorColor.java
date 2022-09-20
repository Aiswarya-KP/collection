package collectionassignment;

import java.util.*;

public class IteratorColor 
{
public static void main(String args[])
{
	ArrayList<String> list=new ArrayList<String>();
	list.add("Black");
	list.add("White");
	list.add("Purple");
	list.add("Red");
	list.add("Yellow");
	
	Iterator<String> itr=list.iterator();
	while(itr.hasNext())
	System.out.println(itr.next());
	
		
}
}
