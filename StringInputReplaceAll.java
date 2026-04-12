import java.util.*;
public class StringInputReplaceAll
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String line=s.replace("[","").replace("]","");
		String arr[]=line.split(",");
		int arr1[]=new int[arr.length];
		for(int i=0; i<arr.length; i++)
		{	
			int num=Integer.parseInt(arr[i]);
			arr1[i]=num;
		}
		
		int sum=0;
		for(int j=0; j<arr1.length; j++)
		{
			sum+=arr1[j];
		}
		System.out.println(sum);
	}
}