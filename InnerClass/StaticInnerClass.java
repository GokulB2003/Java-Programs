import java.util.*;
class Bank
{
	static String bankName="SBI";
	static class Account
	{
		void show()
		{
			System.out.println(bankName);
		}
	}
}
public class StaticInnerClass
{
	public static void main(String args[])
	{
		Bank.Account a=new Bank.Account();
		a.show();
	}
	
}