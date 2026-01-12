/*Q2. Write a java program to calculate sum of array is size 5.
.
*/
import java.util.*;
public class SumofArray
{	static int b[];
	public static void main(String args[])
	{
		int sum=0;
		System.out.println(b);

		System.out.println("Enter the values in the array");
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)
		{
			sum+=a[i];
		}
		System.out.println("sum"+sum);
	}
}