/*How to create folder and check folder existence  using a File class
*/
import java.io.File;
public class CreateFolder
{
	public static void main(String args[])
	{
		File f=new File("D:\\webDev\\Demo1234");
		if(f.exists())
		{
			System.out.println("Folder Alredy Exist:");
		}
		else
		{
			boolean b=f.mkdir();
			if(b)
			{
				System.out.println("Folder created Successfully:");
	
			}
			else
			{
				System.out.println("there is some problem in File:");
			}
		}
	}
}