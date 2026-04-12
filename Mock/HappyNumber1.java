import java.util.Scanner;

public class HappyNumber1 {

    // method to calculate sum of squares of digits
    static int getSumOfSquares(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum = sum + (digit * digit);
            num = num / 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = num;

        // repeat until result becomes 1 or 4
        while (result != 1 && result != 4) {
            result = getSumOfSquares(result);
        }

        if (result == 1) {
            System.out.println(num + " is a Happy Number");
        } else {
            System.out.println(num + " is NOT a Happy Number");
        }
    }
}
