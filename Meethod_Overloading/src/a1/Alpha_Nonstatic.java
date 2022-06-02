package a1;

public class Alpha_Nonstatic {

//Overloading for non static method	
	void Test()
	{
		System.out.println("Hii");
	}
	
	void Test(int i)
	{
		System.out.println("Hello");
	}
	
	public static void main(String[] args) 
	{
		Alpha_Nonstatic x = new Alpha_Nonstatic();
		
		x.Test();
		x.Test(5);
	
	}
}
