import java.util.*;
//in this class we need to add ; when we create a  class and write logic.
class Vehicle
{
	public void car()
	{
		System.out.println("this is a Car class");
	}
}
public class AnnonymousClass
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Vehicle v=new Vehicle(){
				
				public void car()
				{
					System.out.println("this is a Annonymous Class:");
				}

			};
			v.car();
	}
}