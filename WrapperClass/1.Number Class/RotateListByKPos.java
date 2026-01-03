/*Q7. Given an ArrayList and a value k, rotate the list to the right by k positions:
 Example: [1,2,3,4,5], k=2 → [3,4,5,1,2]
What you practice:
Modular arithmetic
Using temporary lists
Index manipulation
*/
import java.util.*;
public class RotateListByKPos
{
	public static void main(String args[])
	{
		ArrayList<Integer>arr=new ArrayList<>();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		int k=2;
		System.out.println("After rotate the Array:");
		rotateArr(arr,0,arr.size()-1);
		rotateArr(arr,0,k);
		rotateArr(arr,k+1,arr.size()-1);
		printArr(arr);
	}
	public static void rotateArr(ArrayList arr,int start,int end)
	{
		while(start<=end)
		{
			int temp=(int)arr.get(start);
			arr.set(start,(int)arr.get(end));
			arr.set(end,temp);
			start++;
			end--;
		}
	}
	
	public static void printArr(ArrayList arr)
	{
		for(Object obj:arr)
		{
			System.out.println(obj);
		}
	}
}