/*Reverse an Array In-Place
Reverse an array using the two-pointer technique.
*/
import java.util.*;
public class ReverseArrayUsingtwoPointer
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,40,80,40};
		int start=0;
		int end=arr.length-1;
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}