import java.util.*;
class Bankop
{
	int balance=100;
	synchronized public void deposite(int bal)
	{
		try
		{
		balance+=bal;
		System.out.println("after the operation final Balance:"+balance);
		Thread.sleep(1000);
		synchronized(this)
		{
			balance=100;
			Thread.sleep(2000);
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
	public void withdraw(int amnt)
	{
		balance=balance-amnt;
		System.out.println("after the operation final Balance:"+balance);
	} 
	
	
		
}
class Deposite extends Thread
{
	Bankop b;
	int bal=0;
	Deposite(Bankop b,int bal)
	{
		this.b=b;
		this.bal=bal;
		
	}
	public void run()
	{
		b.deposite(bal);
	}
	
}
class Withdraw extends Thread
{	Bankop b;
	int bal=0;
	Withdraw(Bankop b,int bal)
	{
		this.b=b;
		this.bal=bal;
	}
	public void run()
	{
		b.withdraw(bal);
	}
}
public class BankOperation
{
	public static void main(String args[])
	{
		try
		{
		Bankop obj=new Bankop();
		Deposite d=new Deposite(obj,1000);
		d.start();
		//d.join();
		Deposite d1=new Deposite(obj,2000);
		d1.start();
		//Deposite d1=new Bankop();
		//d1.start();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}