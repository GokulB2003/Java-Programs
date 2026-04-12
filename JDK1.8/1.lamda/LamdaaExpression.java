interface ABC{
	void show();
}
public class LamdaaExpression
{
	public static void main(String args[])
	{
		ABC a=()->System.out.println("This is a Lamdaa Expression:");
		a.show();
	};
	
}