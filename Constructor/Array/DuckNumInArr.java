/*Q21. Write a java program to find duck number of a array.
*/
import java.util.*;
public class DuckNumInArr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,20,100,350,10};
		for(int i=0; i<arr.length; i++)
		{
			int n=arr[i];
			boolean flag=false;
			while(n!=0)
			{	int rem=n%10;
				if(rem==0)
				{
					flag=true;
				}
				n=n/10;
			}
			if(flag)
			{
				System.out.println(arr[i]);
			}
			
		}
	}
}