/*Print array elements at even indices.
Input: arr = [4, 9, 7, 11, 6]
Output: 4 7 6
*/
import java.util.*;
public class EvenIndicesElement
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int size=sc.nextInt();
		int arr[]=new int[size];
		System.out.println("Enter the elements in array:");
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(i%2==0)
			{
				System.out.print(arr[i]+" ");
			}	
		}
	}
}
