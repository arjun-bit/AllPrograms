package P1;


public class katraj {
//global
	
	static int a= 10;
	int b = 23;
	
	void test()
	{
		//local
		int a = 45;
		int b = 89;
		System.out.println(a);
		System.out.println(b);
		System.out.println(katraj.a);
		System.out.println(this.a);
		System.out.println(this.b);
		
	
	}
	
	public static void main(String[] args) {
		
		katraj x = new katraj();
		x.b = 100;
		x.test();
		System.out.println("========");
		
		katraj y = new katraj();
		y.b = 500;
		y.test();
	}
}
