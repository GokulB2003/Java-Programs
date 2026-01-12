/*
    Q3. Write a java program to print this pattern. 
 
1 
2 * 2 
3 * 3 * 3 
4 * 4 * 4 * 4 
3 * 3 * 3 
2 * 2 
1

*/

import java.util.*;
public class Q3
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);	//used for takes input Scanner class
		for(int i=1; i<=7; i++)
		{
			boolean flag=true;
			for(int j=1; j<=7; j++)
			{	
				if(i<=4)
				{
					if(j<=(i*2)-1 && flag)
					{
						System.out.print(i);
						flag=false;
					}
					else if(flag==false && j<=(i*2)-1)
					{
						System.out.print("*"+" ");
						flag=true;
					}
					else
					{
						System.out.print(" ");
					}
				}
				else if(i>4)
				{	
					if(j<=(11-i) && flag)
					{
						System.out.print((8-i)+" ");
						flag=false;
					}
					else if(j<(11-i) && flag==false)
					{
						System.out.print("*");
						flag=true;
					}
					else
					{
						System.out.print(" ");
					}
				}
				else
				{
					System.out.print(" ");
				}
					
			}
			System.out.println();
		}

	}
}