import java.util.*;
public class DecimalToBinary
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number n:");
		int n=sc.nextInt();
		String binary="";
		while(n!=0)
		{
			int rem=n%2;
			char ch=(char)(rem+'0');
			binary+=ch;
			n=n/2;
		}
		String r=reverse(binary);
		System.out.println(r);
	}
	public static String reverse(String binary)
	{
		String str="";
		for(int i=binary.length()-1; i>=0; i--)
		{
			str+=binary.charAt(i);
		}
		return str;
		
	}
}