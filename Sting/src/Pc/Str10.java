//    Start with/End with


package Pc;

public class Str10 {
	
	public static void main(String[]args)
	{
		
		String a ="Velocity";
		String b = new String("Velocity");
		
		boolean c = a.startsWith("Vel"); // to startwith
		System.out.println(c);
		

		c = a.endsWith("ity"); // to endwith
		System.out.println(c);

		
		a = "LET'S GO AND do it or go and sleep";
		
		a=  a.toLowerCase();
		System.out.println(a); // to lower case
		
		a= a.toUpperCase();  // to upper case
		System.out.println(a);
		
		
		
		
		
		
 }
}