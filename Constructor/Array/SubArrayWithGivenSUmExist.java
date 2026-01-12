/*Check if Subarray with Given Sum Exists
For a given sum, check if there’s a subarray with that sum using sliding window.
*/
import java.util.*;
public class SubArrayWithGivenSUmExist
{	
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	int arr[]=new int[]{10,20,30,40,50};
	
	int target=50,sum=0;
	int i=0,j=0;
		Boolean flag=true;
		while(i<arr.length && j<arr.length)
		{
			//sum+=arr[j];
			if(sum==target)
			{
				flag=false;
				break;
				//int p=i;
				/*while(p<=j)
				{
					System.out.print(arr[p]);
					p++;
				}*/
				//i++;
			}
			else if(sum>target)
			{	
				//int temp=j-i;
				sum-=arr[i];
				i++;
			}
			else
			{	
				sum+=arr[j];
				j++;
					
			}
			
		}
		if(flag==false)
		{
			System.out.println("Exist");
		}
		else
		{
			System.out.println("No");
		}
		
		
		
	}
}