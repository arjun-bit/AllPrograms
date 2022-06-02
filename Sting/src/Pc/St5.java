// index of string

package Pc;

public class St5 {

	public static void main(String[]args)
	{
		String a = "We all are living in fake world";
		
		int c = a.length();
		System.out.println(c);
		
		int b = a.indexOf('d');// to find index of char
		System.out.println(b);
		
		
		b = a.lastIndexOf('i');// to find last index of char
		System.out.println(b);
		
		
		b = a.indexOf("fake");
		System.out.println(b);
		
		
		b = a.lastIndexOf("in");
		System.out.println(b);
		
		b = a.indexOf('z');// it give output as -1 because it is not present in system
		System.out.println(b);
		
	}
}

