package setexamples;

public class CompareToExample {

	public static void main(String[] args)
	{
		String s1="abc";
		String s2="abc";
		String s3="pqr";
		System.out.println(s1.compareTo(s2));//0
		
		System.out.println(s1.compareTo(s3));//negative
	}

}
