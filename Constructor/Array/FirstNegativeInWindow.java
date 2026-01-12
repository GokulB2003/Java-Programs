/*FirstNegativeInWindow*/
import java.util.*;
public class FirstNegativeInWindow
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[] = {12, -1, -7, 8, -15, 30, 16, 28};
        	int n = arr.length;
        	int k = 3;
		int s=0;
		int negative=-1;
		for(int e=0; e<arr.length; e++)
		{
			if(arr[e]<0 && negative==-1)
			{
				negative=e;
			}
			if((e-s+1)==k)
			{
				if(negative!=-1)
				System.out.println(arr[negative]);
				s++;
				if(negative<s)
				{
					negative=-1;
					for(int j=s; j<=e; j++)
					{
						if(arr[j]<0)
						{
							negative=j;
							break;
						}
					}
					
				}
				
				
			}
			
			
		}
	}
}