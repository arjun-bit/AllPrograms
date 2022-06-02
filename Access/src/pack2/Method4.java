package pack2;

import pack1.Method1;

public class Method4 extends Method1 {

public static void main(String[] args)	
{
	Method1.Test();
//	Method1.Test1(); // it is default
//	Method1.Test2();// it is private
	Method1.Test3();// it is protected(because of inheritance)
	
	
	Method1 x = new Method1();
	x.test4();
	
//	Method1 y = new Method1();
//	y.test5();
	
//	Method1 z = new Method1();
//	z.test6();
	
	Method4 w = new Method4();// for protected in method we have create object of same class
	w.test7();
	
	
	
	
	
 }
}
