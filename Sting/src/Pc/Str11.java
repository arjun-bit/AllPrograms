package Pc;

public class Str11 {
	public static void main(String[]args)
	{
		String a = "Velocity classes in pune will make you to earn more";
		String b = "Velocity";
		String c = "      I don't give a fuck      ";



		b = a.substring(5);
		System.out.println(b);  // will give result without first 5 index 


		b = a.substring(5,25);
		System.out.println(b);// will give result from index 5 to 24

		b = c.trim();         // will remove the spaces from staring and ending
		System.out.println(b);


		String x []= b.split(" "); // will split the sentance after every Space 

		for(int i =0;i <x.length;i++)
		{
			System.out.println(x[i]);
		}

		String d = "hello class we are going to Class let's go to class ";
//		String y []= d.split("class "); 
//
//		for(int i =0;i <x.length;i++)
//		{
////			System.out.println(y[i]);
//		}

		
		String z []= d.split("Class"); 

		for(int i =0;i <z.length;i++)
		{
			System.out.println(z[i]);
		}


	}

}
