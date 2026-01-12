/*Q7. Write a java program to display the reverse array*/
import java.util.*;
public class ReverseArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int arr[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		/*for(int i=arr.length; i>=0; i--)
		{
			System.out.print(arr[i]+" ");
		}*/
		int i=0;
		System.out.println("Enter the index from start the reverse:");
		int j=sc.nextInt();
		while(i<j)
		{	
			int temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
			i++;
			j--;
			
		}
		
		for(i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
	}
}
//////////