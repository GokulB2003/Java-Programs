/*Bolck level SynchroniZation*/
class BankAccount
{
	int balance=100;
	
	public void balanceOp(int amnt)
	{
		synchronized (this)
		{
			balance+=amnt;
			
			try
			{	
				System.out.println(Thread.currentThread().getName()+"read balance"+balance);
				Thread.sleep(2000);
			}
			catch(InterruptedException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public int getBal()
	{
		return balance;
	}
}
class OPerations extends Thread
{
	BankAccount b;
	
	int amnt;
	public OPerations(BankAccount acc,int amnt)
	{
		this.b=acc;
		this.amnt=amnt;
	}
	
	public void run()
	{
		b.balanceOp(amnt);
	}
}
public class BlockLevelSync
{
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();
		OPerations o=new OPerations(b,100);
		o.start();
		
		
	
	}
}