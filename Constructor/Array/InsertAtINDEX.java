/*Q14. Write a java program to insert value at specific index of array.
Input : 1 2 3 4 5
Index : 2
Value : 200
Output : 1 2 200 3 4 5

*/
import java.util.*;
public class InsertAtINDEX
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[]{1,2,2,4,5,0};
        int val=200;
        int k=2;
        System.out.println("Enter the size of the array");
        int size=sc.nextInt();
        System.out.println("enter the elements in array");
        for(int i=0; i<arr.length; i++)
        {   
            arr[i]=sc.nextInt();
        }

        int p=arr.length-2;//3

        while(p>=k)//4 3 2
        {
            arr[p+1]=arr[p];
            p--;
        }
        arr[k]=val;
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }


    }
}