/*
find the maximum element in Array*/
import java.util.*;
public class MAxInArray
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
		for(int i=0; i<a.length; i++)
		{
			if(a[i]>maxi)
			{
				maxi=a[i];
			}
		}
		System.out.println(maxi);
	}
}