class Bank
{
	static String type="SBI";
	static class Account
	{
		public void checkType()
		{
			System.out.println(type);
		}
	}
}

public class staticInnerClass
{
	public static void main(String args[])
	{
		Bank.Account a=new Bank.Account();
		a.checkType();
	}

}