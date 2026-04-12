import java.util.*;
public class TakeInputStringFormat
{
	public static void main(String args[])
	{
		
		String str="1,2,3,4,5";
		String arr[]=str.split(",");
		int sum=0;
		int arr1[]=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{
			int num=Integer.parseInt(arr[i]);
			arr1[i]=num;
			
		
		}
		for(int i=0; i<arr1.length; i++)
		{
			sum+=arr1[i];
		}	
		String s=String.valueOf(sum);
		System.out.println(s);
		
	
	}
}