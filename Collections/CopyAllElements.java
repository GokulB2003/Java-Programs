/*Q9. Write a java program to Copy all elements from one integer ArrayList to another.
Explanation:
 This practices:
Working with multiple ArrayList objects
Element-by-element copying
*/
import java.util.*;
public class CopyAllElements
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr1=new ArrayList();
		System.out.println("Enter the size of the Array:");
		int n=sc.nextInt();
	
		for(int i=0; i<n; i++)
		{
			int val=sc.nextInt();
			arr1.add(val);
		}
		ArrayList arr2=new ArrayList();
		for(int i=0; i<arr1.size(); i++)
		{
			arr2.add(arr1.get(i));
		}
		Iterator i=arr2.iterator();
		while(i.hasNext())
		{
			Object val=i.next();
			System.out.println(val);
		}
	}
}