//Diamond of numbers

import java.util.*;
public class DiamondOfNum
{
	public static void main(String args[])
	{
		for(int i=1; i<=9; i++)
		{	Boolean flag=true;
			int k=1;
			for(int j=1; j<=9; j++)
			{
				if(i<=5)
				{	if(j>=6-i && j<=i+4 && flag==true)
					{
						System.out.print(k);
						k++;
						flag=false;
					}
					else if(flag==false)
					{
						System.out.print(" ");
						flag=true;
					}
					else
					{
						System.out.print(" ");
					}
										
				}
				else
				{	
					if(j>=(i-4) && (j<=(14-i) && flag==true))
					{
						System.out.print(k);
						k++;
						flag=false;
					}
					else if(flag==false)
					{
						System.out.print(" ");
						flag=true;
					}
					else
					{
						System.out.print(" ");
					}

										
				}
			}			
			System.out.println();
		}
	}
}