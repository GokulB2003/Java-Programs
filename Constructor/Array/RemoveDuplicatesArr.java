/*
Remove duplicates from a sorted array using two pointers and return new length.

*/
import java.util.*;
public class RemoveDuplicatesArr
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={1,2,3,2,1,5};
		Arrays.sort(arr);
		int k=0;
		for(int i=0; i<arr.length-1; i++)
		{
			//[1,1,1,2,3,4,5,6]
			if(arr[i]!=arr[i+1])
			{
				arr[k]=arr[i];
				k++;
			}
			
		}
		arr[k]=arr[arr.length-1];
		for(int i=0; i<=k; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}