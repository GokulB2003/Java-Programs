interface UsingAbstractClass
{
	void display();
}
abstract class AbsClass implements UsingAbstractClass
{
	public void display()
	{
		System.out.println("this is display");
	}
} 
public class InterfaceWithAbs
{
	public static void main(String args[])
	{
		new AbsClass()
		{
		}.display();
	}
}