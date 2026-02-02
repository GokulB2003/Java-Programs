import java.util.*;
import java.io.*;
public class FileOP
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		File f=new File("D:\\GiriTechHub\\File_Handeling\\abcccc.txt");
		try
		{

		if(f.exists())
		{
			System.out.println("File is already Exists");
		}
		else
		{
			boolean ans=f.createNewFile();
			if(ans){
				System.out.println("File created Successfully:");
				}	
		}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}