import java.util.*;
import java.lang.*;
public class Threading_Using_Interface
{
	public static void main(String args[])
	{
		Runnable r=new Runnable()
		{
			public void run()
			{
				try
				{
					for(int i=0; i<10; i++)
					{
						System.out.println(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println("Exception e:");
				}
			}
			
			
		};
		try
		{
			Thread obj=new Thread(r);
			obj.start();
		
			Thread obj1=new Thread(r);
			obj1.start();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		
	}
}