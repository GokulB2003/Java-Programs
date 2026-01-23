import java.util.*;
import java.io.File;
public class AllFilesAndFolder
{
	public static void main(String args[])
	{
		File f1=new File("D:\\GiriTechHub\\File_Handeling");
		 File result[]=f1.listFiles();

		for(int i=0; i<result.length; i++)
		{
			if(result[i].isDirectory())
			{
				System.out.println("folder:"+result[i]);
			}
			else
			System.out.println(result[i]);
		}
		
		
	}
}