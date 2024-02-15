package arrays;

public class AirConditionerDriver
{public static void main(String[] args) 
{
	System.out.println("=======Air Conditioner Created  !!!==========");
	AirConditioner ac1=new AirConditioner("Blue Star", 120000,"10ton","10Kw");
	ac1.displayAc();
	System.out.println("===========================");
	ac1.c1.displayCompressor();
	System.out.println("===========================");
	ac1.f1.displayFan();
	System.out.println("===========================");
	ac1.a1.displayCondensor();
	System.out.println("===========================");
	ac1.e1.displayValve();
	
	
}

}
