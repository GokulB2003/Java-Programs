import java.util.*;
public class InsertAtSpecificPosistion
{
	public static void main(String args[])
	{
		int arr[]={10,20,30,40,50};
		int index=2;
		int i=arr.length-2;
		while(i>=index)
		{
			arr[i+1]=arr[i];
			i--;
		}
		arr[i+1]=300;
		
		for(int j=0; j<arr.length; j++)
		{
			System.out.println(arr[j]);
		}
	}
	
}