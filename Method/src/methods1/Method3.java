// how to call another call 


package methods1;

public class Method3 {
	
	static int test(int i, int j)// input to the method
	{
		int c= i +j;
		System.out.println("C = "+c);
		return c;   // output for the method
		
	}
	
	public static void main(String[] args) {
	
	int x=0;
	x=Method2.test(1,2);//     call class method2 in class method3
	System.out.println("x ="+x);
	

	
	x=Method2.test(4,2);//     call class method2 in class method3
	System.out.println("x ="+x);
	
	
	
	
	
//			or we can also call by this way
	
	Method2 y = new Method2();
	System.out.println(y.test(3, 5));
	
	
	


	
	}
}

// here we are calling class method2 in class method3 so here we are getting return value 66.
