/*Count Pairs with Given Sum
Count how many pairs in an unsorted array sum up to a target using two pointers.
*/
import java.util.*;
public class CountPairsWithSum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Enter the target");
		int target=sc.nextInt();
		int count=0;
		int start=0;
		int end=0;
		for(int i=0; i<arr.length; i++)
		{
			int sum=0;
			for(int j=i; j<arr.length; j++)
			{
				if(arr[i]+arr[j]<=arr[target])
				{
					count++;
					System.out.println("("+arr[i]+" ,"+arr[j]+")");	
				}
			}
		}
		System.out.print("count"+count);
	}
}