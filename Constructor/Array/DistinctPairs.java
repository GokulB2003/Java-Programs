/*Q9. Write a program in java to count all distinct pairs for a specific difference
Expected Output:
 The given array is:
 5 2 3 7 6 4 9 8
 The distinct pairs for difference 5 are: [7, 2] [8, 3] [9, 4]
 Number of distinct pairs for difference 5 are: 3
*/
import java.util.*;
public class DistinctPairs
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={5,2,3,7,6,4,9,8};
		int count=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			for(int j=i-1; j>=0; j--)
			{
				if(arr[i]-arr[j]==5)
				{	count++;
					System.out.print("["+arr[i]+","+arr[j]+"]");
					
				}
			}
		}
		System.out.println("Number of distinct pairs for difference 5 are:"+count);
	}
}