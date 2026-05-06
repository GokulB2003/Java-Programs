import java.util.*;
class Car
{	
	int gears=5;
	class Engine
	{
		void show()
		{
			System.out.println(gears);
		}
	}
}
public class NonStaticClass
{
	public static void main(String args[])
	{
		Car c=new Car();
		Car.Engine e=c.new Engine();
		e.show();
		
	}
}