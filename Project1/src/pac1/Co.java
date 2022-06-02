package pac1;

public class Co {

	static int a= 78;
	int b = 56;
	
	Co()
	{
		a= 89;
		
		int c= 78;
		b= c+69;
		
	}
	Co(int i)
	{
		b =90;
	}
	
	public static void main(String[]args) {
	
		System.out.println(a);
		
		Co x= new Co();
		System.out.println(a);
		System.out.println(x.b);
		
		Co y= new Co(4);
		System.out.println(a);
		System.out.println(x.b);
		
		
		
		System.out.println(a);
	
	}
}