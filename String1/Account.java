import java.util.*;
class Bank
{
	
	int balance=20;
	void add(int balance)
	{
		this.balance+=balance;
		System.out.println("final Balance after added is:"+balance);
	}
	 void withDraw(int money)
	{
		synchronized(this)
		{
		try
		{
		Thread.sleep(1000);
		balance=balance-money;
		System.out.println("Final Balance is"+balance);
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
		}
	}
	
}
class Deposite extends Thread
{
	Bank b;
	int money=0;
	
	public void set(Bank b)
	{
		this.b=b;
	}
	Deposite(int money)
	{
		this.money=money;
	}
	//try
	//{
		 public void run()
		{
			b.add(money);
		}

	//}
	/*catch(Exception e)
	{
		System.out.println(e);
	}*/
}
class Withdraw extends Thread
{
	Bank b;
	int money=0;
	Withdraw(int money)
	{
		this.money=money;
	}
	public void set(Bank b)
	{
		this.b=b;
	}
	//try
	//{
	 public void run()
	{
		b.withDraw(money);
	}
	//}

     /*	catch(Exception e)
	{
		System.out.println(e);
	}*/
	
	
}
public class Account
{
	public static void main(String args[])
	{
		Bank b=new Bank();
		
		Deposite d=new Deposite(500);
		d.set(b);
		d.start();

		Withdraw w=new Withdraw(100);
		w.set(b);
		w.start();
		
		
	}
}