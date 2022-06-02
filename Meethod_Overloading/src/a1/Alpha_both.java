package a1;

public class Alpha_both {

//Overloading for for static and non static Method
	
	static void Try()
	{
		System.out.println("Static Without Arg");
	}
	
	void Try(int i)
	{
	System.out.println("Nonstatic with Arg");	
	}
	
	public static void main(String[] args) {
		
		Try();
		
		
//		we can access the both static and non static
		
		Alpha_both x = new Alpha_both();
		x.Try(0);
		x.Try();
		
	}
	
	
	

}
