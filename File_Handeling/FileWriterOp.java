import java.util.*;
import java.io.*;
public class FileWriterOp
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	File f=new File("D:/GiriTechHub/File_Handeling/Demo1234/abc.txt");
	
	if(f.exists())
	{
		System.out.println("File is already Exist:");
		
		try
		{
			FileWriter fi=new FileWriter("D:/GiriTechHub/File_Handeling/Demo1234/abc.txt");
			BufferedWriter bf=new BufferedWriter(fi);
			//Scanner sc=new Scanner(System.in);
			String data=sc.nextLine();
			bf.newLine();
			bf.write(data);
			bf.close();
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
	}
	else
	{      try
		{
	       	Boolean result=f.createNewFile();
		if(result)
		{		
			System.out.println("File created successfully:");
			FileWriter file=new FileWriter("D:/GiriTechHub/File_Handeling/Demo1234/abc.txt");
		String data=sc.nextLine();
		file.write(data);
		file.close();
		System.out.println("Data added Sucessfully:");
		}
		else
		{
			System.out.println("there is some problem");
		}
		}catch(IOException e)
		{
			System.out.println(e);
		}
	}
	}
}