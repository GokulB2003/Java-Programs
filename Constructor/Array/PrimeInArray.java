/*Q19. Write a java program to find prime number of a array.
*/
import java.util.*;
public class PrimeInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6};
		int n=arr.length;
		for(int i=0; i<arr.length; i++)
		{
			boolean flag=true;
			int p=arr[i];
			
			for(int j=2; j<=p/2; j++)
			{
			if(p%j==0)
			{	
				flag=false;
				break;
			}
			}
			if(flag)
			{
				System.out.println(arr[i]);
			}
			
			
		}

		
	}
}