/* Write a java program to count the frequency of each element in a given array.
*/
import java.util.*;
public class FrequencyOfElement
{
	public static void main(String args[])
	{
		int arr[]={10,10,20,20,30,30,40,40};

		int count=1;
		for(int i=1; i<arr.length; i++)
		{
			if(arr[i]==arr[i-1])
			{
				count++;
			}
			else
			{
				System.out.println(arr[i-1]+":"+count);
				count=1;
			}
		}
		System.out.println(arr[arr.length-1]+":"+count);
	}
}