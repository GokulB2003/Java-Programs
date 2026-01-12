/*. WAP to create two matrix of 3 x3  and calculate addition of two matrix and store in third matrix
*/
import java.util.*;
public class AdditionOfTwoMatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
			int arr1[][]={
				{1,2,3},
				{4,5,6},
				{7,8,9}
				};
			int arr2[][]={
				{10,11,12},
				{13,14,15},
				{16,17,18}
				};
			int add[][]=new int[3][3];
			for(int i=0; i<arr1.length; i++)
			{
				for(int j=0; j<arr2.length; j++)
				{
					add[i][j]=arr1[i][j]+arr2[i][j];
				}
			}
			for(int i=0; i<add.length; i++)
			{
				for(int j=0; j<add.length; j++)
				{
					System.out.print(add[i][j]+" ");
				}
				System.out.println();
			}
		
			
	}
}