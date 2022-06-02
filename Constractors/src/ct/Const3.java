package ct;

public class Const3 {
	
	
	static int a = 12;
	int b= 23;
	
	Const3()
	{
		a= 18;// now value of static  a changed
		b = 54;
	}
	
	public static void main(String[]args)
	{
		
		System.out.println("a ="+a);
		
		Const3 x= new Const3();
		System.out.println("x.a="+ a); 
		System.out.println("x.b="+x.b);
		
	}
	
}
