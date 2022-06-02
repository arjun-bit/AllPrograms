package Pc;

public class St {

	public static void main(String[] args)
	{
		
		int e = 50;
		int f = 50;
		
		System.out.println(e==f);// value is getting compared
		
		
		String a= "Arjun";
		String b =  "Arjun";
		
		System.out.println(a==b);// it is going to the same address and address is going to be compared
		
		
		String c = new String("Arjun");
		String d = new String("Arjun");
		
		System.out.println(c==d);// it is going to be stored in diff address and address is going to be compared
		
		
	
		
	}
	
	
}
