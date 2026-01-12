/*Q18. Write a java program to remove duplicates values of array.
*/
import java.util.*;
public class RemoveDuplicates
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={10,20,20,20,-1,-1};
		//Arrays.sort(arr);
		int count=0;
		for(int i=0; i<arr.length; i++)
		{
			for(int j=i+1; j<arr.length-1; j++)
			{
				if(arr[i]==arr[j]&& arr[j]!=-1)
				{	
					//arr[j]=arr[j+1];
					arr[j]=-1;
				
				}				
			}

		}
		
		for(int i=0; i<arr.length-count; i++)
		{
			if(arr[i]!=-1){

			System.out.print(arr[i]+" ");
			}
		}
	}
}