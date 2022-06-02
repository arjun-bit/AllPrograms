package Pune;

public class Test extends Demo{
	// global
	
	static int a = 10;
	int b = 23;
	
	void alpha()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(Demo.a);
		System.out.println(super.a);
		System.out.println(super.b);
	}

	public static void main(String[] args) {
		
		Test x = new Test();
		x.alpha();
	}
}
