/*Q8. Write a java program to calculate the sum of even or odd numbers.
*/
import java.util.*;
public class EvenAndOddSumInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int evenSum=0,oddSum=0;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				evenSum+=arr[i];
			}
		}
		System.out.println("EvenSum:"+evenSum);
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				oddSum+=arr[i];
			}
		}
		System.out.println("Oddsum is"+oddSum);
	}
}