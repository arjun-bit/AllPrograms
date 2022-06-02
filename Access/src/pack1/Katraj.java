// to understand variable private , public, default, protected from katraj,pune,khamgaon,mumbai

package pack1;

public class Katraj {
	
	
	public static int a=10;// Static variable
	static int b= 20;
	private static int c= 30;
	protected static int d= 40;
	
	public int e = 12;// nonstatic variables
	int f=13;
	private int g= 14;
	protected int h=15;



	public static void main(String[] agrs) {
	
		System.out.println(Katraj.a);
		System.out.println(Katraj.b);
		System.out.println(Katraj.c);
		System.out.println(Katraj.d);

		//      or we can write this
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(c);
//		System.out.println(d);

		Katraj x = new Katraj();//to call non static
		System.out.println(x.e);
		System.out.println(x.f);
		System.out.println(x.g);
		System.out.println(x.h);
		
		
		
		
		
 }
}