/*Find Max Average of Subarray of Size K
Find the maximum average of any subarray of size k.
arr = [1, 12, -5, -6, 50, 3]
k = 4
output:12 75
*/
public class MaxAvGOfSizeK
{
	public static void main(String args[])
	{
		int arr[]=new int[]{1,2,3,4,5};
		
	        double avg=0.0;
		double sum=0;
		int k=2;
		for(int i=0; i<k; i++)
		{
			sum+=arr[i];	
		}
		avg=(double)(sum/k);
		double maxi=avg;
		for(int i=k; i<arr.length; i++)
		{
			sum+=arr[i];
			sum=sum-arr[i-k];
			avg=(double)(sum/k);
			

			if(avg>maxi)
			{
				maxi=avg;
			}
			//sum += arr[i] - arr[i - k];
			
		}
		System.out.println(maxi);
	}
}

