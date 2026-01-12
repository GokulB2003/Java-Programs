public class SortUsingOnlyoneLoop{
    public static void main(String[] args) {
        int arr[] = {5, 3, 1, 4, 2};
        int i = 0;

        while (i < arr.length - 1) {
            if (arr[i] > arr[i + 1]) {
                // swap
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                // reset i to start again
                i = 0;
            } else {
                i++;
            }
        }

        System.out.print("Sorted array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
    }
}
