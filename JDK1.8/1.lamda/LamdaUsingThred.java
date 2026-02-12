import java.util.*;
import java.io.*;
import java.lang.*;
public class LamdaUsingThred
{
	public static void main(String args[])
	{
		Runnable r=new Runnable()
		{
			
			public void run()
			{
			try
			{
				for(int i=0; i<=5; i++)
				{
					System.out.println(i);
					Thread.sleep(1000);
				}
			}
			catch(Exception e);
			{
				System.out.println(e.getMessage());
			}
			}
		};
		Thread t=new Thread(r);
		t.start();
	}
}