package pac1;

public class Staticmethodcall {

	static void test()
	{
		System.out.println("You called static method");
		
	}
	
	void test1()
	{
		System.out.println("you called non static method");
	}	
	
	public static void main(String[] args)
	{
		
		test();
		
				//or 
		Staticmethodcall.test();
		
		
		
//   for non static
		
		Staticmethodcall x = new Staticmethodcall();
		x.test1();
		
		

	}
	
}
