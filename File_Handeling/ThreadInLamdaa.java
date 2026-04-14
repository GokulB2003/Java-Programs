//using Thread class
import java.util.*;
public class ThreadInLamdaa
{
	public static void main(String args[])
	{
		Runnable r=new Runnable()
			{
				int a=20;
				//a=50; effectively final variable
				public void run()
				{
					a=34;
					System.out.println("runnable Interface:"+a++);
					
				}
				
			};
			Thread t=new Thread(r);
			t.start();
	}
}