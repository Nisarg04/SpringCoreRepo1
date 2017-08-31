package lifeCycle1;

public class IceCream {

	String flavour;

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}
	
	public void displayFlavour()
	{
		System.out.println("Your selected flavour is : "+flavour);
	}
	
	public void init()
	{
		System.out.println("Bean has been created");
	}
	
	public void destroy()
	{
		System.out.println("Bean will now be destroyed");
	}
	
}
