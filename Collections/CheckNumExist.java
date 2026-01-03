/*Q6. Write a java program to Check whether a given number exists in an ArrayList.
Explanation:
 You learn:
Linear search logic
Use of flag variable
Comparison using loop
*/

import java.util.*;
public class CheckNumExist
{
	public static void main(String args[])
	{
		ArrayList<Integer>ans=new ArrayList<>();
		ans.add(10);
		ans.add(14);
		ans.add(39);
		ans.add(90);
		int target=14;
		Boolean flag=false;
		/*By using List Iterator...*/

		ListIterator i=ans.listIterator();
		while(i.hasNext())
		{
			Object obj=i.next();
			if((int)obj==target)
			{
				flag=true;
			}

		}
		/*for(int i=0; i<ans.size(); i++)
		{
			if(ans.get(i)==target)
			{
				flag=true;
			}	
		}*/
		if(flag==true)
		{
			System.out.println("Element exist");
		}
		else
		{
			System.out.println("Element not exist");
		}

		//or by using contains method
		boolean a=ans.contains(target);
		/*if(a)
		{
			System.out.println("Element is Exist:");
		}
		else
		{
			System.out.println("Element not exist:");
		}*/
	}
}