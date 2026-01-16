/*Block level Synch*/
import java.util.*;
class BankAccount 
{
	int balance=100;
	 public void addBal(int amnt)
	{
			synchronized(this)
			{
			System.out.println(Thread.currentThread().getName());
			try
			{
			balance+=amnt;
			
			System.out.println(balance);
			Thread.sleep(1000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e);
			}
			System.out.println(Thread.currentThread().getName());
		}
		
	}
	
}
class Trans extends Thread
{
	BankAccount b;
	public void setVal(BankAccount b)
	{
		this.b=b;
	}
	public void run()
	{
		b.addBal(100);
	}
	
}

public class BlockLevelSynchroniZation
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		BankAccount b=new BankAccount();
		Trans t=new Trans();
		t.setVal(b);
		t.setName("Deposite");
		t.start();
		Trans t2=new Trans();
		t2.setVal(b);
		t2.setName("With");
		t2.start();
		
		
		
	}
}