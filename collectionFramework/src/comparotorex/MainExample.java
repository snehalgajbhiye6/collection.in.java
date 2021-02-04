package comparotorex;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainExample {

	public static void main(String[] args) 
	{
		Student t1=new Student();
		t1.setId(3);
		t1.setAge(20);
		t1.setName("e");
		

		Student t2=new Student();
		t2.setId(10);
		t2.setAge(50);
		t2.setName("b");

		Student t3=new Student();
		t3.setId(5);
		t3.setAge(37);
		t3.setName("w");
		
		List list=new ArrayList();
		list.add(t1);
		list.add(t2);
		list.add(t3);
		list.forEach(System.out::println);
		
        System.out.println("  ");

		System.out.println("After age sorting");
		Collections.sort(list, new AgeCompare());
		list.forEach(System.out::println);
        System.out.println("  ");
        
		System.out.println("After name sorting");
		Collections.sort(list,new Namecompare());
		list.forEach(System.out::println);
        System.out.println("  ");

		System.out.println("After id sorting");
		Collections.sort(list,new Idcompare());
		list.forEach(System.out::println);
    }

}
