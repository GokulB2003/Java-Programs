/*Q28. Write a java program to Check character whose frequency is 1 and appears first.
 Input : swiss
 Output : w
*/
import java.util.*;
public class CheckCharacterFrequency
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		LinkedHashMap<Character,Integer>ans=new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++)
		{
			if(!ans.containsKey(str.charAt(i)))
			{
				ans.put(str.charAt(i),1);
			}
			else
			{
				ans.put(str.charAt(i),ans.get(str.charAt(i))+1);
			}
		}
		char newchar=' ';
		int minv=Integer.MAX_VALUE;
		for(Map.Entry<Character,Integer>s:ans.entrySet())
		{
			if(s.getValue()==1)
			{
				char ch=s.getKey();
				for(int i=0; i<str.length(); i++)
				{
					if(ch==str.charAt(i))
					{
						if(i<minv)
						{	
							newchar=ch;
							minv=i;
						}
					}
				}
			}
		}
		System.out.println(newchar);
	}
	
}