package arrays;

public class ExpansionValve 
{
	String brand;
	int oppress;
	int optemp;
	
	ExpansionValve(){}
	
	ExpansionValve(String brand,int oppress,int optemp)
	{
		
		this.brand=brand;
		this.oppress=oppress;
		this.optemp=optemp;
		System.out.println("----------Expansion Valve Installed------");
		
	}
	public void displayValve()
	{
		System.out.println("Brand   :"+brand);
		System.out.println("Operating Pressure   :"+oppress+"Bar");
		System.out.println("oprating temp   :"+optemp+"Degcel");
	}
	
	

}
