package Accessininheritance;

public class Vari1 extends Vari{
	public static void main(String[] agrs) 
	{
		Vari x=  new Vari();
		System.out.println(x.a);
		System.out.println(x.b);
//			System.out.println(y.c);// it is private
		System.out.println(x.d);
	}
}