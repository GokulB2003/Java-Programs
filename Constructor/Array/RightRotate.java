/*Right Rotate an Array by 1 or K Positions
*/
import java.util.*;
class Rotate
{
	public void rotate(int arr[],int start,int end)
	{
		while(start<=end)
		{
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
			start++;
			end--;
		}
	}
	public void printArray(int arr[])
	{
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}
	}
}
public class RightRotate
{
	//Right rotated array by 2 positions: [40, 50, 10, 20, 30]

	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		Rotate obj=new Rotate();
		int arr[]={10,20,30,40,50};
		int k=2;
		obj.rotate(arr,0,4);
		obj.rotate(arr,0,k-1);
		obj.rotate(arr,k,4);
		obj.printArray(arr);
		
		
	}
}