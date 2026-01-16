import java.util.*;
class BankAccount
{
	int balance=100;
	public void addMoney(int amount)
	{
		int temp=balance;
		try
		{
			temp+=amount;
			System.out.println("the final Balance is:"+temp);
			System.out.println(Thread.CurrentThread().getName());
			Thread.sleep(1000);
		}
		catch(Exception e)
		{
			System.out.println("Error "+e);
		}
	}
}
class Tran extends Tread
{
	
}
public class TestSyncAsyncApp
{
	public static void main(String args[])
	{
		BankAccount b=new BankAccount();	
	}
}
