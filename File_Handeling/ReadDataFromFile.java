import java.util.*;
import java.io.*;
public class ReadDataFromFile
{
	public static void main(String args[])throws Exception
	{
		Scanner sc=new Scanner(System.in);
		FileReader r=new FileReader("D:/GiriTechHub/File_Handeling/Demo1234/abc.txt");
		int data;

		while((data=r.read())!=-1)
		{
			System.out.println((char)data);
			Thread.sleep(1000);
		}
		
	}
}