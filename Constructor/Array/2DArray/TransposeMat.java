/*Q3.WAP to create matrix of 3 x 3 and transpose it means convert row to column and column to row
*/
import java.util.*;
public class TransposeMat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[][]=
			{
				{1,2,3},
				{4,5,6},
				{7,8,9}
			};
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<arr.length; j++)
				{
					arr[i][j]=arr[j][i];	
				}
			}
			for(int i=0; i<arr.length; i++)
			{
				for(int j=0; j<=arr.length-1; j++)
				{
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
	}
}