//Both the try fails here //check by  changing the values

package Exception;

public class TryCatch2 {
	
	public static void main(String[] args) {
			
			int a = 10;
			 int b = 0;
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
				  try
				  {
					  System.out.println(d[i]);
				  }
				  catch(ArrayIndexOutOfBoundsException f)
				  {
					  System.out.println("Length of array is " + d.length+" So give input accourdingly" );
					  
				  }
			  }
			  catch(ArrayIndexOutOfBoundsException e)
			  {
				  System.out.println("Length of array is " + d.length+" So give input accourdingly" );
				  
			  }
			  
			  System.out.println(c);
}
}
