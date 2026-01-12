/*Q4. WAP to create two matrix of 3 x 3 and perform matrix multiple on two matrix and store its result in 3rd matrix
*/
import java.util.*;
public class MatrixMul
{
	public static void main(String args[])
	{
		int arr1[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		int arr2[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
		int arr3[][]=new int[3][3];
		int k=0;
		for(int i=0; i<arr1.length; i++)
		{
			int sum=0;
			for(int j=0; j<arr1.length; j++)
			{
				sum+=arr1[i][j]*arr2[j][i];

			}
			if(k<arr1.length)
			{
			arr3[i][k]=sum;
			k++;
			}
			else
			{
				k=0;
			}
		}

		for(int i=0; i<arr3.length; i++)
		{
			for(int j=0; j<=arr3.length-1; j++)
			{
				System.out.print(arr3[i][j]+" ");
			}
		}
		

			
	}
}