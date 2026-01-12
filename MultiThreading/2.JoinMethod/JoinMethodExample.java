import java.util.*;
	class Joinm extends Thread
	{
		public void run()
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("A");
				
			}

		}
	}
	class Joinm1 extends Thread
	{
		public void run()
		{
			for(int i=0; i<=5; i++)
			{
				System.out.println("B");
			}
		}
	}

	public class JoinMethodExample
	{
		public static void main(String args[])throws Exception
		{
			Joinm j1=new Joinm();
			
			
			Joinm1 j2=new Joinm1();
				
			
			j2.start();
			j2.join();
			j1.start();
			

			 
		}
	}
