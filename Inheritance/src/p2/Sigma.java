package p2;

import p1.Alpha;
import p1.Byta;

public class Sigma {
public static void main(String []args)
{
	
	
// normal call	
	Alpha z=new Alpha();
	System.out.println(z.a);
	
	Alpha.Test();
	
//	Inheritance call
	Byta x = new Byta();
	System.out.println(x.a);
	
	Byta.Test();

//	Inheritance
	Byta y = new Byta();
	System.out.println(y.b);
	
	Byta.demo();
	
	

}
	
}
