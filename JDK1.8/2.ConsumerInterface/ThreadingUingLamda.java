import java.util.*;
public class ThreadingUingLamda
{
	public static void main(String args[])
	{
			new Thread(()->{
		//{
			//public void run()
			//{
				try
				{
					for(int i=0; i<=10; i++)
					{
						System.out.print(i);
						Thread.sleep(1000);
					}
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}).start();
		
		//};
		//Thread t=(r)
		
	}
}