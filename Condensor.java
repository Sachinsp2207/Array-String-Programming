package arrays;

public class Condensor 
{
	String material;
	int dia;
	int length;
	
	Condensor(){}
	Condensor(String material,int dia,int length)
	{
		this.material=material;
		this.dia=dia;
		this.length=length;

	}
	public void displayCondensor()
	{
		System.out.println("----------Condensor Installed------");
		System.out.println("material    :"+material);
		System.out.println("dia   :"+dia+"mm");
		System.out.println("length   :"+length+"mm");
		
	}	

}
