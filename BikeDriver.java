package arrays;

public class BikeDriver 
{
	public static void main(String[] args)
	{
		Bike [] bike=new Bike[2];
		bike[0]=new Bike("Yamaha","MT15",200000,"Black");
		
		bike[0].displayBike();
		
		bike [1]=new Bike("Yamaha","Fzs",180000,"red");
		bike[1].displayBike();
		
		
		
	}

}
