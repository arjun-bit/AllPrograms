package pack2;


import pack1.Method1;

public class Method3  {
	
	public static void main(String [] args)
	{
		
		Method1.Test();
//		Method1.Test1(); // it is default
//		Method1.Test2();// it is private
//		Method1.Test3();// it is protected
		

		Method1 x= new Method1();
		x.test4();
		
	
	}
}
