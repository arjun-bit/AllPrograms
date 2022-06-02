package Special1;

public class Karve {
	public static void main(String[] args)
	{
		
		Katraj x = new Katraj();
		
		x.test();
		x.alpha();
		
		System.out.println(Demo.a);
		
//		static method can be call by interface name only
		Demo.beta();
		
//		katraj.beta(); // because method beta does not get inheriate to next call it is only access by the class where it is declared. so it is used for security purpose
		
		
	}
	

}

