/*Q10.Write a java program to check array is palindrome or not.*/
import java.util.*;
public class ArrayPalindrome 
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr1[]=new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i]=sc.nextInt();
		}
		int arr2[]=new int[size];
		int k=0;
		boolean flag=false;
		for(int i=arr1.length-1; i>=0; i--)
		{
			int a=arr1[i];
			arr2[k]=a;
			k++;
		}
		/*for(int i=0; i<arr2.length; i++)
		{
			System.out.println(arr2[i]);
		}*/
		
		if(arr1.length!=arr2.length)
		{
			flag=true;
		}
		int i=0,j=0;
		while(i<arr1.length)
		{
			if(arr1[i]!=arr2[i])
			{
				flag=true;
				break;
			}
			i++;
			j++;
		}
		if(flag)
		{
			System.out.println("Not palindrome");
		}
		else
		{
			System.out.println("Palindrome");
		}
		
	}
}