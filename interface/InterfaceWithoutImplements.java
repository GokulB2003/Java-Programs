import java.util.*;
interface ABC
{
	void show();
}
public class InterfaceWithoutImplements
{
	public static void main(String args[])
	{
		ABC obj=()->System.out.println("Interface without implements:");
		obj.show();
		
	}
}