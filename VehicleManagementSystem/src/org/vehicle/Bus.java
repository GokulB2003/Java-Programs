package org.vehicle;
import java.util.*;
class Bus extends Vehicle {

	int numOfPassanger;

	public Bus(String model, String registrationNum, double speed, double fuelcapacity, double fuelConsumption,int numOfPassanger) {
		super(model, registrationNum, speed, fuelcapacity, fuelConsumption);
		// TODO Auto-generated constructor stub
		this.numOfPassanger=numOfPassanger;
	}

	public int getNumOfPassanger() {
		return numOfPassanger;
	}

	public void setNumOfPassanger(int numOfPassanger) {
		this.numOfPassanger = numOfPassanger;
	}
	public void display()
	{
		super.display();
		System.out.println("number of passanger in bus is:\t\t"+numOfPassanger);
	}
	

}
