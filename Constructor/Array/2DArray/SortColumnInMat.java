/*WAP to create create matrix of 3 x 3 and sort the column data  and display it*/
import java.util.*;
public class SortColumnInMat
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr1[][]={
				{1,4,2},
				{8,10,23},
				{25,3,6}
			      };
			for(int i=0; i<arr1.length-1; i++)
			{
				for(int j=0; j<arr1.length; j++)
				{
					for(int k=0; k<arr1[j].length-1; k++)
					{
						if(arr1[k][j]>arr1[k+1][j])
						{
							int temp=arr1[k][j];
							arr1[k][j]=arr1[k+1][j];
							arr1[k+1][j]=temp;
						}
					
							
					}
				}

			}
				for(int i=0; i<arr1.length; i++)
				{
					for(int j=0; j<=arr1[0].length-1; j++)
					{
						System.out.print(arr1[i][j]+" ");
					}
					System.out.println();
				}
			}	
}