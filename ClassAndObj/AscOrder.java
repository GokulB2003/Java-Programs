//5732
import java.util.*;
public class AscOrder
{
	public static boolean checkPrime(int num)
	{
		if(num<=1)return false;
		for(int i=2; i<=num/2; i++)
		{
			if(num%i==0)
			{
				return false;
			}
		}
		return true;
	}
	public static void main(String args[])
	{
		int arr1[]={5732,8659,2534,9625,7354,1325};
		for(int k=0; k<arr1.length; k++)
		{
			
		int n=arr1[k];
		int arr[]=new int[10];
		int count=0;
		while(n!=0)
		{
			
			int rem=n%10;
			arr[rem]++;
			count++;
			n=n/10;
		}
		
			int j=0;
			int sum=0;
			for(int i=0; i<arr.length; i++)
			{
				j=i;
				
				while(arr[j]>0)
				{
					if(checkPrime(j))
					{
						System.out.print(j);	
					}
					arr[j]--;
				}
			}
			//System.out.print(sum);
			System.out.print(" ");
		
		}
	}
}