package listexamples;

import java.util.Vector;

public class Vectorexample {

	public static void main(String[] args) 
	{
		Vector v=new Vector();
		v.add(1);
		v.add(2);
		v.add(2);

		v.add(2);

		v.add(2);

		v.add(2);

		v.add(0);
		v.add(0);		
		v.add(2);
		v.add(2);
		v.add(2);

		
		for(Object o:v)
		{
			Integer i=(Integer)o;
			System.out.println(i);
		}
		
		System.out.println("capaciry "+v.capacity());
    }

}
