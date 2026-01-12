/*Sum of Two Numbers Equals Target
Given a sorted array and a target, check if there are two numbers that sum up to the target.
*/
import java.util.*;
public class TwoSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6};
		int target=5;
		int i=0;
		int j=arr.length-1;
		while(i<j)
		{
			if(arr[i]+arr[j]==target)
			{
				
				System.out.print("("+arr[i]+","+arr[j]+")");
			}
			else if((arr[i]+arr[j])<target)
			{
				i++;
				
			}
			else if((arr[i]+arr[j])>target)
			{
				j--;
			}
			//i++;
			j--;
		}		
	}
}