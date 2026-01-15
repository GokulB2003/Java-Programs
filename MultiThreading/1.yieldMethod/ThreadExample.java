import java.util.*;
class ABC extends Thread
{
	int a=10;
	
		public void run()
		{
			try
			{
				for(int i=0; i<=10; i++)
				{
					System.out.println(a++);
					ABC.sleep(1000);
					if(i==5)
					{
					
					//System.exit(0);					
					}
					
				}

			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			
		}
	
}
public class ThreadExample
{
	public static void main(String args[])
	{
		try
		{
		ABC obj=new ABC();
		obj.start();
		ABC obj1=new ABC();
		obj1.start();
		obj1.sleep(400000);
		}
		catch(InterruptedException e)
		{
		}
	}
}