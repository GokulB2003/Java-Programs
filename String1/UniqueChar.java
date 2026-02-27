/*Print only unique characters while maintaining original order.
 Input : banana
 Output : ban
*/
import java.util.*;
public class UniqueChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		LinkedHashMap<Character,Integer>map=new LinkedHashMap<>();
		String newStr="";
		/*for(int i=0; i<str.length(); i++)
		{	
			char ch=str.charAt(i);
			if(!map.containsKey(ch))
			{
				newStr+=ch;
				map.put(ch,1);
			}
			else
			{
				map.put(ch,map.get(ch)+1);
			}
			
		}
		
		*/

			for(int i=0; i<str.length(); i++)
			{
				if(str.indexOf(str.charAt(i))==i)
				{
					newStr+=str.charAt(i);
				}
			}

			System.out.println(newStr);
	}
}