//FIxed return



package methods1;

public class Method2 {
	
	static int test(int i, int j)// input to the method
	{
		int c= i +j;
		System.out.println("C = "+c);
		return 69;   // output for the method
		
	}
	
	public static void main(String[] args) {
	
	int x=0;
	x=Method2.test(2,2);
	System.out.println("x ="+x);
	
	x=Method2.test(4,2);
	System.out.println("x ="+x);

	
	
	}
}
// will return always 66 in x 