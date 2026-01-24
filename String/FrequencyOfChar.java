/*. Traverse the string and count how many times each character appears.
 Input : programming
 Output : p=1 r=2 o=1 g=2 a=1 m=2 i=1 n=1
*/
import java.util.*;
public class FrequencyOfChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		/*LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		for(int i=0; i<str.length(); i++)
		{	char ch=str.charAt(i);
			if(ch!=' ')
			{
				if(map.containsKey(ch))
				{	
					int val=map.get(ch);
					val++;
					
					
						map.put(ch,val);
					
				
				}
				else
				{
					map.put(ch,1);	
				}
			//Set<Map.Entry>s:map.entrySet();
			
			}
		}
		for(Map.Entry<Character,Integer>i:map.entrySet())
		{
			System.out.println(i.getKey()+":"+i.getValue());
		}
		*/
		int arr[]=new int[26];
		for(int i=0; i<str.length(); i++)
		{
			char ch=str.charAt(i);
			if(str.charAt(i)!=' ')
			//arr[ch-'a']=arr[ch-'a']+1;
			arr[ch-'a']++;
			
			
		}
		for(int i=0; i<26; i++)
		{
			if(arr[i]>0)
			System.out.println((char)(i+'a')+":"+arr[i]);
		}
		
		
		
	}
}