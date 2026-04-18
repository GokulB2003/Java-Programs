/*2. Count Vowels in File 
Description: 
Read file content and count vowels (a, e, i, o, u), ignoring case. 
Example: 
Hello Java 
Vowels → e, o, a, a 
Output: 4
*/
import java.util.*;
import java.io.*;
public class CountVowels
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the data in the File:");
		String data=sc.nextLine();
		try
		{
		File fa=new File("D:\\GiriTechHub\\File_Handeling\\abcdd.txt");
		FileWriter fw=new FileWriter(fa);
		fw.write(data);
		fw.close();
		FileReader f=new FileReader("D:\\GiriTechHub\\File_Handeling\\abcdd.txt");
		BufferedReader br=new BufferedReader(f);
		
		
		String str;
		int ct=0,cnt=0;
		while((str=br.readLine())!=null)
		{
			String arr[]=str.split(" ");
			for(int i=0; i<arr.length; i++)
			{
				
				String name=arr[i];
				if(name!=" ")
				{
				for(int j=0; j<name.length(); j++)
					{
						if(name.charAt(i)=='a' || name.charAt(i)=='e' || name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u')
					{
					 cnt++;
					}

					}
				}
				
			}
		}
		br.close();
		
		}
		catch(Exception e)
		{	
			System.out.println(e);
		}
		
		
	}
}