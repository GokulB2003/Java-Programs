import java.util.*;

public class IntersectionOftwoArrays {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int arr1[]={6,2,2,3,4,5};
        int arr2[]={2,2,3,5,6};
        int i=0,j=0;
         while (i < arr1.length - 1) {
            if (arr1[i] > arr1[i + 1]) {
                // Swap adjacent elements
                int temp = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = temp;

                // Reset i to start checking from the beginning
                i = 0;
            } else {
                i++; // move forward if in correct order
            }
        }
        
        Arrays.sort(arr2);
      
        i=1;
        j=0;
        while(i<arr1.length)
        {
            j=0;
            if(arr1[i]!=arr1[i-1])
            {
                while(j<arr2.length)
                {
                    if(arr1[i]==arr2[j])
                    {
                        System.out.println(arr1[i]);
                        break;
                    }
                    j++;
                }
            }
            i++;
        }
    }
}
