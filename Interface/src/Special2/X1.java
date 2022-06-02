package Special2;

public interface X1 {

	//	
	int a =10; //static,public,final

	//Security
	static void beta() //public
	{
		System.out.println("Static method");
	}

	//	2nd special case
	default void gyma() //public
	{
		System.out.println("Gyma");
	}

	void test();// public abstract
	void alpha(); //public abstract
}




