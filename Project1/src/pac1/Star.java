package pac1;

public class Star {

	public static void main(String[]arg) {




		//		for(int j= 1;j<=9;j++)
		//		{
		//			for(int i=1;i<=j;i++)
		//			{
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}





				for(int j= 9;j>=1;j--)
				{
					for(int i=1;i<=j;i++)
					{
						System.out.print("*");
					}
					System.out.println();
				}



//		int line = 10;
//		
//		for(int count = 1; count <= line; count++)
//		
//			{
//		
//				for (int space = (line-1) ; space >= count; space --)
//		
//				{
//		
//					System.out.print(" ");
//		
//				}
//		
//				for (int star = 1; star <= count; star ++)
//		
//				{
//		
//					System.out.print("*");
//		
//				}
//		
//				System.out.println();
//			}
//	}}


		int line = 10;
		for(int count=1; count<=line;count++)
		{
			for(int space= line-1; space >=count;space--)
			{
				System.out.print(" ");
			}

			for(int star= 1 ; star<=count;star++)
			{
				System.out.print("*");
			}
			System.out.println();


		}
	}}


		//		int line = 9;
		//		
		//		for(int count =1 ; count<=line; count ++)
		//		{
		//		
		//			for(int space=line-1;space>=count;space --) 
		//			{
		//				System.out.print(" ");
		//			}
		//			for(int star = 1 ; star<=count; star++)
		//			{
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//		
		//		for(int count =line-1 ; count>=1; count --)
		//		{
		//		
		//			for(int space=line-1;space>=count;space --) 
		//			{
		//				System.out.print(" ");
		//			}
		//			for(int star = 1 ; star<=count; star++)
		//			{
		//				System.out.print("* ");
		//			}
		//			System.out.println();
		//		}
		//		
		//		
		//		for(int j = 1; j<=10;j++)
		//		{
		//			for(int i = 1;i<=j;i++)
		//			{
		//				System.out.print("*");
		//			}
		//			System.out.println();
		//		}
		//		

		//		
		//		int line = 10;
		//		
		//		for(int count=1;count<=8;count=count+2)
		//		{
		//			for(int space=line-1; space>=count;space--)
		//			{
		//				System.out.print(" ");
		//			}
		//			for(int star=1;star<=count;star++)
		//			{
		//				System.out.print("* ");
		//			}
		//			System.out.println();
		//		}
		//		for(int count=9;count>=1;count=count-2)
		//		{
		//			for(int space=line-1; space>=count;space--)
		//			{
		//				System.out.print(" ");
		//			}
		//			for(int star=1;star<=count;star++)
		//			{
		//				System.out.print("* ");
		//			}
		//			System.out.println();
		//		}
//		int line =10;	
//		for(int count =1;count<=line; count++)
//		{
//
//			for(int space =(line-1);space>=count;space--)
//			{
//				System.out.print(" ");
//			}
//
//			for(int star =1;star<=count;star++)
//			{
//				System.out.print("*");
//			}
//			System.out.println("");
//		}


	

