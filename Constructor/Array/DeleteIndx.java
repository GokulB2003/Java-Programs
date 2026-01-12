/*Q15. Write a java program to delete value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Output : 1 2 4 5
*/
import java.util.*;
public class DeleteIndx
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array:");
		int size=sc.nextInt();
		System.out.println("Enter Index to Remove:");
		int index=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the values in Array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length-1; i++)
		{	if(i>=index)
			{
			arr[i]=arr[i+1];
			}
		}
		for(int i=0; i<arr.length-1; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
	}

}