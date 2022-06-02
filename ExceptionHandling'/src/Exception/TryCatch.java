package Exception;

public class TryCatch {
	public static void main(String[] args) {
		
		int a = 1;
		 int b = 0;
		 int c = 2;
		 
		 System.out.println("Hello");
		 
		
			 
		 
		  try
		  {
			  c= a/b;
		  }
		  catch(ArithmeticException e)
		  {
			  System.out.println("Alternate code");
			  b = 1;
			  c = a/b;
		  }
		  
		  System.out.println(c);
	}
}



