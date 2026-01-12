/*Q22. Write a java program to find strong number of a array.
*/
import java.util.*;
public class StrongNumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
		for(int i=0; i<arr.length; i++)
		{
			int p=arr[i];
			int fact=1,sum=0;

			while(p!=0)
			{
				fact=fact*p;
				p--;
			}
			sum+=fact;
			if(sum==arr[i])
			{
				System.out.println(arr[i]);
			}
			
		}
		
	}
}