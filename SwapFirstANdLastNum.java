import java.util.*;
public class SwapFirstANdLastNum
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int n=12345;
		int lastDigit=n%10;
		int temp=n;
		int count=0;
		int first=0;
		while(temp>10)//12
		{
			temp=temp/10;//1
			first=temp;//1
			count++;//4
		}
		int p=1;
		int tempC=count;
		while(count!=0)
		{
			p=p*10;
                        count--;
		}
		int middle=0;

		//12345/10000
		middle=n%p;
		//middle=2345
		
		//234
		//2340
		
		double total=lastDigit*p+middle/10*10+first;
		System.out.println("the number after swapping 1st and last is:"+total);
		
	}
}