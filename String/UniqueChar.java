/*. Print only unique characters while maintaining original order.
 Input : banana
 Output : ban
*/
import java.util.*;
public class UniqueChar
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String str:");
		String str=sc.nextLine();
		
		//LinkedHashSet<Character>set=new LinkedHashSet<>();
		boolean arr[]=new boolean[256];
		
		
		String newString="";
		for(int i=0; i<str.length(); i++)
		{
			if(arr[str.charAt(i)])
			{
				continue;
			}
			newString+=str.charAt(i);
			/*char ch=str.charAt(i);
			set.add(ch);*/
			arr[str.charAt(i)]=true;
		} 
		
		/*for(Character c:set)
		{
			newString+=c;
		}*/
		System.out.println(newString);
	}
}