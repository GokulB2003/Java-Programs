import java.util.*;
public class MoveAllZeroToEnd
{
	public static void main(String args[])
	{
		int arr[]={0,10,0,3,4,3,5,6};
		int i=0;
		int k=arr.length-1;
		while(i<k)//i=0; 0
		{
			if(arr[i]==0)//
			{
				int j=i;
				while(j<k)
				{
					arr[j]=arr[j+1];
					
					
					j++;
				}
				arr[k]=0;
				k--;
				i=0;
			}
			else
			i++;
			
		}
		for(int m=0; m<arr.length; m++)
		{
			System.out.println(arr[m]);
		}
		
		
	}
}