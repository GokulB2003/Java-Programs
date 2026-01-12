/*Minimum Sum Subarray of Size K
Find the minimum sum of a subarray with size k.*/
public class MiniSumSubArr
{
	public static void main(String args[])
	{
		//Scanner sc=new Scanner(System.in);
		int arr[]={10,30,20,50,1,4};
		int k=3,sum=0;
		int mini=Integer.MAX_VALUE;
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];
			mini=sum;
			
			
		}
		for(int i=k; i<arr.length; i++)
		{
			sum=sum+arr[i]-arr[i-k];
			if(sum<mini)
			{
				mini=sum;
			}
		}
		System.out.println(mini);
	}
}