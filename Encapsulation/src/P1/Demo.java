package P1;

public class Demo {
	
	private int a = 10;
	private int b = 20;
	
	Demo()
	{
		a = 100;
		b = 200;
	}
	
	Demo(int x)
	{
		a = 400;
	}

	public void alpha()
	{
		a++;
		b--;
		System.out.println(a);
		System.out.println(b);
	}
}
