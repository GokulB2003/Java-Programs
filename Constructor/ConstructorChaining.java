
import java.util.*;
class CAPP
{	int n;
	CAPP()
	{	
		this(7);
		
		System.out.println("this is a first constructor");
	}
	CAPP(int p)
	{
		this(7.4f);
		System.out.println("THis is a second instructor:"+p);
	}
	CAPP(float Q)
	{
		System.out.println("This is a last constructor:"+Q);
		
	}
}
public class ConstructorChaining
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		CAPP obj=new CAPP();
		
		
	}
}