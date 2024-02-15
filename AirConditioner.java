package arrays;

public class AirConditioner 
{


	String name;
	double price;
	String capacity;
	String power;
	
	
	Compressor c1=new Compressor("Hermatically Sealed",10,2,"AC");
	Fan f1 = new Fan("Air Circulating fan","Evaporative Fan",30);
	Condensor a1=new Condensor("Steel",5,400);
	ExpansionValve e1=new ExpansionValve("Exansion device",2, 40);
	
	
	
	AirConditioner(){
		
	}
	 AirConditioner(String name, double price, String capacity, String power)
	 {
		 
		
		this.name = name;
		this.price = price;
		this.capacity = capacity;
		this.power = power;
	 }
	 public void displayAc()
	 {
		 System.out.println("Name of Ac   :"+name);
		 System.out.println("Price OF Ac   :"+price);
		 System.out.println("Capacity      :"+capacity);
		 System.out.println("Power    :"+power);
	 }
	
	
}
