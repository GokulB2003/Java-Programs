/*Q12. Write a java program to find missing value in array.
Input : 
1 4 6 7 11 15
Output : 2 3 5 8 9 10 12 13 14
*/
import java.util.*;
public class FindMissingNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("ENter the size of the Array:");
		int size=sc.nextInt();
		int arr[]=new int[size];
		//System.out.println("Enter the value of n:");
		//int n=sc.nextInt();
		System.out.println("Enter the values in Array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0; i<arr.length-1; i++)
		{	
			
			/*if(arr[i]+1==arr[i+1])
			{
				i++;
			}*/
			
				
				int j=arr[i]+1;
				int k=arr[i+1];
				while(j<k)
				{
					System.out.print(j+" ");
					j++;
				}			
			
		}
	}
}