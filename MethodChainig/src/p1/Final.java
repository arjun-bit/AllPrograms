package p1;

public class Final {
	
	public static void main(String[] args) {
		
		Pune a = new Pune();
		
		Mumbai b = a.alpha();
		
		Hydrabad c = b.demo();
		
		c.test();
		
		// or// Method Chaining
		
		a.alpha().demo().test();
	}

}
