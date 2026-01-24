package org.vehicle;
import java.util.*;
class Truck extends Vehicle{
double cargoWeightLimit;

public Truck(String model, String registrationNum, double speed, double fuelcapacity, double fuelConsumption,double cargoWeightLimit) {
	super(model, registrationNum, speed, fuelcapacity, fuelConsumption);
	// TODO Auto-generated constructor stub
	this.cargoWeightLimit=cargoWeightLimit;
    
}
public void setCargoWeightLimit(double cargoWeightLimit)
{
	this.cargoWeightLimit=cargoWeightLimit;
}
public double getCargoWeightLimit()
{
	return cargoWeightLimit;
}
public void display()
{
	super.display();
	System.out.println("the cargo weight Limit for Truck is:\t"+cargoWeightLimit);
}

}
