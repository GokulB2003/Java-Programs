import java.util.*;
class Vehicle
{
	String brand;
	String model;
	double basePrice;
	String feature;
	Vehicle(String brand,String model,double basePrice,String feature)
	{
		this.brand=brand;
		this.model=model;
		this.basePrice=basePrice;
		this.feature=feature;	
	}
	public double calculatePremium()
	{
		return basePrice*0.05;
	}	
	

}
class Car extends Vehicle
{
	Car(String brand,String model,double basePrice,String feature)
	{
		super(brand,model,basePrice,feature);
	}
	
	public double calculatePremium()
	{
		if(feature.equalsIgnoreCase("airbags"))
		{
			return basePrice*0.12;
		}
		else
		{
			return super.calculatePremium();
		}
	}
}
class Bike extends Vehicle
{
	Bike(String brand,String model,double basePrice,String feature)
	{
		super(brand,model,basePrice,feature);
		
	}
	public double calculatePremium()
	{
		if(feature.equalsIgnoreCase("ABS"))
		{		
			return basePrice*0.08;
		
		}
		else
		{
			return super.calculatePremium();
		}
	}
}

public class VehicleInsuranceSystem
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vehicle v[]=new Vehicle[2];
		for(int i=0; i<v.length; i++)
		{	
			//v[i]=new Vehicle();
			System.out.println("Enter 1 for Car:"+"\n"+"Enter 2 for Bike");
			int car=sc.nextInt();
	if(car==1)
	{
		sc.nextLine();
		System.out.println("Enter the Brand of the Car");
		String brand=sc.nextLine();

		System.out.println("Enter the Model of the Car");
		String model=sc.nextLine();

		System.out.println("Enter the Base Price of the Car:");
		double baseP=sc.nextDouble();

		sc.nextLine();
		System.out.println("Enter the feature:");
		String F=sc.nextLine();

		v[i]=new Car(brand,model,baseP,F);
		double p=v[i].calculatePremium();
		System.out.println("total Premium on BasePrice:"+p);	

	}
	else
	{
		sc.nextLine();
		System.out.println("Enter the Brand of the Bike");
		String brand=sc.nextLine();

		System.out.println("Enter the Model of the Bike");
		String model=sc.nextLine();

		System.out.println("Enter the Base Price of the Car:");
		double baseP=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter the feature:");
		String F=sc.nextLine();
		v[i]=new Bike(brand,model,baseP,F);
		double rev=v[i].calculatePremium();
		System.out.println("total Premium on BasePrice is:"+rev);
	}
	}	
								
	}
	
}