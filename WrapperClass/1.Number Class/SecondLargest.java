/*Q5. Take an integer array, store it in a Vector, and determine the second largest number without sorting.
What you practice:
Max/second-max tracking
Using Vector get() method
Efficient single-pass logic
*/
import java.util.*;
public class SecondLargest
{
	public static void main(String args[])
	{
		int smax=0;
		int max=Integer.MIN_VALUE;
		int arr[]=new int[]{10,20,40,14,48};
		Vector v=new Vector();
		for(int i=0; i<arr.length; i++)
		{
			v.add(arr[i]);

		}
		for(int i=0; i<v.size(); i++)
		{
			if((int)v.get(i)>max)
			{
				smax=max;
				max=(int)v.get(i);
			}
			else if((int)v.get(i)>smax && (int)v.get(i)!=max)
			{
				smax=(int)v.get(i);
			}
		}
		System.out.println("MaxiMum Element is:"+max);
		System.out.println("Second maximum Element is:"+smax);
	}
}