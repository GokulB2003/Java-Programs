/*Q12. Write a program in java to find the Floor and Ceil of the number 0 to 10 from a sroted array.
Expected Output :
 The given array is : 1 3 5 7 8 9
 Number: 0 ceiling is: 1 floor is: -1
 Number: 1 ceiling is: 1 floor is: 1
 Number: 2 ceiling is: 3 floor is: 1
 Number: 3 ceiling is: 3 floor is: 3
 Number: 4 ceiling is: 5 floor is: 3
 Number: 5 ceiling is: 5 floor is: 5
 Number: 6 ceiling is: 7 floor is: 5
 Number: 7 ceiling is: 7 floor is: 7
 Number: 8 ceiling is: 8 floor is: 8
 Number: 9 ceiling is: 9 floor is: 9
 Number: 10 ceiling is: -1 floor is: 9
*/

import java.util.*;
public class FloorAndCeilInArray
{
	public static void main(String args[])
	{
		int floor=-1,ceil=-1;
		int arr[]={1,3,5,7,8,9};
		Arrays.sort(arr);
		for(int i=0; i<10; i++)
		{
			int j=0;
			while(j<arr.length)
			{
				if(arr[j]==i)
				{
					floor=ceil=arr[j];
					break;	
				}
				else if(arr[j]<i)
				{
					floor=arr[j];
					
				}
				else if(arr[j]>i && ceil==-1)
				{
					ceil=arr[j];
				}

				j++;
			}
			
			System.out.println("Number is:"+i+"\tfloor is:"+floor+"\tceil is"+ceil);
			i++;
		}
	}
}