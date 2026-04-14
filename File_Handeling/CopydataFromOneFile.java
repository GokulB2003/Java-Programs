import java.util.*;
import java.io.*;
public class CopydataFromOneFile
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
	
		
		try
		{
		File f=new File("D:\\GiriTechHub\\Revision_plan\\abcd.txt");	
		FileReader fr=new FileReader("D:\\GiriTechHub\\Revision_plan\\abc.txt");
		FileWriter fw=new FileWriter("D:\\GiriTechHub\\Revision_plan\\abcd.txt");

		BufferedReader br=new BufferedReader(fr);
		BufferedWriter bf=new BufferedWriter(fw);
			
			System.out.println("Enter the data");
			String str=sc.nextLine();
			
			fw.write(str);
			fw.close();
			
			String data;
			while((data=br.readLine())!=null)
			{
				fw.write(data);
				//fw.newLine();
				
			}
			br.close();
			bf.close();
			
			int d=0;
			FileReader newfr=new FileReader(f);//Jevdhe aaplyaala FileReader paahije tevdhe use karu shakto
			while((d=newfr.read())!=-1)
			{
				System.out.println((char)d);
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
	}
}