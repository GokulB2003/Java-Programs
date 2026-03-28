import java.util.*;
public class RemoveDuplicates
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50,50,60,60};
		Arrays.sort(arr);
		LinkedHashSet<Integer>ans=new LinkedHashSet<>();
		for(int i=0; i<arr.length; i++)
		{
			ans.add(arr[i]);
		}
		for(Integer i:ans)
		{
			System.out.println(i);
		}
		System.out.println(ans.size());
				
	}
}