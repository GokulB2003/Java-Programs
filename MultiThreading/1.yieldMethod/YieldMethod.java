/*Yield Method..In java*/
import java.util.*;
class MyThread extends Thread
{
	public void run()
	{
		for(int i=0; i<=5; i++)
		{
			System.out.println("Running thread"+Thread.currentThread().getName());
			Thread.yield();
		}
	}

}
public class YieldMethod
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		MyThread m=new MyThread();
		MyThread m1=new MyThread();

		m.start();
		m1.start();
		
	
		
	}
}