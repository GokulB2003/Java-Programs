/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5
*/
import java.util.*;
public class InsertValue
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the value of index:");
		int n=sc.nextInt();
		System.out.println("Enter the value to insert");
		int val=sc.nextInt();
		System.out.println("Enter the values in Array:");
		for(int i=0; i<arr.length-1; i++)
		{
			arr[i]=sc.nextInt();
		}
		int j=arr.length-2;
	
		while(j>=n)
		{
			arr[j+1]=arr[j];
			j--;
		}
		arr[n]=val;
		for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
}