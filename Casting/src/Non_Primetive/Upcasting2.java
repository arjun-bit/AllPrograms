package Non_Primetive;

public class Upcasting2 extends Upcasting{

	void test()
	{
		System.out.println("Sub class");
	}
	
	void beta()
	{
		System.out.println("Not from super class");
	}
	
	public static void main(String[] args) {
		
	Upcasting2 y = new Upcasting2();
	Upcasting x = new Upcasting();
	
		x.test();//super class
		y.test();// sub class
		y.beta();// sub class
		
		Upcasting z = new Upcasting2();
		z.test();//It will call the method so sub class with the object name of super class
		
//		z.beta();/-/ not permit because it is not inheritate from super class
		
		
		
	}
}
