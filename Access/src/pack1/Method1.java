// to understand Method private , public, default, protected from Method1,method2,Method3,Method4


package pack1;

public class Method1 {

	public static void Test()
	{
		System.out.println("It is public");
	}
	
	static void Test1()
	{
		System.out.println("It is default");
	}
	
	
	private static void Test2()
	{
		System.out.println("It is private");
	}
	
	
	protected static void Test3()
	{
		System.out.println("It is protected");
	}
	
	
//	 for non static methods
	
	
	public void test4()
	{
		System.out.println("It is non ststic public");
	}
	
	 void test5()
	{
		System.out.println("It is non ststic default");
	}
	
	 private void test6()
		{
			System.out.println("It is non ststic private");
		}
	
	 protected void test7()
		{
			System.out.println("It is non ststic potected");
		}
	
	public static void main(String args[])
	{
	
		
		Test();
		Test1();
		Test2();
		Test3();
		
		Method1 x = new Method1();
		x.test4();
		
		Method1 y = new Method1();
		y.test5();
		
		Method1 z = new Method1();
		z.test6();
		
		Method1 w = new Method1();
		w.test7();
		
	} 
}
