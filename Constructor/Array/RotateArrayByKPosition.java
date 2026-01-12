/*Write a program to rotate an array by k positions.
*/
import java.util.*;
public class RotateArrayByKPosition
{
	public static void Reverse(int arr[],int s,int e)
	{
		
		while(s<=e)
		{
			int temp=arr[s];
			arr[s]=arr[e];
			arr[e]=temp;
			s++;
			e--;
		}
		
		
	}
	public static void PrintArray(int arr[])
	{
		int n=arr.length;
		for(int i=0; i<n; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[]{1,2,3,4,5,6,7};
		int k=3,i=0;
		int n=arr.length;
		/*while(k!=0)
		{
			
			int p=arr.length-1;
			int temp=arr[p];
			while(p>0)
			{
				arr[p]=arr[p-1];
				p--;
				
			}
			arr[i]=temp;
			k--;	
		}*/

				//OR
		// k=k%nums.length;
		Reverse(arr,0,n-1);
		Reverse(arr,0,k-1);
		Reverse(arr,k,n-1);
		
		
		PrintArray(arr);

		
	}
}
