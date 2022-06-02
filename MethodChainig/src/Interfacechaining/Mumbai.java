package Interfacechaining;
public class Mumbai implements InterMumbai{
	
	public InterHydrabad demo()
	{
		InterHydrabad h = new Hydrabad();
		return h;
	}

}
