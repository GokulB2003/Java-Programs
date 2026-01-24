package org.vehicle;
import java.util.*;

public class Transport {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		 System.out.print("Enter Truck Model: ");
	        String tModel = sc.nextLine();

	        System.out.print("Enter Truck Registration Number: ");
	        String tReg = sc.nextLine();

	        System.out.print("Enter Truck Speed (km/hr): ");
	        double tSpeed = sc.nextDouble();

	        System.out.print("Enter Truck Fuel Capacity (liters): ");
	        double tFuelCap = sc.nextDouble();

	        System.out.print("Enter Truck Fuel Consumption (km/l): ");
	        double tFuelCon = sc.nextDouble();

	        System.out.print("Enter Truck Cargo Weight Limit (kg): ");
	        double tCargo = sc.nextDouble();
	        
	        System.out.println("Enter the Distance covered by Truck:");
	        double distance=sc.nextInt();
	        Truck t=new Truck(tModel,tReg,tSpeed,tFuelCap,tFuelCon,tCargo);
		
			t.display();
			System.out.println("fuel needed for the truck is:\t\t"+t.fuelNeeded(distance));
			
			 sc.nextLine(); 

		        System.out.print("\nEnter Bus Model: ");
		        String bModel = sc.nextLine();

		        System.out.print("Enter Bus Registration Number: ");
		        String bReg = sc.nextLine();

		        System.out.print("Enter Bus Speed (km/hr): ");
		        double bSpeed = sc.nextDouble();

		        System.out.print("Enter Bus Fuel Capacity (liters): ");
		        double bFuelCap = sc.nextDouble();

		        System.out.print("Enter Bus Fuel Consumption (km/l): ");
		        double bFuelCon = sc.nextDouble();

		        System.out.print("Enter Number of Passengers: ");
		        int bPassengers = sc.nextInt();

		        Bus bus = new Bus(bModel, bReg, bSpeed, bFuelCap, bFuelCon, bPassengers);
		        bus.display();
	
	}
}
