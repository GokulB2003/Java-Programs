/*Q23. Write a java program to find armstrong number of a array. 
*/
import java.util.*;
public class ArmStrongNumInArr
{
	public static void main(String args[])
	{
		int arr[]={1,20,25,30,35,67};
		for(int i=0; i<arr.length; i++)
		{
			int p=arr[i];
			int count=0;
			while(p!=0)
			{	p=p/10;
				count++;
			}
			int temp=arr[i];
			int pow=1;
			while(temp!=0)
			{
				int rem=temp%10;
				int j=1,sum=0;
				while(j<=count)
				{
					pow=pow*rem;//2
					j++;
				}
				sum+=pow;
			tem=temp/10;
			}
			if(pow==arr[i])
			{
				System.out.print(arr[i]);
			}
		}
	}
}