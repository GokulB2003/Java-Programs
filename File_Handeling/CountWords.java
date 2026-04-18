import java.util.*;
import java.io.*;

public class CountWords
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Data in file:");
		String data=sc.nextLine();
				
		try
		{

		File newf=new File("D:\\GiriTechHub\\File_Handeling\\abcdd.txt");
		boolean p=newf.createNewFile();
		
		FileWriter fw=new FileWriter("D:\\GiriTechHub\\File_Handeling\\abcdd.txt");
		fw.write(data);
		fw.close();
		FileReader f=new FileReader(newf);
		BufferedReader fr=new BufferedReader(f);

		String line;
		int wordcnt=0;
		while((line=fr.readLine())!=null)
		{
			String word[]=line.trim().split("\\s+");
			if(!(line.trim().isEmpty()))
			{
				wordcnt+=word.length;
			}
		};
		
		fr.close();
	        System.out.println(wordcnt);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
					
		
	}
}