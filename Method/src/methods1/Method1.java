//Return

package methods1;



public class Method1 {

	
	static int test(int i, int j)// input to the method
	{
		int c= i +j;
		System.out.println("C = "+c);
		return c;// output for the method
		
	}
	
	public static void main(String[] args) {
	
	int x=0;
	x=Method1.test(1,2);
	System.out.println("x ="+x);

	
	x=Method1.test(1,2);
	System.out.println("x ="+x);

	
	
	}
}