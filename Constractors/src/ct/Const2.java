package ct;

public class Const2 {
	
	
	static int a= 13;
	int b= 456;
	
public static void main(String[] args)	
{

	System.out.println(a);
	Const2 x = new Const2();
	System.out.println("x.b = " +x.b);
	System.out.println("x.a =" +x.a);
	
	
	Const2 y = new Const2();
	System.out.println("y.a =" + y.a );
	System.out.println("y.b= "+y.b);
	
	int a= 45;
	System.out.println("local a="+a); // local 
	System.out.println("Static a = "+Const2.a);// Static variable
	
	
//	changinng value of a
	
	Const1.a = 40;
	System.out.println(Const1.a);
	System.out.println("x.b = " +x.b);
	System.out.println("x.a =" +x.a);
	
	System.out.println("y.a =" + y.a );
	System.out.println("y.b= "+y.b);	
 
// changing non- static value
	
	x.b = 22;
	
	System.out.println("x.b = " +x.b);
	System.out.println("x.a =" +x.a);
	
	System.out.println("y.a =" + y.a );
	System.out.println("y.b= "+y.b);	
 
	

}
}