
import java.util.*;
public class CheckSeries
{

	public static boolean isPrime(int n)
    {
        if(n < 2) return false;
        for(int i=2;i<=n/2;i++)
        {
            if(n % i == 0)
                return false;
        }
        return true;
    }
	public static void main(String args[])
	{

		int arr[] = {5732,8659,2534,9625,7354,1325};
		 for(int num : arr)
        {
            int temp=num;
            String prime="";

            while(temp>0)
            {
                int d=temp%10;

                if(isPrime(d))
                    prime=d+prime;

                temp/=10;
            }

            System.out.print(prime+" ");
        }
	}
}