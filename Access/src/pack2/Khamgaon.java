package pack2;

import pack1.Katraj;

public class Khamgaon {

	public static void main(String[] agrs) {
		
	System.out.println(Katraj.a);
//	System.out.println(Katraj.b); //because it  is default
//		System.out.println(Katraj.c); // because it is private
//		System.out.println(Katraj.d); //because it is protected
//		
		
		//or we can also go without import
				
//				System.out.println(pack1.Katraj.a);// if we don't want to import package we can also go with this way
//				System.out.println(Katraj.b); //because it  is default
//				System.out.println(Katraj.c); // because it is private
//				System.out.println(Katraj.d); //because it is protected
//			
		///////////////////////////////////////////////////////		
		
	
	Katraj x = new Katraj();
	System.out.println(x.e);
//	System.out.println(x.f);//because it  is default
//	System.out.println(x.g);//because it is private so we can't call it here
//	System.out.println(x.h);//because it is protected
	
	}
			

}
