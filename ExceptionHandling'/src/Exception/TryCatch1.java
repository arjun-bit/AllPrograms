// how to handle two exception
// but in this if try 1 get error then it will does not check the 2nd try 
// Solution in TryCatch2


package Exception;

public class TryCatch1 {
public static void main(String[] args) {
		
		int a = 10;
		 int b = 2;
		 int c = 2;
		 int i = 7; 
		 
		 System.out.println("Hello");
		 int d []= {1,2,3,45};
		
		  try
		  {
			  c= a/b;//Try1
			  System.out.println(d[i]);//try2
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Alternate code");
			  b = 1;
			  c = a/b;
		  }
		  catch(ArrayIndexOutOfBoundsException e)
		  {
			  System.out.println("Length of array is " + d.length+" So give input accourdingly" );
			  
		  }
		  
		  System.out.println(c);
	}
}
