interface Vehicle
{
	
	
	public void engine();

	class ABC implements Vehicle
	{
		public void engine()
		{
			System.out.println("parent");
		}
	}
		
}
class NewABC extends Vehicle.ABC
{
	public void engine()
	{
		System.out.println("this is an Method of Vehicle class");
	}
} 
public class ClassWithoutInterface2{
	public static void main(String args[])
	{
		Vehicle.ABC v=new Vehicle.ABC();
		v.engine();
		v=new NewABC();
		
		v.engine();
		//System.out.println("the result of the Vehicle"+result);
	}
}
