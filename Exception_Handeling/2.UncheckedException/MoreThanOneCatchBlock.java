/*More than one catch block*/
import java.util.*;
public class MoreThanOneCatchBlock
{
	static int arr[];
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
			try
			{
				System.out.println("Enter the number n:");
				int n=sc.nextInt();
				System.out.println("Enter the second number:");
				int sno=sc.nextInt();
		
				int ans=n/sno;
				System.out.println(ans);
				
			}
			catch(ArithmeticException e)
			{
				System.out.println("the Exception is the :"+e);
			}
			catch(InputMismatchException p)
			{
				System.out.println("th exception:"+p);
			}
			finally
			{
				System.out.println("program executed successfully:");
			}
	}		
}