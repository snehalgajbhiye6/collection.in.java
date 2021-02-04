package setexamples;

import java.util.TreeSet;

public class Treesetexample {

	public static void main(String[] args)
	{
		TreeSet t=new TreeSet();
		t.add(1);
		t.add(2);
		t.add(3);
		t.add(4);
		t.add(5);
		t.add(6);
		t.add(3);
		System.out.println(t);
		for(Object obj:t)
		{
			Integer i=(Integer)obj;
			System.out.println(i);
		}
		System.out.println("+++++++++++++++++++++++");
		System.out.println("Size "+t.size());//size
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Tail "+t.tailSet(2));     //from 2 to onward
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Head "+t.headSet(4));     //upper of 4
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Subset "+t.subSet(3, 6));//3 4 5 but not 6
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Ceiling "+t.ceiling(7));
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Contain "+t.contains(5));//check content;
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		System.out.println("First element "+t.first());
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Floor "+t.floor(2));
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Highest "+t.higher(6));
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Last Element "+t.last());
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Lower "+t.lower(4));      //3
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("poll first "+t.pollFirst());//remove first element
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Poll Last "+t.pollLast());//remove last element
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		System.out.println("Remove "+t.remove(4));    //true
		System.out.println(t);
		System.out.println("+++++++++++++++++++++++");
		
		
	}

}
