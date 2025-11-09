/* Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/
import java.util.*;
class BankAccount
{	
	int balance;
	void setValue(int balance )
	{
		
		this.balance=balance;
		
	}
}
class SavingAccount extends BankAccount
{	
	final double rate=5.0;
	double total=0.0;
	void calculateInterest()
	{
		total=balance*rate/100;
		
	}
	void display()
	{
		System.out.println(""+total);
	}
}
class CurrentAccount extends BankAccount
{
	final double rate=3.0;
	double total=0.0;
	void calculateInterest()
	{
		total=balance*rate/100;
		
	}
	void display()
	{
		System.out.println("current Account Interest is:"+total);
	}

			

}
public class TotalBalance
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the Salary of the Employee:");
	int salary=sc.nextInt();

	CurrentAccount c=new CurrentAccount();
	c.setValue(salary);
	c.calculateInterest();
	c.display();
	SavingAccount s=new SavingAccount();
	s.setValue(salary);
	s.calculateInterest();
	s.display();
}
}