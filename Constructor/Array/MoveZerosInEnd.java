/*Move Zeros to End
Move all 0s to the end of the array while maintaining the order of non-zero elements.
*/
import java.util.*;
public class MoveZerosInEnd
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int arr[]={0,1,0,0,4,0};
		
			int j=arr.length-1;
			for(int i=0; i<j;)
			{
				
				if(arr[i]==0)
				{		
					
					int k=i;
					while(k<j)
					{	
						arr[k]=arr[k+1];
						k++;
						
					}
					
					j--;//5
			}
				else
				{
				i++;
				}
			}
			for(int i=0; i<arr.length; i++)
			{
				System.out.print(arr[i]+" ");
			}			
		
	}
}