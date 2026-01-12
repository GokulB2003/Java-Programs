import java.util.*;
public class MaxiSumSubarray
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,13,15,17,1};
        int k=2;
        int sum=0;
        int maxi=0;
        for(int i=0; i<k; i++)
        {
            sum+=arr[i];
            maxi=sum;
        }
        for(int i=k; i<arr.length; i++)
        {
            sum+=arr[i]-arr[i-k];
            if(sum>maxi)
            {
                maxi=sum;
            }
        }
        System.out.print(maxi);
    }
}