/*Q2. Create two ArrayLists containing integers. Merge them into a new ArrayList but avoid adding repeated numbers.
What you practice:
Merging lists
Checking for duplicates (contains)
Building logical flow to avoid sets
*/
import java.util.*;
public class MergeTwoArrayList
{
	public static void main(String args[])
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(20);
		arr.add(30);
		ArrayList<Integer>ans=new ArrayList<>();
		ans.add(30);
		ans.add(10);
		ans.add(50);
		ans.add(20);

		Collections.sort(arr);
	
		ArrayList<Integer>newArrayList=new ArrayList<>();
		/*for(int i=0; i<arr.size(); i++)
		{
			if(i>0 && arr.get(i)==arr.get(i-1))
			{
				continue;
			}
			else
			newArrayList.add(arr.get(i));			


		}
		for(int i=0; i<ans.size(); i++)
		{	boolean flag=true;
			for(int j=0; j<arr.size(); j++)
			{
				if(ans.get(i)==arr.get(j))
				{
					flag=false;
					break;
				}
			}
			if(flag==true)
			{
				newArrayList.add(ans.get(i));
			}
		}
		*/
		for(int i=0; i<arr.size(); i++)
		{
			if(!newArrayList.contains(arr.get(i)))
			{
				newArrayList.add(arr.get(i));
			}
		}
		
		for(int i=0; i<ans.size(); i++)
		{
			if(!newArrayList.contains(ans.get(i)))
			{
				newArrayList.add(ans.get(i));
			}
		}

		for(Integer i:newArrayList)
		{
			System.out.println(i);
		}

		
	}

}