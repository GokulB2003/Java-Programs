import java.util.*;
import java.io.*;
public class FileReadWrite
{
	public static void main(String args[])
	{
		try
		{
		FileReader f=new FileReader("D:/GiriTechHub/File_Handeling/a.txt");
		BufferedReader r=new BufferedReader(f);
		String data;
		
			while((data=r.readLine())!=null)
			{
				System.out.println(data);
			}
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
	}
}