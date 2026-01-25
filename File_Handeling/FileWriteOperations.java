import java.util.*;
import java.io.*;
import java.io.IOException;
public class FileWriteOperations
{
	public static void main(String args[])
	{
		File f=new File("D:\\GiriTechHub\\File_Handeling\\a.txt");
		
		try{

		if(f.exists())
		{
			System.out.println("File is Alredy Exist");
		}
		else
		{
			f.createNewFile();
		}
			FileWriter f1=new FileWriter(f,true);
			f1.write(65);
			f1.write("File Handeling Concept:");
			char ch[]={'a','b','c','d','e','f'};
			f1.write(ch);
			f1.write(ch,1,3);
			f1.append("hello");
			System.out.println("Data written successFully:");
		
			f1.close();
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
		//Write data inside the file.

		
	}
	
}