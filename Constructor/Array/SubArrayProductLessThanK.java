/*Subarray Product < K
*/
import java.util.*;
public class SubArrayProductLessThanK
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	int arr[]={10,5,2,6};
	int k=100;
	int count=0,l=0,r=0,prod=1;
	while(r<arr.length)
	{
		prod=prod*arr[r];
		//System.out.print("[");
				//if(prod>k)
		while(prod>=k && l<r){
			prod=prod/arr[l];
			l++;
		}
		count+=r-l+1;
		r++;
		
	}
	System.out.println(count);

}
}
