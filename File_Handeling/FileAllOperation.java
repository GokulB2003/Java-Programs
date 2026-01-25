import java.util.*;
import java.io.*;
public class FileAllOperation
{
	public static void main(String args[])throws IOException
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\GiriTechHub\\File_Handeling\\abcc.txt");
		if(f.exists())
		{
			System.out.println("Already Exist");
		}
		else
		{
			boolean b=f.createNewFile();
			if(b)
			System.out.println("File created Successfully:");
			else
			System.out.println("there is some problem:");
			f.write("abc");
		}
		//f.close();
	}
}