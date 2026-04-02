/*Remove spaces...*/
import java.util.*;
public class RemoveSpaces
{
	public static void main(String args[])
	{
		String str="hello world";
		StringBuilder sb=new StringBuilder();
		String arr[]=str.split(" ");
		for(int i=0; i<arr.length; i++)
		{
			sb.append(arr[i]);
		}
		System.out.println(sb);
	}
}