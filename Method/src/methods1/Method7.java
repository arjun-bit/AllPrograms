// if class name same as datatype then we have to return object of that class




package methods1;

public class Method7 {
	
	static Method7 test(int i)
	{
		int c= i;
		System.out.println(c);
		return new Method7();
		
		
	}
	public static void main(String[]args)
	{
		
	Method7 x = new Method7();
	x.test(7);
	
		
		
	}

}
