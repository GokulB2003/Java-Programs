interface UsingAbstractClass
{
	int x=10;
	void display();
}
abstract class AbsClass implements UsingAbstractClass
{
	public void display()
	{
		System.out.println(x);
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