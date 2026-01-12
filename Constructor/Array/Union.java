import java.util.*;
public class Union
{
    public static void main(String args[])
    {
        int arr[]={1,2,3,4};
        int arr2[]={5,6,2,1};
        int arr3[]=new int[arr.length+arr2.length];
        for(int i=0; i<arr.length-1; i++)
        {
            if(i>0 && arr[i]==arr[i-1])continue;
            if(arr[i]!=arr[i+1])
            {
                arr3[k]=arr[i];
                k++;
            }

        }
        int n=k;
        for(int i=0; i<arr2.length; i++)
        {
            if(arr[i]==arr3[i])
            {
                flag=false;
            }
        }
        if(flag==false)
        {
            
        }

    }
}
