package listexamples;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args)
	{
		ArrayList a=new ArrayList();
		
		a.add(0);
		a.add(1, 2);
		a.addAll(a);
		a.clone();
		a.contains(0);
		a.containsAll(a);
		a.ensureCapacity(0);
		a.equals(2);
		a.get(1);
		a.hashCode();
		a.getClass();
	
		a.isEmpty();
	
		a.parallelStream();
		a.toString();
		a.trimToSize();
		a.stream();
		a.spliterator();
		a.size();
		
		for (Object object : a) {
			Integer i=(Integer)object;
			System.out.println(i);
		}
	
		
	}

}
