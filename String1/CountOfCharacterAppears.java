/*Q21. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1*/
import java.util.*;
public class CountOfCharacterAppears
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		/*int arr[]=new int[256];
		for(int i=0; i<str.length(); i++)
		{
			arr[str.charAt(i)]=arr[str.charAt(i)]+1;
			
		}
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(arr[ch]!=0)
			{
				System.out.println(ch+" "+arr[ch]);
			}
			arr[ch]=0;
		}
		*/
		//OR
		LinkedHashMap<Character,Integer>ans=new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(!ans.containsKey(ch))
			{
				ans.put(ch,1);
			}
			else
			{
				ans.put(ch,ans.get(ch)+1);
			}
			
		}
		for(Map.Entry<Character,Integer>entry:ans.entrySet())
		{
			if(entry.getValue()>0)
			{
				System.out.println(entry.getKey()+" "+entry.getValue());
			}
		}
	}
}
