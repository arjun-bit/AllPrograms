// to understand why we use return.
//in this program we use value c in our main program 


package methods1;

public class Method6 {

	static int test(int a, int b)
	{
		int c = a+b;
		return c;
		
		
	}
	
	public static void main(String[]args)
	{
		
		int x= Method6.test(5, 5);
		System.out.println("x = "+x);
		
		x = Method6.test(x, 5);
		System.out.println("x = "+x);
		
		
		x =Method6.test(x,5);
		System.out.println("x = "+x);
		
		
	}
	
}
