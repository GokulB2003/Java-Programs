/*Q.5 Write a Java program to display the following series using function :  
 3   6   12   24   48   96  192  
 (Each term doubles from the previous term starting at 3)*/
import java.util.*;
public class Q5
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int i=7;
		series(i,n);
		
	}
	//created new function for printing the series
	public static void series(int j,int n)
	{	int sum=n; 
		System.out.print(sum+" ");
		for(int i=1; i<=j-1; i++)
		{	sum=sum*2;
			System.out.print(sum+" ");
		}
	}
}