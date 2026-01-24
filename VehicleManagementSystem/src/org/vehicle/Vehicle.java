package org.vehicle;
import java.util.*;

 class Vehicle {
	 String model;
	 String registrationNum;
	 double speed;
	 double fuelcapacity;
	 double fuelConsumption;
	public Vehicle(String model, String registrationNum, double speed, double fuelcapacity, double fuelConsumption) {
		
		this.model = model;
		this.registrationNum = registrationNum;
		this.speed = speed;
		this.fuelcapacity = fuelcapacity;
		this.fuelConsumption = fuelConsumption;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getRegistrationNum() {
		return registrationNum;
	}
	public void setRegistrationNum(String registrationNum) {
		this.registrationNum = registrationNum;
	}
	public double getSpeed() {
		return speed;
	}
	public void setSpeed(double speed) {
		this.speed = speed;
	}
	public double getFuelcapacity() {
		return fuelcapacity;
	}
	public void setFuelcapacity(double fuelcapacity) {
		this.fuelcapacity = fuelcapacity;
	}
	public double getFuelConsumption() {
		return fuelConsumption;
	}
	public void setFuelConsumption(double fuelConsumption) {
		this.fuelConsumption = fuelConsumption;
	}
	public double fuelNeeded(double distance)
	{
		double amnt=distance/fuelConsumption;
		return amnt;
	}
	public double distanceCovered(double time)
	{
		double distance=0.0;
			distance=speed*time;
			return distance;
		
		
		
	}
	public void display()
	{
		System.out.println("*******************Information About Vehicle**************");
		System.out.println("Model of the vehicle:\t\t\t"+model);
		System.out.println("Registration Number of vehicle:\t\t"+registrationNum);
		System.out.println("Speed of the vehicle:\t\t\t"+speed+"\t\t");
		System.out.println("FuelCapacity of the vehicle:\t\t"+fuelcapacity+"\t\t");
		System.out.println("Fuel Consumption of the vehicle:\t"+fuelConsumption);
	}
	
	 
}
