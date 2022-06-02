//alternate to call Method5 clas in Method4 class we take method5 as an argument so we can access that method directly in class4


package methods1;

public class Method4 {

	static void test(int i)
	{
		System.out.println("Hello");

	}
	static void test1(Method5 k)
	{
		System.out.println(k.d);

	}

	public static void main(String[] args)
	{

		int x = 65;
		Method5 j = new Method5();


		Method4.test(7);	
		Method4.test(x);
		
		
	
		
		Method4.test1(new Method5());
		Method4.test1(j);
		
		
		
//		or we can also call another class in this class
		
		Method5 n = new Method5();
		System.out.println(n.d);
		



	}

}

