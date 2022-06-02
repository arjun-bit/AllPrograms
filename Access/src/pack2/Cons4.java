package pack2;

import pack1.Cons1;

public class Cons4 extends Cons1 
{
	
	public static void main(String[]args)
	{
	
	Cons1 x = new Cons1();
	System.out.println(x.b);
	
//	Cons1 y = new Cons1(33); // because it is private
//	System.out.println(y.b);
	
//	Cons1 z = new Cons1('$');
//	System.out.println(z.b);
	
//	Cons1 w = new Cons1(55,'*'); //in constructor inheritance does not work so protected work as default only
//	System.out.println(w.b);
	
	Cons4 y = new Cons4();
	 y.test();
	 System.out.println(y.b);
	
	}
}