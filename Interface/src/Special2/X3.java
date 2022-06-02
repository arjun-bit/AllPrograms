package Special2;

public class X3{

	public static void main(String[] args)
	{

		X2 x = new X2();

		x.test();
		x.alpha();

		System.out.println(X1.a);

		//	static method can be call by interface name only
		X1.beta();

		//	katraj.beta(); // because method beta does not get inheriate to next call it is only access by the class where it is declared. so it is used for security purpose
	
		x.gyma();//default method
	
		
		// we can also override the default the method but if we did this then we can't access the dethod method we can only access the override method 
//	orginal value is "gyma" but we are getting "I am changed"
	
	
	}
}