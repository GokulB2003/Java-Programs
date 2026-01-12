/*
Leetcode

You are given an integer array height of length n. There are n vertical lines drawn such that the two endpoints of the ith line are (i, 0) and (i, height[i]).

Find two lines that together with the x-axis form a container, such that the container contains the most water.

Return the maximum amount of water a container can store.

Notice that you may not slant the container.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
Example 2:

Input: height = [1,1]
Output: 1
 
*/
class Solution {
    public int maxArea(int[] height) {
        if(height.length==2)
        {
            return Math.min(height[0],height[1]);
        }
        int l=0,r=height.length-1,width=1,area=1,Maxa=Integer.MIN_VALUE,h=0;
        while(l<r)
        {
            h=Math.min(height[l],height[r]);
            width=r-l;
            area=width*h;
            if(area>Maxa)
            {
                Maxa=area;
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
        return Maxa;

        
    }
}

public class ContainerWithMostWater {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        // Example test case
        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        
        int result = sol.maxArea(height);
        System.out.println("Maximum area: " + result);
    }
}
