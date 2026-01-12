/* WAP to create create matrix of 3 x 3 and sort the Row data  and display it
*/
import java.util.*;
public class SortColmnInMatrix
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr1[][]={
				
				{16,2,0},
				{4,3,9},
				{12,90,1}
				};
				
				//by using Inbuilt Method
				for(int i=0; i<arr1.length; i++)
				{
					Arrays.sort(arr1[i]);
				}
					//or 
				//Arrays.sort(arr1[1]);
			       /*for(int i=0; i<arr1.length; i++)
				{
					for(int j=0; j<arr1[i].length-1; j++)
					{
						for(int k=0; k<arr1[i].length-1; k++)
						{
						//System.out.print(arr1[i][j]+" ");
							if(arr1[i][k]>arr1[i][k+1])
							{
								int temp=arr1[i][k];
								arr1[i][k]=arr1[i][k+1];
								arr1[i][k+1]=temp;
							}
						}
					}
					
				}
				*/
				System.out.println(Arrays.deepToString(arr1));
				
				
	}
}