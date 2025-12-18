/*Intersection*/
import java.util.*;
public class Intersection
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr1[]={10,10,30,40,40,40};
	int arr2[]={1,2,2,4,10,40,40,50};
		
	for(int i=0; i<arr1.length; i++)
	{	int count=1;
		if(i>0 && arr1[i]==arr1[i-1])
		{
			continue;
		}

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