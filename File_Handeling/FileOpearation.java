import java.util.*;
import java.io.File;
public class FileOpearation
{
	public static void main(String args[])
	{
		File root[]=File.listRoots();
		for(int i=0; i<root.length; i++)
		{
			System.out.println(root[i]);//c drive
			long totalSpace=root[i].getTotalSpace();
			long freeSpace=root[i].getFreeSpace();
			System.out.println(totalSpace/(1024*1024*1024)+"GB");
		System.out.println(freeSpace/(1024*1024*1024)+"GB");
			
		}		
		
	}
}