/*Spiral Matrix*/
import java.util.*;
import java.util.List;
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0,left=0;
        int bottom=matrix.length-1;
        int right=matrix[0].length-1;
        ArrayList<Integer>ans=new ArrayList<>();
        while(top<=bottom && left<=right)
        {
            //for 1st row
            for(int i=left; i<=right; i++)
            {
                ans.add(matrix[top][i]);
            }
            //for 3rd column
            top++;
            for(int i=top; i<=bottom; i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            //for last Row
            if(top<=bottom)
            {
            for(int i=right; i>=left; i--)
            {
                ans.add(matrix[bottom][i]);
            }
            }
            //for upward
            bottom--;
            if(left<=right)
            {
            for(int i=bottom; i>=top; i--)
            {
                ans.add(matrix[i][left]);
            }

            }
            left++;
        }
        return ans;
        
    }
}
public class SpiralOrderMatrix
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);

	System.out.println("Enter the no.of rows:");
	int row=sc.nextInt();
	System.out.println("ENter the no.of columns:");
	int col=sc.nextInt();
	
	

	Solution obj=new Solution();

	int arr[][]=new int[row][col];

	System.out.println("Enter the Elements in the Array:");
	for(int i=0; i<arr.length; i++)
	{
		for(int j=0; j<arr[i].length; j++)
		{
			arr[i][j]=sc.nextInt();
		}
		
	}

	List<Integer>ans=obj.spiralOrder(arr);

	System.out.println("Final output of After performing the Operation is:");
	for(int I:ans)
	{
		System.out.println(I+" ");
	}
}
}