/**/
import java.util.*;
public class LamdaExpressionInThread
{
	public static void main(String args[])
	{
		new Thread(()->
			{
				try
				{
					for(int i=0; i<=10; i++)
{
	System.out.println(i);
	Thread.sleep(1000);
}
				}
				catch(Exception e)
				{
					System.out.println(e.getMessage());
				}
			
		}).start();
		
		
	}
}