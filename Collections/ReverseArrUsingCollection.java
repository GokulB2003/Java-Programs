/*Q8. Write a java program to Reverse an integer ArrayList without using inbuilt reverse method.
Explanation:
 This improves:
Index manipulation
Swapping logic
Understanding list size
*/
import java.util.*;
public class ReverseArrUsingCollection
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		ArrayList arr=new ArrayList();
		System.out.println("Enter the Elements in the Array:");
		for(int i=0; i<5; i++)
		{
			Object val=sc.nextInt();
			arr.add(val);
		}
		
		//Reverse Logic
		
		int s=0;
		int e=arr.size()-1;
		while(s<=e)
		{
			int temp=(int)arr.get(s);
			arr.set(s,(int)arr.get(e));
			arr.set(e,temp);
			s++;
			e--;
		}
		ListIterator i=arr.listIterator();
		//to print the Array..
		System.out.println("After reversing the Array:");
		while(i.hasNext())
		{
			Object obj=i.next();
			System.out.println(obj);
		}

	}
}