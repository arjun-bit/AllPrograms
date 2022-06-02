package pack2;

import pack1.Katraj;

public class Mumbai extends Katraj{

	public static void main(String[] args) {	

		System.out.println(a);
		//	System.out.println(b); //default
		//	System.out.println(c); //private
		System.out.println(d); //protected but we use inheritance

		Katraj y = new Katraj();
		System.out.println(y.e);
//		System.out.println(y.h);// here we can't access the protected variable to access it we have to create the object of the same class where you are calling
		
//		or
		
		Mumbai z = new Mumbai();
		System.out.println(z.e);
		//	System.out.println(x.f);//because it  is default
		//	System.out.println(x.g);//because it is private so we can't call it here
		System.out.println(z.h);//because it is protected


	}                                                                 

}
