/*
ReadLine
*/
import java.util.*;
import java.io.*;
public class CopyData
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		
		try
		{
		File f=new File("D:\\GiriTechHub\\Revision_plan\\abc.txt");
		File fs=new File("D:\\GiriTechHub\\Revision_plan\\abcd.txt");
		Boolean result=f.createNewFile();
		boolean second=fs.createNewFile();
		if(second)
		{
			System.out.println("File created a sussfully:");
		}
		FileWriter wr=new FileWriter("D:\\GiriTechHub\\Revision_plan\\abcd.txt");
		
		FileReader fr=new FileReader("D:\\GiriTechHub\\Revision_plan\\abc.txt");

		if(result)
		{
			
			System.out.println("Enter the data to insert into the file:");
			String str=sc.nextLine();
			wr.write(str);
		
		}	
		BufferedReader bf=new BufferedReader(fr);
		BufferedWriter br=new BufferedWriter(wr);
		String data;
		while((data=bf.readLine())!=null)
		{
			
			bf.write(data);
			fr.newLine();
		}		
		
		int d;
		while((d=fr.read())!=-1)
		{
			System.out.println((char)(d));
		}
		}
		catch(IOException e)
		{
			System.out.println("IOException");
		}
		
	}
}