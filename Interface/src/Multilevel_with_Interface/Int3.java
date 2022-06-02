package Multilevel_with_Interface;

public class Int3 implements Int2{		

	public void test() 
	{
		System.out.println("Test");
	}
	public void Demo() 
	{
		System.out.println("Demo");
	}

	public static void main(String[] args) {
	
		Int3 x = new Int3();
		
		x.test();
		x.Demo();
		
	}
}
