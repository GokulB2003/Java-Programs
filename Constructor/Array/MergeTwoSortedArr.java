/*Merge Two Sorted Arrays (No Extra Space)
Merge two sorted arrays in-place using the two-pointer method*/
import java.util.*;
public class MergeTwoSortedArr
{
   public static void main(String args[])
    {
	Scanner sc=new Scanner(System.in);
	int arr1[]={1,3,4,5,6};
	int arr2[]={7,8,9};
	int arr3[]=new int[arr1.length+arr2.length];
	int j=0,k=0;
	//System.out.println(arr3.length);
	for(int i=0; i<arr3.length; i++)
	{	if(i<arr1.length)//5 //3
		{
			arr3[j]=arr1[i];//1 3  4 5 6   
			j++;//2 //3 4
		}
		else
		{
			arr3[i]=arr2[k];
			//System.out.println(arr2[k]);
			k++;		
		}
		
	}
	//System.out.println(arr3.length); 
	for(int i=0; i<arr3.length; i++)
	{
		System.out.println(arr3[i]+" ");
	}


	//or
	//smaller in orray and all larger in another array
	/*import java.util.Arrays;

public class MergeSortedArrays {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;
        
        int i = n - 1; // last index of arr1
        int j = 0;     // first index of arr2
        
        // Step 1: Swap elements if arr1[i] > arr2[j]
        while (i >= 0 && j < m) {
            if (arr1[i] > arr2[j]) {
                // Swap
                int temp = arr1[i];
                arr1[i] = arr2[j];
                arr2[j] = temp;
            }
            i--;
            j++;
        }
        
        // Step 2: Sort both arrays
        Arrays.sort(arr1);
        Arrays.sort(arr2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 5, 9, 10, 15, 20};
        int[] arr2 = {2, 3, 8, 13};
        
        merge(arr1, arr2);
        
        System.out.println("Array 1: " + Arrays.toString(arr1));
        System.out.println("Array 2: " + Arrays.toString(arr2));
    }
}
 */
    }
}