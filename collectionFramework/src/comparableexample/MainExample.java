package comparableexample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainExample {

	public static void main(String[] args) 
	{
		Emplyoee e1=new Emplyoee();
		
		e1.setId(1);
		e1.setAge(44);
		e1.setName("arti");
		
       Emplyoee e2=new Emplyoee();
		
		e2.setId(7);
		e2.setAge(20);
		e2.setName("snehal");
		
      Emplyoee e3=new Emplyoee();
		
		e3.setId(4);
		e3.setAge(44);
		e3.setName("komal");
		
      Emplyoee e4=new Emplyoee();
		
		e4.setId(2);
		e4.setAge(15);
		e4.setName("vrushali");
		
      Emplyoee e5=new Emplyoee();
		
		e5.setId(3);
		e5.setAge(26);
		e5.setName("motu");
		
		List list=new ArrayList();
		list.add(e1);
		list.add(e2);
		list.add(e3);
		list.add(e4);
		list.add(e5);
		
		list.forEach(System.out::println);
		
		Collections.sort(list);
		
		System.out.println("After Sorting");
		
		list.forEach(System.out::println);
	}

}
