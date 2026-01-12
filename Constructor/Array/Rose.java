import java.util.*;

public class Rose {
    public static void main(String[] args) {
        int arr[] = {10,10,10,20,20,20};
        Arrays.sort(arr);

        System.out.println("Duplicate elements are:");
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i + 1]) {
                System.out.println(arr[i]);
                // skip all same elements
                while (i < arr.length - 1 && arr[i] == arr[i + 1]) {
                    i++;
                }
            }
        }
    }
}
