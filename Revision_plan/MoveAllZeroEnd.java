/*Move all 0’s to the end of the array without changing the order of non-zero elements.
Input: arr = [0, 1, 0, 3, 12]
Output: arr = [1, 3, 12, 0, 0]
*/
import java.util.*;
public class MoveAllZeroEnd
{
public static void main(String args[])
{
	int arr[]={0,1,0,3,12};

	//using ArrayList
	/*ArrayList<Integer>ans=new ArrayList<>();
	for(int i:arr)
	{
		if(i!=0)
		{
			ans.add(i);
		}
		
	}
	for(int i:arr)
	{
		if(i==0)
		{
			ans.add(i);
		}
	}

	for(int i:ans)
	{
		System.out.print(i);
	}
	*/
	//without using Collections

	int i=0;
	int k=arr.length-1;
	while(i<k)
	{
		if(arr[i]==0)
		{
			int j=i+1;
		
			while(j<=k)
			{
				arr[j-1]=arr[j];
				j++;
					
			}
			arr[k]=0;
			k--;
			i=0;
		}
		else
		{
		i++;
		}
	}
		for(int p=0; p<arr.length; p++)
	{
		System.out.println(arr[p]);
	}
	
}
}