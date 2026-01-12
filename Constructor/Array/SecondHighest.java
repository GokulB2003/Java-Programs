/*
[10,50,40]
write a program to store 5 values in Array and find the second Highest element in the Array*/
import java.util.*;
import java.util.*;
public class SecondHighest
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a[]=new int[5];
		int maxi=0;
		System.out.println("Enter");
		for(int i=0; i<a.length; i++)
		{
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++)//0
		{
			if(a[i]>maxi)//
			{
				maxi=a[i];//10
			}
		}
		int m=maxi;
		maxi=0;
		for(int i=0; i<a.length; i++)
		{
			if(a[i]!=m)
			{
			if(a[i]>maxi)
			{
				maxi=a[i];
			}
			}
			
		}
		System.out.println("Second Highest is"+maxi);

	}
}