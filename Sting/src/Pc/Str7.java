// write a program to find whether the char is prent in string or not.


package Pc;

public class Str7 {
	
	
	public static void main(String[]args)
	{
		String a = "you all fucked up";
		
		int b  = a.indexOf('a');
//		System.out.println(b);
		
		if(b>0)
		{
			System.out.println("Char is present in the string");
		}
		else
		{
			System.out.println("char is not present on the string");
		}
		
	}

}
