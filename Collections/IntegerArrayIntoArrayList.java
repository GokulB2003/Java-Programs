/*Q1. Given an integer array, convert it into an ArrayList. Remove all even numbers and print the updated list.
What you practice:
Converting array → ArrayList using loops / Arrays.asList
Removing elements while iterating
Understanding wrapper Integer
*/
import java.util.*;
public class IntegerArrayIntoArrayList
{
	public static void main(String args[])
	{
		int arr[]={10,15,23,50};
		ArrayList<Integer>ans=new ArrayList<>();

		for(int i=0; i<arr.length; i++)
		{
			ans.add(arr[i]);
		}
		int n=ans.size();
		int i=0;
		while(i<n)
		{
			if(ans.get(i)%2==0)
			{
				int j=i;
				while(j<n-1)
				{
					ans.set(j,ans.get(j+1));
					
					j++;
				}
				n--;
				i=0;
			}
			else
			{
				i++;
			}
		}
		


			//or

		/*for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				ans.add(arr[i]);
			}
		}
		*/
		System.out.println("After removing the Elements:");
		for(int l=0; l<n; l++)
		{
			System.out.println(ans.get(l));
		}
	}
	

		
		
	
	
} 