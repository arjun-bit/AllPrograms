package pack1;

public class Cons2 {
	
	
	public static void main(String[] args)
	{
		
		Cons1 x = new Cons1();
		System.out.println(x.b);
		
//		Cons1 y = new Cons1(33); // because it is private
//		System.out.println(y.b);
		
		Cons1 z = new Cons1('$');
		System.out.println(z.b);
		
		Cons1 w = new Cons1(55,'*');
		System.out.println(w.b);
			
		
	}

}
