package pac1;

public class Array {

	public static void main(String[]args)
	{

		//		int a[]= {20,30,64,53};
		//		
		//		System.out.println(a[0]);	
		//		
		//		int b[]= new int[6];
		//		
		//		b[0]=34;
		//		b[3]=23;
		//		
		//		System.out.println();
		//		
		//		int s= a.length;
		//		System.out.println(s);
		//		
		//		
		//		for(int i=0;i<=s-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//		
		//		System.out.println();
		//		
		//		for(int i=0;i<=s-1;i++)
		//			{
		//				System.out.print(b[i]+",");
		//			}
		//			





		// 				By assign vale



		//		int c[]= {23,54,64,32,15};
		//		
		//		int v=c.length;
		//		System.out.println(v);
		//		
		//		for(int x=0; x<=v-1;x++)
		//		{
		//			System.out.print(c[x] + ",");
		//		}
		//		
		//		System.out.println();
		//		int d[]= new int[5];
		//		
		//		d[0]=c[4];
		//		d[1]=c[3];
		//		d[2]=c[2];
		//		d[3]=c[1];
		//		d[4]=c[0];
		//				
		//		
		//		
		//		for(int x=0; x<=v-1;x++)
		//		{
		//			System.out.print(d[x] + ",");
		//		}


		//				Generalize		

		//		

		//		int a[]= {12,32,14,32,43,523};
		//		
		//		for(int i =0;i<a.length;i++)
		//		{
		//			System.out.print(a[i] + ",");
		//		}
		//		
		//		int b[]= new int[a.length];
		//		
		//		for(int i =0;i<a.length;i++)
		//		{
		//			b[i]=a[(a.length-1)-i];
		//		}
		//		
		//		a=b;
		//		
		//		System.out.println();
		//		
		//		for(int i =0;i<a.length;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//
		//
		//		System.out.println();
		//		System.out.println();
		//	



		//	      BY swapping numbers


		//		
		//		int a[]= {1,2,3,4};
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//		
		//		System.out.println();
		//		int swap= (a.length)/2;
		//		
		//		System.out.println("Swap = "+swap);
		//		
		//		int c;
		//		
		//		c=a[0];
		//		a[0]=a[3];
		//		a[3]=c;
		//		
		//		System.out.println(a[0]);
		//		
		//		System.out.println(a[3]);
		//		
		//		c=a[1];
		//		a[1]=a[2];
		//		a[2]=c;
		//	
		//		System.out.println(a[1]);
		//		
		//		System.out.println(a[2]);
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//		
		//		



		//		By using generalize formula(swaping)




		//		for(int i=0;i<swap;i++)
		//		{
		//		c=a[i];
		//		a[i]=a[(a.length-1)-i];
		//		a[(a.length-1)-i]=c;
		//		}
		//		
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i] + ",");
		//		}
		//		





		//     Accending & dec	


		//		int a[]= {12,32,14,32,43};
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//		
		//		int c;
		//		System.out.println();
		//		if(a[0]<a[1])
		//		{
		//			c=a[0];
		//			a[0]=a[1];
		//			a[1]=c;
		//			
		//		}
		//		
		//		if(a[1]<a[2])
		//		{
		//			c=a[1];
		//			a[1]=a[2];
		//			a[2]=c;
		//			
		//		}
		//		
		//		if(a[2]<a[3])
		//		{
		//			c=a[2];
		//			a[2]=a[3];
		//			a[3]=c;
		//		}
		//		
		//		if(a[3]<a[4])
		//		{
		//			c=a[3];
		//			a[3]=a[4];
		//			a[4]=c;
		//		}
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}



		//  Genralize code		Decending array




		//		int a[]= {12,32,14,33,43};
		//		int c;
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//			{
		//				System.out.print(a[i]+ ",");
		//			}
		//		
		//		
		//		System.out.println();
		//			
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//				for(int j=i+1;j<=a.length-1;j++)
		//				{
		//					if(a[i] < a[j])
		//					{
		//						c=a[i];
		//						a[i]=a[j];
		//						a[j]=c;
		//						
		//					}
		//				}
		//	
		//		}
		//		
		//		
		//		for(int i=0;i<=a.length-1;i++)
		//		{
		//			System.out.print(a[i]+ ",");
		//		}
		//		


		//  Genralize code		Accending array

		//			int a[]= {12,32,14,33,43};
		//			int c;
		//			
		//			for(int i=0;i<=a.length-1;i++)
		//				{
		//					System.out.print(a[i]+ ",");
		//				}
		//			
		//			
		//			System.out.println();
		//				
		//			for(int i=0;i<=a.length-1;i++)
		//			{
		//					for(int j=i+1;j<=a.length-1;j++)
		//					{
		//						if(a[i] > a[j])
		//						{
		//							c=a[i];
		//							a[i]=a[j];
		//							a[j]=c;
		//							
		//						}
		//					}
		//		
		//			}
		//			
		//			
		//			for(int i=0;i<=a.length-1;i++)
		//			{
		//				System.out.print(a[i]+ ",");
		//			}
		//		

		//Sum of given array		

		//		int a[] = {1,2,3,4};
		//		
		//		int sum = 0;
		//		
		//		sum=sum+a[0];
		//		sum = sum+a[1];
		//		sum = sum+a[2];
		//		
		//		System.out.println(sum);


		//		Generalized formula
		//		
		//		for(int i = 0;i<a.length;i++)
		//		{
		//			sum = sum +a[i];
		//		}
		//		
		//		System.out.println("Sum = " + sum);


		
		
		
		


	//		FInd Even number in array



//		int a[]= {1,2,3,4,5,6,7,8,9,10};
//
//
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2 == 0)
//			{
//				System.out.print(a[i]+",");
//
//			}
//
//		}	
		
		
		
		
		
//				Find the index of the even numbers	
		
		
//		int a[]= {1,2,3,4,5,6,7,8,9,10};
//
//
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]%2 == 0)
//			{
//				System.out.print(a[i]+",");
//
//			}
//
//		}
		
		
		
	}
}
