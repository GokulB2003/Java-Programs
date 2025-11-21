import java.util.*;
interface Vehicle
{
	void car();
	int a=10;
	int b=20;

	
}
interface Bike extends Vehicle
{
	void car();
	
}
class ABC implements Bike
{
	public void car()
	{
		System.out.println("this is a ABC class method");
		System.out.println(a);
	}	
}
public class Interface
{
	public static void main(String args[])
	{
		Vehicle b=new ABC();
		b.car();
		b.car();
		
	}
}