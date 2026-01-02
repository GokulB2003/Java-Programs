/*Q3.Take an ArrayList of integers, convert it to a Vector, then sort the Vector in ascending order manually (without using Collections.sort).
What you practice:
ArrayList → Vector conversion
Manual sorting (bubble sort / selection sort)
Vector methods like add(), get(), set()
*/

import java.util.*;
public class ArrayListToVectorSort
{
	public static void main(String args[])
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(10);
		arr.add(20);
		arr.add(30);
		arr.add(2);
		Vector<Integer>v=new Vector<>(arr);
		for(int i=0; i<v.size()-1; i++)
		{
			int minIndex=i;
			for(int j=i+1; j<v.size(); j++)
			{
				if(v.get(j)<v.get(minIndex))
				{
					minIndex=j;
				}
		}
		if(minIndex!=i)
		{
			int temp=v.get(minIndex);
			v.set(minIndex,v.get(i));
			v.set(i,temp);
		}

	}
	for(Integer i:v)
	{
		System.out.println(i);
	}

    }
	
}