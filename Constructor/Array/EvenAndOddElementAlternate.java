/*. Rearrange the array so that even and odd numbers alternate. Assume the number of even and odd 
elements is equal. 
 Input :- arr = [1, 2, 3, 4, 5, 6] 
 Output :-  [2, 1, 4, 3, 6, 5] 
*/

import java.util.*;
public class EvenAndOddElementAlternate
{
	public static void main(String args[])
	{
		int arr[]={1,2,3,4,5,6};
		int newArr[]=new int[arr.length];
		int k=0;
		int m=1;
		int i=0;
		while(i<newArr.length)
		{
			if(arr[i]%2==0)
			{
				newArr[k]=arr[i];
				k=k+2;
			}
			else
			{
				newArr[m]=arr[i];
				m=m+2;
			}
			i++;
		}
		for(int j=0; j<newArr.length; j++)
		{
			System.out.print(newArr[j]+" ");
		}
	}
} 