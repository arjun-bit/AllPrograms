package Multi1;


import Multi.Delta;
import Multi.Alpha;
import Multi.Byta;

public class Sigma {

	public static void main(String[] agrs)
	{
		
//		Inheritance call
		Delta x = new Delta();
		System.out.println(x.a);
		Delta.Test();
		
// 	Inheritance call		
		Delta y = new Delta();
		System.out.println(y.b);
		Delta.demo();

//		Inheritance call
		Delta z = new Delta();
		System.out.println(z.d);
		
		Delta.abc();
	
//    normal call
		Alpha.Test();
		Alpha p = new Alpha();
		System.out.println(p.a);
		
//	    normal call
			Byta.demo();
			Byta q = new Byta();
			System.out.println(q.b);	
			
			
		
		
	}
}
