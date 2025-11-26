//delete an Element
import java.util.*;
public class DeleteAnEle
{
	public static void main(String args[])
	{
	int arr[]={1,2,3,4,5};
	int k=2;
	int i=k;
	while(i<arr.length-1)
	{
		arr[i]=arr[i+1];
		i++;
	}
	for(int j=0; j<arr.length-1; j++)
	{
		System.out.print(arr[j]+" ");
	}
	}
}
