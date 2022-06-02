//Methods of String 

package Pc;

public class St4 {

	public static void main(String[]args)
	{
		String a = "Velocity";

		//	or (both mean the same because String is a class)	
		
		String b = new String("Velocity");
		
		System.out.println(a);
		System.out.println(b);
		
		boolean d = a.equals(b);//It is case sensetive
		System.out.println(d);
		
		String g = "velocity";
		
		boolean f = a.equalsIgnoreCase(g);//It is not case sensetive
		System.out.println(f);
		
		int c =a.length();
		System.out.println("Lenghth os sring a is ="+c);
		
		char j = a.charAt(5);// char at index number
		System.out.println( j);
		
		a = a.concat(" Class");// to concat two strings
		System.out.println(a);
		
		a = a.concat(" $");// it is also consider as string because it is written in ""
		System.out.println(a);
		
		a = a+ '%' ;
		System.out.println(a);
		
		a = a+ " Hello" ;
		System.out.println(a);
	}
}
