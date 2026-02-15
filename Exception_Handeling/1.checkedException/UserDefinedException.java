import java.util.*;
import java.lang.Exception.*;
class Checked extends RuntimeException
{
	public String getMessage()
	{
		return ("You are not Eligible:");
	}
	
}
class Voter
{
	void voterEligible(int age)
	{
		if(age<18)
		{
		   throw new Checked();
		}
		else
		{
			System.out.println("You are eligible for the voting:");
		}
	}
}
public class UserDefinedException
{
	public static void main(String args[])
	{	
	
		try
		{
			Voter v=new Voter();
			v.voterEligible(19);
		}
		catch(Checked e)
		{
			System.out.println(e.getMessage());
		}
			
	}
}