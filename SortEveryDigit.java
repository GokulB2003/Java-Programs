import java.util.*;
public class SortEveryDigit
{
	public static void main(String args[])
	{
		int n=5728;
		int k=0;
		int arr[]={2357,5689,2345,2569,3457,1235};
		int frr[]=new int[10];
		for(int j=0; j<arr.length; j++)
		{
			n=arr[j];
			
			while(n>0)
			{
				int rem=n%10;
				frr[rem]=frr[rem]+1;
				n=n/10;
			}
		
			int sortedDigit=0;
			int i=0;
			//int number=0;

			/*while(i<frr.length)
			{
				while(frr[i]>0)
				{
					sortedDigit=sortedDigit*10+i;
					frr[i]--;
				}
				i++;
			
			}*/

			//Descending Order
			i=frr.length-1;
			while(i>=0)
			{
				while(frr[i]>0)
				{
					sortedDigit=sortedDigit*10+i;
					frr[i]--;
				}
				i--;
			}
		
		
	
		//System.out.println(sortedDigit);
			arr[k]=sortedDigit;
			j++;
			k++;
		}
		for(int f=0; f<arr.length; f++)
		{
			
			System.out.println(arr[f]);
		}
	}
	
}