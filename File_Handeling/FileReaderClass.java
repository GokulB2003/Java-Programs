/*FileReader*/
import java.util.*;
import java.io.*;
public class FileReaderClass
{
	public static void main(String args[])
	{
		File f=new File("D:\\GiriTechHub\\File_Handeling\\a.txt");
		try
		{
			if(f.exists())
			{
				System.out.println("File is alredy Exist:");
			}
			else
			{
				Boolean b=f.createNewFile();
				if(b)
				{
					System.out.println("File is created successfully:");
				}
				else
				System.out.println("there is some Problem");
			}
			//Write data in File...
			FileWriter a=new FileWriter(f);
			BufferedWriter bf=new BufferedWriter(a);
			
			bf.write("Akolner AhilyaNagar");
			bf.newLine();
			bf.write("Pin-code:414005");
			bf.close();
			a.close();
			FileReader fr=new FileReader(f);
			int data;
			while((data=fr.read())!=-1)
			{
				System.out.print((char)data);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}


	}
}