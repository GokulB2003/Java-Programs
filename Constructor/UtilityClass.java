class ABC
{
	private ABC()
	{
		System.out.println("this is a private constructor:");
	}
	public static A()
	{
		new ABC();
	}
}
public class UtilityClass
{
	public static void main(String args[])
	{
		
		ABC.A();
	}
}