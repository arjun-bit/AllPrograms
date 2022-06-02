package Exception;

public final class FinallyfinalFinalize// it can't be change //it is a keyword 
{
	
	public final void test()// it can't be change 
	{
		
	}
	
	//test.finalize();//it is a method
	
	
	public static void main(String[] args) {
		final int a = 10;// it can't be change 
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
		 
		  
		  finally// will run code in any condition 
		  {
			  System.out.println("END");
		  }
		  
		  
		  //Exception not generated
		  // try- finally- normal flow
		  
		  // Exception generated and get handled
		  //try - catch- finally- normal flow
		  
		  // Exception generated and not handled
		  //try - finally
		  
}
}