/**/
/*FileReader*/
import java.util.*;
import java.io.*;
public class FileBufferReader
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
			BufferedReader br=new BufferedReader(fr);
			//It contains readLine method..
			String data;
			while((data=br.readLine())!=null)
			{
				System.out.println(data);
			}
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}


	}
}