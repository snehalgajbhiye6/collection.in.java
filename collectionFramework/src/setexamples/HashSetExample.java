package setexamples;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) 
	{
		HashSet h=new HashSet();
		h.add("A");
		h.add("A");
		h.add(null);
		h.add(null);
		h.add("Snehal");
		
		System.out.println(h);
		
		for(Object o:h)
		{
			String s=(String)o;
			System.out.println(s);
		}
		System.out.println(" ");
		System.out.println(h.size());
		System.out.println(" ");
		
		HashSet  aa=new HashSet();
		aa.add("avc");
		aa.add(new String("avc"));
		System.out.println(aa);
	}

}
