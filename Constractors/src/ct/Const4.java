package ct;

public class Const4 {

//	static int a= 65;
//	int b = 65;
//	
//	Const4(int i)
//	{
//		
//		b= 1234;
//	
//	}
//	
//	public static void main(String[]args)
//	{
//		System.out.println("a is "+ a);
//		Const4 x = new Const4('%');  // arg is int but we put char. It is accepted because it is creating ASCII value
//			System.out.println(x.b); // if there is an another constructor with agr char then it will not going to work 
//
//	}
	

//	arg is int but we put char. It is accepted because it is creating ASCII value
//if there is an another constructor with agr char then it will not going to work 
//	

	
	
	static int a= 65;
	int b = 68;
	
	Const4(int i)
	{
		
		b= 1234;
	
	}
	Const4(char j)
	{
		b= 54;
	}
	
	public static void main(String[]args)
	{
		System.out.println("a is "+ a);
		
		Const4 x = new Const4('%');  
			System.out.println("x.b = "+x.b); 
			
		Const4  y = new Const4(5);
		System.out.println("y.b = "+y.b);
	}	
	
	
	
	
	
	
}
