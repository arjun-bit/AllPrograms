package ct;

public class Const1 {
	
	static int a = 100;
	int b =200;

	//	Constructor overloading
	
	
	
	Const1()
	{
		b = 20;
	}
	
	Const1(int i)
	{
		b= 30;
	}
	
	Const1(char j)
	{
		b = 50;
	}
	
	Const1(int k,char f)
	{
		b = 60;
	}
	
	public static void main(String[] args)
	{
		
		System.out.println(a);
		
		Const1 x= new Const1();
		System.out.println(x.b);
		
		Const1 y= new Const1(2);
		System.out.println(y.b);
		
		Const1 z= new Const1('%');
		System.out.println(z.b);
		
		Const1 w= new Const1(4,'&');
		System.out.println(w.b);
		
	}
	
}
