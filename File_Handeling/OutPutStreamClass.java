import java.util.*;
import java.io.*;
public class OutPutStreamClass
{
	public static void main(String args[])
	{
		try{
			FileOutputStream os=new FileOutputStream("D:\\GiriTechHub\\File_Handeling\\a.txt");
			//os.write("abc");//Error
			os.write(65);
			os.write(97);
			byte b1[]={'F','I','L','E','H','A','N','D','L','I','N','G'};
			os.write(b1);
			os.write(b1,0,4);
			System.out.println("Data written successfully");
		}
		catch(IOException e)
		{
			System.out.println(e.getMessage());
		}
	}
}