package arrays;

public class Bike 
{
	String Brand;
	String name;
	double price;
	String colour;

	Bike (){}
	Bike(String Brand,String name,double price,String colour)
	{
		this.Brand=Brand;
		this.name=name;
		this.price=price;
		this.colour=colour;
	}
	public void displayBike()
	{
		System.out.println(Brand);
		System.out.println(name);
		System.out.println(price);
		System.out.println(colour);
		System.out.println("__________________________________");
	}
}
