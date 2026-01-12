/* Write a java program to find even and odd number in array.
*/
import java.util.*;
public class EvenOddInArray
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers");
		int arr[]=new int[5];
		int Even[]=new int[5];
		int odd[]=new int[5];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		int countEven=0,oddcount=0;
		int k=0,j=0;;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				
				Even[k]=arr[i];
				k++;
				countEven++;
				//System.out.println(arr[i]);
			}
			else
			{
				
				//System.out.println("odd number"+arr[i]);
				odd[j]=arr[i];
				oddcount++;
				j++;
			}
			
		}
		for(int i=0; i<countEven; i++)
		{	
			System.out.print(" " +Even[i]);
			//break;
			
		}
		System.out.println();
		for(int i=0; i<oddcount; i++)
		{
			
			System.out.print(" "+odd[i]);
			
			//break;
		}
		
	}
}