import java.util.*;
import java.io.*;
public class CreateNewFile
{
	public static void main(String args[])throws IoException
	{
		File f=new File("D:\\GiriTechHub\\File_Handeling\\abc.txt");
		boolean result=f.createNewFile();
		if(result)
		{
			System.out.println("File created successfully");
		}
		else
		{
			System.out.println("There is some issue");
		}
	}
}
