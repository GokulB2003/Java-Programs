class BankAccount
{
	public void show()
	{
		System.out.println("This is a ");
	}
}
class ABC extends BankAccoubt
{
	private void show()
	{
		System.out.println("Child");
	}
}
public class MethodOverriding
{
	public static void main(String args[])
	{
		//BankAccount b=new BankAccount();
		ABC obj=new ABC();
		obj.show();
		
		
		
	
	}
}

