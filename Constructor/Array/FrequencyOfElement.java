/*Write a program to find the frequency of each element in an array.
*/
import java.util.*;
public class FrequencyOfElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={3,3,3};
		
		int count=1;
		Arrays.sort(arr);
		/*
		int i=0;
		while(i<arr.length)
		{
			int temp=arr[i];
			count=1;
			temp=arr[i];
			while(i<arr.length-1 && arr[i]==arr[i+1])
			{
				count++;
				i++;
			}
			
		System.out.println(temp+":"+count);
		i++;
		}
		*/
				//OR

				//using for loop and if-else
		
		for(int i=0; i<arr.length; i++)
		{
			int temp=arr[i];
			
			if(i<arr.length-1 && arr[i]==arr[i+1])
			{
				count++;
			}
			else
			{
				System.out.println(temp+":"+count);
				count=1;
					
			}
		}
	}
}