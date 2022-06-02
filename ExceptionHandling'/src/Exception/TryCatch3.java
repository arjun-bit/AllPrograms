// Exception argument should be in last only otherwise it will give us error
//common handling for all the Exception

package Exception;

public class TryCatch3 {
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
		  catch(Exception e)////common handling for all the Exception

		  {
			  System.out.println("exception is handlled" );
			  e.printStackTrace();// will handle the exception and will show the result you in Detail
			  
		  }
		  
		  System.out.println(c);
	}

}
