package p1;

public class Byta extends Alpha{
	public int b =14;
	public static void demo()
	{
		System.out.println("Heyyyy");
	}
	public static void main(String[]agrs)
	{


		//	normal call
		Test();
		Alpha x = new Alpha();
		System.out.println(x.a);


		// inheritance call
		Byta.Test();
		Byta y = new Byta();
		System.out.println(y.b);
		System.out.println(y.a);

	}
}
