package arrays;

public class Fan 
{
	String name;
	String type;
	int dia;
	
	
	Fan(){}
	Fan(String name, String type, int dia)
	{
		this.name = name;
		this.type = type;
		this.dia = dia;
	}
	
	public void displayFan()
	{
		System.out.println("----------Fan Installed------");
		System.out.println("Name    :"+name);
		System.out.println("Type   :"+type);
		System.out.println("Diameter :"+dia+"cm");
		
	}
	
	
	
	
	
	

}
