//Method with argument


package methods1;

public class Method {
	
//	static void test(int i, int j)//i and j as input to the method
//	
//	{
//	 int c= i+j;
//	 System.out.println("C = "+ c);
//	
//		
//	}
//
//	public static void main(String[] args)
//	{
//		
//		Method.test(4, 5);
//		Method.test(10, 12);
//		
//	}

	
	
//  for non static	
	
	void test(int i, int j)//i and j as input to the method
	
	{
	 int c= i+j;
	 System.out.println("C = "+ c);
	
		
	}

	public static void main(String[] args)
	{
		
		Method x = new Method();
		x.test(12,8);
	}
	
	
	
}
