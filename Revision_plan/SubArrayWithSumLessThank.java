/* Subarray Product < K
Example:
arr = [10, 5, 2, 6], K = 100
Valid subarrays: [10], [5], [2], [6], [5,2], [2,6], [5,2,6] = total 8

*/
public class SubArrayWithSumLessThank
{
	public static void main(String args[])
	{
		int arr[]={10,5,2,6};
		int k=100;
		int i=0,max=0;
		int j=0,sum=1,newSum=0,length=0;
		while(j<arr.length)
		{
			sum=sum*arr[j];
			
			while(sum>=k)
			{
				sum=sum/arr[i];
				i++;
			}
			length=j-i+1;
			int p=i,M=j;
			while(p<=M && sum<=k)
			{
				System.out.println(arr[p]);
				p++;
			}
			
			if(length>max)
			{
				max=length;
				newSum=sum;
			}
			
			
			
			j++;
			
		}
		System.out.println(newSum);
		System.out.println(length);
		
	}
}