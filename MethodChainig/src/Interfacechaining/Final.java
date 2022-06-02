package Interfacechaining;

public class Final {

	public static void main(String[] args) {
		
		InterPune a= new Pune();
		InterMumbai b = a.alpha();
		InterHydrabad c = b.demo();
		c.test();
		
		//or//Interface Chaining
		
		a.alpha().demo().test();
	}
}
