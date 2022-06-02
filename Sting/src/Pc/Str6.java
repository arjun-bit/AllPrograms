// replace

package Pc;

public class Str6 {
	
	public static void main(String[] args)
	{
		
		String a= "Have fun in our life";
		System.out.println(a);
		
		a = a.replace("fun", "nun");// replace all fun with nun from the string 
		System.out.println(a);
		
		a = a.replace('n','f');// replace all n with f from the string
		System.out.println(a);
	
		a = a.replace("f","the");// replace all f with the from the string
		System.out.println(a);
	}

}
