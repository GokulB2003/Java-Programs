/* Write a java program to check majority element of array.
[1,2,1,3,1]
[1,1,1,2,3]
*/
import java.util.*;
public class MajorityElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		System.out.println("Enter");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}

		//for sorting
		for(int i=0; i<arr.length-1; i++)
		{
			for(int j=i+1; j<arr.length; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}			
		}

		//counting
		
		
		int n=(arr.length/2);
		for(int i=0; i<arr.length; i++)
		{
			int count=0;
		    for(int j=0; j<arr.length; j++)
		    {
			if(arr[i]==arr[j])
			{
				count++;
			}
					  
			
			
		}
		if(count>n)
			{
				System.out.print("Majority"+arr[i]);
				break;

			}
		}

		//System.out.println(n);
		/*for(int i=0; i<arr.length; i++)
		{
			System.out.print(arr[i]+" ");
		}*/
	}
	
}
