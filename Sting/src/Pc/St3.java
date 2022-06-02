//Checking by there values not by address

package Pc;

public class St3 {

	public static void main(String[]args) 
	{	

		String a= "Arjun";
		String b =  "Arjun";



		String c = new String("Arjun");
		String d = new String("Arjun");

		
		boolean result = a.equals(b);
		System.out.println("a==b "+ result);
		
		boolean result1 = a.equals(c);
		System.out.println("a==c "+ result1);
		
		boolean result2 = a.equals(d);
		System.out.println("a==d "+ result2);
		
		boolean result3 = b.equals(c);
		System.out.println("b==c "+ result3);
		
		boolean result4 = b.equals(d);
		System.out.println("b==d "+ result4);
		
		
		boolean result5 = b.equals(c);
		System.out.println("b==c "+ result5);
		
	}
}
