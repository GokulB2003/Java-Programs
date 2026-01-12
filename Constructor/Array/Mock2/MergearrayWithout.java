import java.util.*;
public class MergearrayWithout
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of first Array");
		int n=sc.nextInt();
		System.out.println("Enter the size of the second Array");
		int m=sc.nextInt();
		int maxi=0;
		if(n<m)
		{
			maxi=n;
		}
		else
		{
		maxi=m;
		}
		int arr[]=new int[m];
		for(int i=0; i<maxi; i++)
		{
			arr[i]=sc.nextInt();
		}
		int arr1[]=new int[m];
		System.out.println("Enter the elements in second Array:");
		
		for(int i=0; i<m; i++)
		{
			arr1[i]=sc.nextInt();
		}
		int j=0;
		for(int i=maxi; i<arr.length; i++)
		{	
			arr[i]=arr1[j];
			j++;
		}
		System.out.println("After merging two arrays Elements:");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
	}
}