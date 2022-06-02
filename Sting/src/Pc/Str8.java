//  reverse the string

package Pc;

public class Str8 {

	public static void main(String[] args)
	{
		String a ="Velocity";
		System.out.println(a);
		char c[]= new char[a.length()];
		char d []= new char[a.length()];
		
		for(int i=0 ;i<a.length(); i++)
		{
			char b = a.charAt(i);
		
			c[i]=b;
			System.out.print(c[i]+",");
			
					
		}
		
		System.out.println();
		
		String g = new String();
		for(int j= 0; j<a.length();j++)
		{
			d[j]=c[(a.length()-1)-j];
			System.out.print(d[j]+ ",");
			
			g = g +d[j];	
			
		}
		
		
		System.out.println();
		System.out.println(g);
		
		



	}

}
