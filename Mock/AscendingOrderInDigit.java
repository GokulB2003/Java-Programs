/*Sort the NUm in ascending order*/
import java.util.*;
public class AscendingOrderInDigit
{
	public static void main(String args[])
	{
		int n=7821;
		int temp=n;
		int freq[]=new int[10];
		//first cal frequency of Each Element.
		while(n!=0)
		{
			int rem=n%10;
			freq[rem]=freq[rem]+1;
			n=n/10;
		}
		//convert the Elements in Ascending order
		int sortedNum=0;
		
		for(int i=0; i<freq.length; i++)
		{
			while(freq[i]>0)
			{
				sortedNum=sortedNum*10+i;
				freq[i]--;
			
			}
			
		}
		System.out.println("Final number is:"+sortedNum);
		
	}
}