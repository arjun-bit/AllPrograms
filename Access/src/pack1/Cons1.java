// to understand constructor private , public, default, protected from cons1,cons2,cons3,cons4



package pack1;

public class Cons1 {
	
	public int b;
	
	public Cons1()
	{
		b= 12;
	}
	
	private Cons1(int i)
	{
		b=13;
	}
	
	Cons1(char j)
	{
		b= 14;
	}
	
	protected Cons1(int r,char l)
	{
		b= 15;
	}
	
	protected void test() 
	{
	System.out.println("Hello");	
	}
	public static void main(String[] args)
	{
		
		
		Cons1 x = new Cons1();
		System.out.println(x.b);
		
		Cons1 y = new Cons1(33);
		System.out.println(y.b);
		
		Cons1 z = new Cons1('$');
		System.out.println(z.b);
		
		Cons1 w = new Cons1(55,'*');
		System.out.println(w.b);
		
	}

}
