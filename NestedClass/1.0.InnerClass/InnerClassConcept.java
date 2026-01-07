import java.util.*;


	class Car
	{
		int speed=200;
		class Engine
		{
			public void calSpeed()
			{
				System.out.println("the speed of the car is:"+speed);
			}
		}
	}
	
	public class InnerClassConcept{

		public static void main(String args[])
		{
			Car c1=new Car();
			Car.Engine e1=c1.new Engine();
			e1.calSpeed();
		
			Car c2=new Car();
			Car.Engine e2=c2.new Engine();
			e2.calSpeed();
		
		}
	}