/*Container With most of water

Example
height = [1,8,6,2,5,4,8,3,7]
Maximum area = 49 (between indices 1 and 8: width 7, height min(8,7)=7 → 7*7 = 49)
*/
import java.util.*;

//optimal solution
public class ContainerWithMostOfWater
{
	public static int maximumWater(int height[])
	{
		int l=0,r=height.length-1,w=1,area=0,current=0;
		while(l<r)
		{
			w=r-l;
			int heightWater=Math.min(height[l],height[r]);
			area=w*heightWater;
			if(area>current)
			{
				current=area;
			}
			if(height[l]<height[r])
			{
				l++;
			}
			else
			{
				r--;
			}
		}
		return current;
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int height[]={1,8,6,2,5,4,8,3,7};
		int maxArea=maximumWater(height);
		System.out.println("Maximum Water can be stored in drum is:"+maxArea);
		
	}
}