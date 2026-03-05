import java.util.*;
import java.io.*;
public class FileOp
{
	public static void main(String args[])
	{
		File f=new File("D:/SQL1/10.association/1.one_to_one_Association/demo/memo-1");
	if(f.exists())
	{
		
		if(f.isDirectory())
		{
			System.out.println("Folder Alredy Exist");
		}
		else if(f.isFile())
		{
			System.out.println("File");
		}
	}
	else
	{
		boolean b=f.mkdir();
		if(b)
		{
			System.out.println("Folder created Sucessfully");
			File s=new File("D:/SQL1/10.association/1.one_to_one_Association/demo/demo.txt");
			if(s.exists())
			{
				System.out.println("File is Alredy Exist");
			}
			else
			{
				try
				{
				boolean createfile=s.createNewFile();
				if(createfile)
				{
					System.out.println("File created successFully");
				}
				else
				{	
					System.out.println("There is some problem to create a file:");
				
				}
				}
				catch(IOException e)
				{
					System.out.println(e);
				}
			}
		}
		else
		{
			System.out.println("There is some problem to create the folder:");
		}
	}
	}
}