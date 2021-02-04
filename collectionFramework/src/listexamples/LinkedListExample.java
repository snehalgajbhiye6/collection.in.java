package listexamples;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) 
	{
		LinkedList ll=new LinkedList();
		
		ll.add(12);
		ll.add(0);
		ll.add("a");
		ll.add("a");
		ll.addFirst(21);
		ll.add(11.3);
		ll.add("p");
		ll.addLast(39);
		
		System.out.println(ll);
		
		for (Object object : ll)
		{
		    String s=object.toString();
			System.out.println(s);
		}
		System.out.println(" ");
		System.out.println(ll.contains(0));
		System.out.println(" ");
		System.out.println(ll.size());
		System.out.println(" ");
		System.out.println("Last Element "+ll.getLast());
		
		ll.remove(3);
		System.out.println(ll);
	
		/*
		ArrayList a=new ArrayList();
		a.add(ll);
		System.out.println(a);*/
    }    

}
