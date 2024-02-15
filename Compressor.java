package arrays;

public class Compressor 
{
	String type;
	int capacity;
	int oppress;
	String powerip;
	
	Compressor(){}

	public Compressor(String type, int capacity, int oppress, String powerip) {
		super();
		this.type = type;
		this.capacity = capacity;
		this.oppress = oppress;
		this.powerip = powerip;
		
	}
	
	public void displayCompressor()
	{
		System.out.println(".......Compressor Installed.....");
		System.out.println("Type Of Compressor   :"+type);
		System.out.println("Capacity   :"+capacity+"kg");
		System.out.println("Oprating Pressure   :"+oppress+"Bar");
		System.out.println("Powe ip   :"+powerip);
	
	}

}

