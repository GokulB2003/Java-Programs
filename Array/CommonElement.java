import java.util.*;
public class CommonElement
{
	public static void main(String args[])
	{
		int arr1[]={10,10,20,30,30,50,50};
		int arr2[]={10,10,30,50,20};
		for(int i=0; i<arr1.length; i++)
		{
			if(i>0 && arr1[i]==arr1[i-1])continue;
			for(int j=0; j<arr2.length; j++)
			{
				if(arr1[i]==arr2[j])
				{
					System.out.println(arr1[i]);
					break;
				}
			}
		}
	}
}